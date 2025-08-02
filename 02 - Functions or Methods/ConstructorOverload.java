public class ConstructorOverload {
    ConstructorOverload() {
        System.out.println("No-arg constructor");
    }

    ConstructorOverload(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload();
        ConstructorOverload obj2 = new ConstructorOverload("Hello from Java!");
    }
}
