# Interface Segregation Principle

### Wrong sample

```java
public interface BuildComputer {
    void addMotherBoard();
    void addProcessor();
    void addMemory();
    void addHardDrive();
}
```

```java
public class AddHardDrive implements BuildComputer{
    @Override
    public void addMotherBoard() {
    }
    @Override
    public void addProcessor() {
    }
    @Override
    public void addMemory() {
    }
    @Override
    public void addHardDrive() {
        System.out.println("Hard Drive added");
    }
}
```

```java
public class AddMemory implements BuildComputer{
    @Override
    public void addMotherBoard() {
    }
    @Override
    public void addProcessor() {
    }
    @Override
    public void addMemory() {
        System.out.println("Memory added");
    }
    @Override
    public void addHardDrive() {
    }
}
```

```java
public class AddProcessor implements BuildComputer{
    @Override
    public void addMotherBoard() {
    }
    @Override
    public void addProcessor() {
        System.out.println("Processor added");
    }
    @Override
    public void addMemory() {
    }
    @Override
    public void addHardDrive() {
    }
}
```

```java
public class AddMotherBoard implements BuildComputer{
    @Override
    public void addMotherBoard() {
        System.out.println("MotherBoard added");
    }
    @Override
    public void addProcessor() {
    }
    @Override
    public void addMemory() {
    }
    @Override
    public void addHardDrive() {
    }
}
```
_One interface **BuildComputer** contains many methods that must be implemented <br> 
inherited classes **AddHardDrive**, **AddMemory**, **AddProcessor**, **AddMotherBoard**, <br>
regardless of whether they use these methods or not._

<br>
<br>

### Right sample

```java
public interface IhardDrive {
    void addHardDrive();
}
```

```java
public interface Imemory {
    void addMemory();
}
```

```java
public interface Iprocessor {
    void addProcessor();
}
```

```java
public interface ImotherBoard {
    void addMotherBoard();
}
```

```java
public class AddHardDrive implements IhardDrive{
    @Override
    public void addHardDrive() {
        System.out.println("Hard Drive added");
    }
}
```

```java
public class AddMemory implements Imemory{
    @Override
    public void addMemory() {
        System.out.println("Memory added");
    }
}
```

```java
public class AddProcessor implements Iprocessor{
    public void addProcessor() {
        System.out.println("Processor added");
    }
}
```

```java
public class AddMotherBoard implements ImotherBoard{
    public void addMotherBoard() {
        System.out.println("MotherBoard added");
    }
}
```
The correct solution is to separate interfaces into highly specialized <br>
to eliminate dependencies.