// На вход подаются три слова на одной строке, разделённые пробелом. Выведите их в алфавитном порядке. Гарантируется, что слова начинаются с разных букв.
package Tests;

import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        char a = str1.charAt(0);
        char b = str2.charAt(0);
        char c = str3.charAt(0);
        if ((a < b) && (a < c) && (b < c)) {
            System.out.println(str1 + "\n" + str2 + "\n" + str3);
        }
        if ((b < a) && (a < c) && (b < c)) {
            System.out.println(str2 + "\n" + str1 + "\n" + str3);
        }
        if ((c < a) && (a < b) && (c < b)) {
            System.out.println(str3 + "\n" + str1 + "\n" + str2);
        }
        if ((a < b) && (a < c) && (c < b)) {
            System.out.println(str1 + "\n" + str3 + "\n" + str2);
        }
        if ((b < c) && (b < a) && (c < a)) {
            System.out.println(str2 + "\n" + str3 + "\n" + str1);
        }
        if ((c < b) && (c < a) && (b < a)) {
            System.out.println(str3 + "\n" + str2 + "\n" + str1);
        }

    }
}