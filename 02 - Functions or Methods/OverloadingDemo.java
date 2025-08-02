public class OverloadingDemo {
    // Method 1: No parameters
    void show() {
        System.out.println("Show with no parameters");
    }

    // Method 2: One int parameter
    void show(int a) {
        System.out.println("Show with one int: " + a);
    }

    // Method 3: Two parameters of different types
    void show(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        obj.show();
        obj.show(42);
        obj.show("Hello Overload", 3);
    }
}
