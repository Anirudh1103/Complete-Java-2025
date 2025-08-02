// import below Collections package
import java.util.Collections;
import java.util.ArrayList;
public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 5; i >= 1; i--) {
            list.add(i);
        }

        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }

}
