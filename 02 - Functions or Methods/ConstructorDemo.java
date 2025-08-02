public class ConstructorDemo {
    String name;
    int age;

    // Constructor with parameters
    ConstructorDemo(String n, int a) {
        name = n;
        age = a;
        System.out.println("Constructor called!");
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Object created, constructor will be called automatically
        ConstructorDemo student = new ConstructorDemo("Anirudh", 22);
        student.display();
    }
}
