import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> linked = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            linked.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("50000 add for " + (endTime - startTime));

        List<Integer> arrayList = new ArrayList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(0,i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("50000 add for " + (endTime - startTime));
    }
}
