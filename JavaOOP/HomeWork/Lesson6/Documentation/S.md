# Single Responsibility Principle

### Wrong sample
```java
public class Computer {
    String name;
    int memorySize;
    Computer(String name, int memorySize)  {
        this.name = name;
        this.memorySize = memorySize;
    }
    public void save() {
        System.out.println("Data saved to file");
    }
    public void load() {
        System.out.println("Data loaded from file");
    }
}
```

_Class **Computer** takes over the task of saving and loading_ <br>
_having two methods **save**, **load**. and if we want to save load not only_ <br>
_in one place, then we have to rewrite the class **Computer**._

<br>
<br>

### Right sample
```java
public class Computer {
    String name;
    int memorySize;

    Computer(String name, int memorySize)  {
        this.name = name;
        this.memorySize = memorySize;
    }
}
```

```java
public class SaveComputer {
    public void saveTo(String path, Computer cmp) {
        System.out.println("Save to " + path + ", " + cmp);
    }
}
```

```java
public class LoadComputer {
    public void loadFrom(String path, Computer cmp) {
        System.out.println("Load from " + path + ", " + cmp);
    }
}
```

_Now each class is responsible strictly for its functionality._