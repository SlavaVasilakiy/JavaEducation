import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int num = cs.nextInt();
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }
}
