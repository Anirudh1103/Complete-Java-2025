public class ThisKeywordDemo {
    String name; //Instance Variable

    ThisKeywordDemo(String name) // Constructor with local variable
    {
        this.name = name; // 'this.name' refers to instance variable here
    }

    void display()
    {
        System.out.println("Name is " + name); //Here we are printing INSTANCE VARIABLE
    }

    public static void main(String[] args) {
        ThisKeywordDemo object = new ThisKeywordDemo("Anirudh");
        object.display();
    }
}
