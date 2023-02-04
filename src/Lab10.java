import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lab10 {
    public static void main(String[] args) {
        Stream<Integer> intstream2 = Stream.of(5, 10, 15, 1, 4);
        int sum = intstream2.reduce(1, (i1,i2)->i1*i2);
        System.out.println("Multiplication = " + sum);
        System.out.println("----------------");

        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bb");
        list.add("ccccc");

        String s = list.stream()
                .map(s1->s1.toUpperCase())
                .reduce("", (s1,s2)->s1+s2);
        System.out.println("List Concat =" + s);
        System.out.println("----------------");
    }
}
