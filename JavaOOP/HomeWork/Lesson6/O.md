# Open-Closed Principle

### Wrong sample
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

_In this example, the problem is that to add <br> 
functionality, you will have to modify the classes._

<br>
<br>

### Right sample
```java
public interface ISave {
    public void save(String path, Computer cmp);
}
```

```java
public class SaveComputerToFile implements ISave {
    @Override
    public void save(String path, Computer cmp) {
        System.out.println("Save to file " + path + ", " + cmp);
    }
}
```

```java
public class SaveComputerToDB implements ISave {
    @Override
    public void save(String path, Computer cmp) {
        System.out.println("Save to DB " + path + ", " + cmp);
    }
}
```

<br>

```java
public interface ILoad {
    public void load(String path, Computer cmp);
}
```

```java
public class LoadComputerFromFile implements ILoad {
    @Override
    public void load(String path, Computer cmp) {
        System.out.println("Load from File " + path + ", " + cmp);
    }
}
```

```java
public class LoadComputerFromDB implements ILoad {
    @Override
    public void load(String path, Computer cmp) {
        System.out.println("Load from File " + path + ", " + cmp);
    }
}
```

_To avoid this problem, we have created interfaces **ISave**, **ILoad**,_ <br>
_with method save, load. And now to expand the functionality we need_ <br>
_only add the necessary classes by implementing interfaces_.