public class StaticDemo {

    // Static method - belongs to the class, not instance
    static void displayMessage() {
        System.out.println("This is a static method.");
    }

    // Static method with arguments
    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        // No need to create an object, static methods can be called directly
        displayMessage();

        int result = square(5);
        System.out.println("Square of 5 is: " + result);
    }
}
