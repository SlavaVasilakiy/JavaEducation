import java.io.File;

/**
 * Имитация чата, главная задача составить архитектуру классов и методов
 */
public class App {
    public static void main(String[] args) {
        Chat gb = new Chat();
        FileSave f = new FileSave();

        User client1 = new User("Вася", gb);
        User client2 = new User("Маша", gb);
        User client4 = new User("Вальдемар", gb);

        gb.appendClient(client1);
        gb.appendClient(client2);
        gb.appendClient(client4);

        client1.sendMsg("привет всем!");

        client2.sendMsg("ку-ку!");

        User client3 = new User("Коля", gb);
        gb.appendClient(client3);

        client3.sendMsg("hello world!");
        client3.sendMsg("Котик", 3.3);

    }
}
