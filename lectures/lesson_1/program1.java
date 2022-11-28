import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine(); // nextLine получение строковых данных
        System.out.printf("Hello, %s!", name);
        iScanner.close();
    }
}