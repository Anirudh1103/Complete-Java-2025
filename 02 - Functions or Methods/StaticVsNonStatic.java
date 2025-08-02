public class StaticVsNonStatic {

    // static variable shared among all instances
    static int counter = 0;

    // non-static variable (each object has its own copy)
    int id;

    //The below method is constructor whenever an object is created this method  will be called
    StaticVsNonStatic() {
        counter++;
        id = counter;
    }

    void showId() {
        System.out.println("Object ID: " + id);
    }

    static void showCounter() {
        System.out.println("Total objects created: " + counter);
    }

    public static void main(String[] args) {
        StaticVsNonStatic obj1 = new StaticVsNonStatic();
        StaticVsNonStatic obj2 = new StaticVsNonStatic();

        obj1.showId();
        obj2.showId();

        // Call static method to get shared counter value
        StaticVsNonStatic.showCounter();
    }
}
