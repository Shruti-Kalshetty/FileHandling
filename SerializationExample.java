// example of non-Serialization

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ClassNotFoundException;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    transient String password;  // This field will not be serialized

    public Person(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person(1, "Alice", "secret123");

        try (FileOutputStream fos = new FileOutputStream("person.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(person);  // Serialize the object
            System.out.println("Object serialized successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
