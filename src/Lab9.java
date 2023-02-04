import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab9 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Aiswarya", "Amar", "Soumya");
        List<String> list2 = Arrays.asList("Angan", "Sushree");
        List<String> list3 = Arrays.asList("Subhashree", "Swapna", "Sagarika", "Subham");
        List<List<String>> list = new ArrayList<>();
        list.add(list1); list.add(list2);list.add(list3);
        System.out.println("------------------------Original List ------------------------");
        list.forEach(System.out::println);
        System.out.println("------------------------Simple Map ------------------------");
        list.stream().map(e->e.size()).forEach(System.out::println);
        System.out.println("------------------------Flat Map ------------------------");
        list.stream().flatMap(l->l.stream()).forEach(System.out::println);

    }
}
