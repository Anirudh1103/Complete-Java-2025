class Parent{
    final void show()
    {
        System.out.println("I don't have anything to show");
    }
}
class Child extends Parent{
//    void show()
//    {
//        System.out.println("This method can't be overridden");
//    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();
    }
}
