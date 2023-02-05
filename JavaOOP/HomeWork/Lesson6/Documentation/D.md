# Dependency Inversion Principle

### Wrong sample
```java
public class ModelForm {
    int id;
    int age;
    String fullName;

    public ModelForm(int id, int age, String fullName) {
        this.id = id;
        this.age = age;
        this.fullName = fullName;
    }
}
```

```java
public class WebFramework {
    public void save(ModelForm frm) {
        MySQL db = new MySQL();
        db.save(frm);
    }
}
```

```java
public class MySQL {
    public void save(ModelForm frm) {
        System.out.println("Form saved to DB");
    }
}
```

_Classes **WebFramework**, **MySQL** are directly dependent on the class **ModelForm**._

<br>
<br>

### Right sample
```java
public interface IForm {
}
```

```java
public interface ISQL {
    void save(IForm f);
}
```

```java
public class ModelForm implements IForm {
    int id;
    int age;
    String fullName;

    public ModelForm(int id, int age, String fullName) {
        this.id = id;
        this.age = age;
        this.fullName = fullName;
    }
}
```

```java
public class WebFramework {
    public void save(IForm frm) {
        ISQL db = new MySQL();
        ISQL anyDB = new AnySQL();
        db.save(frm);
        anyDB.save(frm);
    }
}
```

```java
public class MySQL implements ISQL {
    public void save(IForm frm) {
        System.out.println("Form saved to DB");
    }
}
```

```java
public class AnySQL implements ISQL {
    public void save(IForm frm) {
        System.out.println("Form saved to any DB");
    }
}
```

_Now our forms and databases are universal._