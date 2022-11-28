package practice;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
//        if (age == 10) {
//            System.out.println("ты учишься в школе");
//        } else if (age == 18) {
//            System.out.println("ты закончил школу");
//        }
        switch(age) {
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты пошел в школу");
                break;
            case 18:
                System.out.println("ты закончиил школу");
                break;
            default:
                System.out.println("ни одно из условий не подошло");
        }
    }
}
