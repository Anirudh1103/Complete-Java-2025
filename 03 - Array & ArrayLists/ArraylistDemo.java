import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango"); //Adds value into list

        System.out.println(list.get(0)); //Accessing list

        list.set(0, "Kashmiri Apple");
        System.out.println(list);
        list.add("Banana");

        list.remove("Banana"); //or list.remove(2)

        System.out.println(list.size());

        System.out.println(list.contains("Mango")); // Output: true
        System.out.println(list.contains("Banana")); // Output: false

    }
}
