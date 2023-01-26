import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Node node = new Node();
        Repository repo = new Repository();
        repo.append(new Worker(22, 1234, "Имя_1", "Фамилия_1", new Adress("Sovetov")));
        repo.append(new Worker(22, 1234, "Имя_2", "Фамилия_2", new Adress("Sovetov")));
        repo.append(new Worker(22, 1234, "Имя_3", "Фамилия_3", new Adress("Sovetov")));
        repo.append(new Worker(22, 1234, "Имя_4", "Фамилия_4", new Adress("Sovetov")));
        repo.append(new Worker(22, 1234, "Имя_5", "Фамилия_5", new Adress("Sovetov")));
        System.out.println(repo);
        var worker = repo.getWorkerBy(1);
        worker.firstName = "John";
        worker.adress.adress = "Pupkina";
        System.out.println(repo);
    }
}

class Worker implements Cloneable {
    @Override
    protected Object clone() {
        return new Worker(age, salary, firstName, lastName, (Adress) adress.clone());
    }
    public int age;
    public int salary;
    public String firstName;
    public String lastName;
    public Adress adress;
    public Worker(int age, int salary, String firstName, String lastName, Adress adress) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %s",
                this.getFullName(),
                this.age,
                this.salary,
                this.adress);
    }
}

class Repository {
    private ArrayList<Worker> db;

    public Repository() {
        db = new ArrayList<>();
    }

    public void append(Worker w) {
        db.add((Worker) w.clone());
    }

    public Worker getWorkerBy(int id) {
        return (Worker)db.get(id).clone();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Worker worker : db) {
            sb.append(worker);
            sb.append("\n");
        }
        return sb.toString();
    }
}

class Adress implements Cloneable {
    public String adress;
    public City city;
    public Adress(String adress) {
        this.adress = adress;
    }

    @Override
    protected Object clone() {
        return new Adress(adress);
    }

    @Override
    public String toString() {
        return adress;
    }
}

class City {
    String city;
    Street street;
}

class Street {
    House house;
    String string;
}

class House {
    String house;
}

class Node implements Cloneable {
    Node node;
    Integer value;
    

}