// Part b: Serialization and Deserialization of a Student Object
import java.io.*;

// Student class must implement Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L;  // Good practice for Serializable classes
    
    private int id;
    private String name;
    private double marks;

    // Constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Display method
    public void display() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
    }
}

public class StudentSerializationDemo {
    public static void main(String[] args) {
        String filename = "student.ser";

        // Create a Student object
        Student s1 = new Student(101, "Rahul Sharma", 89.5);

        // -------- Serialization --------
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(s1);
            System.out.println("Serialization successful! Student object saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e);
        }

        // -------- Deserialization --------
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("\nDeserialization successful! Student object restored:\n");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e);
        }
    }
}

