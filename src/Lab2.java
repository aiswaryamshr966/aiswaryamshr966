import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aa"); list.add("bb"); list.add("bb");
        list.stream().forEach(System.out::println);
        System.out.println("----------");
        list.stream().forEach(System.out::println);
        System.out.println("----------");
        list.stream().forEach(System.out::println);
    }
}
