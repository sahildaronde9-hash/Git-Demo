import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,40,20,50,80,70,30,60);
        System.out.println("Without Sorting>> "+list);

        Collections.sort(list);
        System.out.println("After Sorting>> "+list);
    }
}
