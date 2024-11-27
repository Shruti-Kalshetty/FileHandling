// Example of Serialization

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Serialization {
    public static void main(String[] args) {
        Person person = new Person(1, "Alice");
        try (FileOutputStream fos = new FileOutputStream("person.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(person);
            System.out.println("Object serialized.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
