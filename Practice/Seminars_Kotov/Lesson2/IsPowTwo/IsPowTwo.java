package IsPowTwo;

public class IsPowTwo {
    public static void main(String[] args) {
        PowSolution pow = new PowSolution();
        boolean result = pow.isPowerofTwo(64);
        System.out.println(result);
    }
}

class PowSolution {
    public boolean isPowerofTwo(int n) {
        if (n == 1) return true;

        if (n <= 0 || n % 2 == 1) {
            return false;
        }
        return isPowerofTwo(n / 2);
    }
}



