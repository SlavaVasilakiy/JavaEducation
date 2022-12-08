package semminars.Lesson1;

public class program_1_3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        System.out.println(taskOne(a, b));

    }

    static int taskOne(int a, int b) {
        int c = 2;
        int d = 1;
        if (a == b)
            return 1;
        if (a > b)
            return 0;
        else
            return taskOne(a + d, b) + taskOne(a * c, b);
    }
}