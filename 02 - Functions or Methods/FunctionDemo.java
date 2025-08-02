public class FunctionDemo {
    // A simple function that prints a greeting message
    void greet() {
        System.out.println("Hello! Welcome to Java functions.");
    }

    public static void main(String[] args) {
        // Create object to call the non-static method
        FunctionDemo demo = new FunctionDemo();
        demo.greet(); // calling the function
    }
}
