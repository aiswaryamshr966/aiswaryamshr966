import java.util.Arrays;
import java.util.List;

public class Lab3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aiswarya","Chikoo","Subham","Amar","Angan");
        names.stream()
                .filter(s->s.length()>5)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        names.stream()
                .filter(s->s.startsWith("A"))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        names.stream()
                .filter(s->s.startsWith("A") && s.endsWith("a"))
                .forEach(System.out::println);
    }
}
