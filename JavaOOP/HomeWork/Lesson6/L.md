# Liskov Substitution Principle

### Wrong sample

```java
public class Computer {
    String name;
    int memorySize;

    Computer(String name, int memorySize)  {
        this.name = name;
        this.memorySize = memorySize;
    }

    public void setData(String name) {
        this.name = name;
    }
}
```

```java
public class OmenHP extends Computer {
    OmenHP(String name, int memorySize) {
        super(name, memorySize);
    }

    @Override
    public void setData(String name) {
        this.name = name;
        this.memorySize = 12345;
    }
}
```
_Child classes must provide the behavior of the base class._
<br>
_**OmenHP** changed the behavior of the base class **Computer**._
<br>
Child classes can only extend the functionality of the base class, but don't change it.

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

    public void setData(String name) {
        this.name = name;
    }
}
```

```java
public class OmenHP extends Computer {
    OmenHP(String name, int memorySize) {
        super(name, memorySize);
    }

    String something;
    public void someFunctional (String something) {
        this.something = something;
    }
}
```

_As you can see, we can add functionality to child classes, but_ <br>
_do not change it`s default behavior._