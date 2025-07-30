import java.util.Arrays;  // For printing arrays

public class NonPrimitiveDataTypesDemo {

    public static void main(String[] args) {

        // 1. String - a sequence of characters
        String name = "Anirudh";
        System.out.println("String Example:");
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());

        // 2. Array - used to store multiple values of same type
        int[] marks = {85, 90, 75, 80};
        System.out.println("\nArray Example:");
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("First mark: " + marks[0]);
        System.out.println("Total subjects: " + marks.length);

        // 3. Class & Object - used to create custom data types
        Student student = new Student("John", 101);  // Creating object
        System.out.println("\nClass & Object Example:");
        student.displayInfo();

        // 4. Wrapper Classes - allow primitives to be used as objects
        Integer age = 20;
        Double height = 5.9;
        Boolean isPassed = true;
        System.out.println("\nWrapper Class Example:");
        System.out.println("Age (Integer): " + age);
        System.out.println("Height (Double): " + height);
        System.out.println("Passed? (Boolean): " + isPassed);

        // 5. Null value - means no value is assigned yet
        String str = null;
        System.out.println("\nNull Example:");
        System.out.println("Value of str: " + str);
        if (str == null) {
            System.out.println("str has no value (it's null)");
        }
    }
}

// Custom class - blueprint for Student objects
class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}
