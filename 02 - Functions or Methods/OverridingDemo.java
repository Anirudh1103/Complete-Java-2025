class Animal{
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound()
    {
        System.out.println("Dog barks!!");
    }
}
public class OverridingDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();

        Animal animal2 = new Dog();
        animal2.sound();    //Calls overridden method
        //Output: Dog barks!!
    }
}
