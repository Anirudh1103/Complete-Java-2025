public class ArgumentDemo {
    // Function with parameters
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        ArgumentDemo obj = new ArgumentDemo();
        obj.add(10, 20); // passing arguments
    }
}
