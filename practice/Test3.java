package practice;

// На вход подаётся три целых числа. Выведите максимальное чётное из них. Если чётных чисел нет, выведите "Чётных чисел нет".

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a == 0 && b == 0 && c == 0) || (a % 2 != 0 && b % 2 != 0 && c % 2 != 0)) {
            System.out.print("Чётных чисел нет");
        }
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            if (a >= b && a >= c) {
                System.out.print(a);
            } else if (b >= a && b >= c) {
                System.out.print(b);
            } else if (c >= a && c >= b) {
                System.out.print(c);
            }
        } else if (a % 2 == 0 && b % 2 == 0) {
            if (a >= b) {
                System.out.print(a);
            } else if (b >= a) {
                System.out.print(b);
            }
        } else if (b % 2 == 0 && c % 2 == 0) {
            if (b >= c) {
                System.out.print(b);
            } else if (c >= b) {
                System.out.print(c);
            }
        } else if (a % 2 == 0 && c % 2 == 0) {
            if (a >= c) {
                System.out.print(a);
            } else if (c >= a) {
                System.out.print(c);
            }
        } else if (a % 2 == 0) {
            System.out.print(a);
        } else if (b % 2 == 0) {
            System.out.print(b);
        } else if (c % 2 == 0) {
            System.out.print(c);
        }
    }
}

/*
 * Variant 2
 * 
 * import java.util.Scanner;
 * 
 * class Example {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * int num1 = in.nextInt();
 * int num2 = in.nextInt();
 * int num3 = in.nextInt();
 * in.close();
 * int max = 0;
 * 
 * if (num1 % 2 == 0) {
 * max = num1;
 * }
 * if (num2 % 2 == 0 && num2 > max){
 * max = num2;
 * }
 * if (num3 % 2 == 0 && num3 > max) {
 * max = num3;
 * }
 * if (num1 % 2 != 0 && num2 % 2 != 0 && num3 % 2 != 0 ) {
 * System.out.print("Чётных чисел нет");
 * }
 * else {
 * System.out.print(max);
 * }
 * }
 * }
 * 
 */

/*
 * Variant 3
 * import java.util.Scanner;
 * class Example {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * int b = sc.nextInt();
 * int c = sc.nextInt();
 * 
 * if (a%2 != 0 && b%2 != 0 && c%2 != 0)
 * {System.out.println("Чётных чисел нет");}
 * else {
 * if (a == 0 && b == 0 && c == 0) {System.out.println(a);}
 * else {
 * if (a == b && b == c ) {System.out.println(a);}
 * 
 * else {
 * if (a >= b && b >=c)
 * {if (a % 2 == 0) {System.out.println(a);}
 * {if (a % 2 != 0 && b % 2 == 0) {System.out.println(b);}
 * {if (a % 2 != 0 && b % 2 != 0) {System.out.println(c);}
 * }
 * }
 * }
 * if (a >= c && c > b)
 * {if (a % 2 == 0) {System.out.println(a);}
 * {if (a % 2 != 0 && c % 2 == 0) {System.out.println(c);}
 * {if (a % 2 != 0 && c % 2 != 0) {System.out.println(b);}
 * }
 * }
 * }
 * 
 * if (b >= a && a >= c)
 * {if (b % 2 == 0) {System.out.println(b);}
 * {if (b % 2 != 0 && a % 2 == 0) {System.out.println(a);}
 * {if (b % 2 != 0 && a % 2 != 0) {System.out.println(c);}
 * }
 * }
 * }
 * if (b >= c && c > a)
 * {if (b % 2 == 0) {System.out.println(b);}
 * {if (b % 2 != 0 && c % 2 == 0) {System.out.println(c);}
 * {if (b % 2 != 0 && c % 2 != 0) {System.out.println(a);}
 * }
 * }
 * }
 * 
 * if (c >= a && a >= b)
 * {if (c % 2 == 0) {System.out.println(c);}
 * {if (c % 2 != 0 && a % 2 == 0) {System.out.println(a);}
 * {if (c % 2 != 0 && a % 2 != 0) {System.out.println(b);}
 * }
 * }
 * }
 * if (c >= b && b > a)
 * {if (c % 2 == 0) {System.out.println(c);}
 * {if (c % 2 != 0 && b % 2 == 0) {System.out.println(b);}
 * {if (c % 2 != 0 && b % 2 != 0) {System.out.println(a);}
 * }
 * }
 * }
 * }
 * }
 * }
 * }
 * }
 */