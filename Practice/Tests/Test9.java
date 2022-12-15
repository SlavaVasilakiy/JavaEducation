package Tests;//На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов. Выведите на печать все слова,
// которые начинаются на буквы, идущие по алфавиту между буквами с первой строки (включительно).
// Вывести слова необходимо в том же порядке, в котором они подаются на вход.
//
//Sample Input:
//
//j p
//java python c++ kotlin php sql http css javascript r go
//Sample Output:
//
//java
//python
//kotlin
//php
//javascript

import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bukva1 = sc.next();
        String bukva2 = sc.next();
        int n = bukva1.charAt(0);
        int k = bukva2.charAt(0);
        while (sc.hasNext() == true) {
            String word = sc.next();
            if ((word.charAt(0) >= n) & (word.charAt(0) <= k)) {
                System.out.println(word);
            }
        }
    }
}
