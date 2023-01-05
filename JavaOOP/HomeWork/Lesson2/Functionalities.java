

import java.util.Scanner;

public class Functionalities {

    private final Scanner scanner;

    public Functionalities(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectFunction() {
        System.out.print("Выберите функцию:\n"
                + "1. найти родителей\n"
                + "2. найти детей\n"
                + "3. определите, являются ли два человека братьями и сестрами\n"
                + "4. найти предков\n"
                + "5. редактировать генеалогическое древо\n"
                + "6. показать всех членов генеалогического древа\n"
                + "7. Выход\n"
                + "Введите номер: ");
        return scanner.nextLine();
    }

}
