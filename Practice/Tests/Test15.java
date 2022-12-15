package Tests;
//Решите задачу, которой учителя мучают многие поколения школьников. Что больше,
//�
//�
//e
//π
//  или
//�
//�
//π
//e
// ?
//
//В ответе выведите соответствующий знак (<, > или =).


public class Test15 {
    public static void main(String[] args) {
        double x = Math.pow(Math.E, Math.PI);
        double y = Math.pow(Math.PI, Math.E);
        if (x > y) {
            System.out.print(">");
        } else if (x < y) {
            System.out.print("<");
        } else {
            System.out.print("=");
        }
    }
}
