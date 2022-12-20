package POW;

public class MyPow {
    public static void main(String[] args) {
        MyPowSolution pow = new MyPowSolution();
        double result = pow.myPow(2, -2);
        System.out.println(result);
    }
}

class MyPowSolution {
    public double myPow(double x, int n) {
        if (n == 0 && x == 0) return 1; // 0 в степени 0 равно 1

        if (x == 0) return 0; // проверка если число равно 0

        if (n == 0) return 1; // если степень нулевая , то возвращаем 1

        if (n < 0) {
            return 1 / x * myPow(1 / x, -(n + 1)); // конструкция для отрицательной степени
        }

        double num = myPow(x, n / 2);

        if (n % 2 == 0) { // если степень четная
            return num * num;
        } else {
            return num * num * x; // если не четная
        }
    }
}