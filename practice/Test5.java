import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int result = 0;
        while (sc.hasNext() == true) {
            int n = sc.nextInt();
            if (n % 11 == 0){
                count++;
                if (n % 3 == 0) {
                    result += n;
                }
            }
        }
        System.out.println(count);
        System.out.println(result);
    }
}

//}
//class Sums {
//
//}