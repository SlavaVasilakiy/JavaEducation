package HanoiTower;

public class HanoiTower {
    public static void hanoiTower(int n, String source, String target, String buffer) {
        if (n == 1) {
            System.out.printf("%d from %s to %s\n", n, source, target);
            return;
        }
        hanoiTower(n - 1, source, buffer, target);
        System.out.printf("%d from %s to %s\n", n, source, target);
        hanoiTower(n - 1, buffer, target, source);
    }
}
