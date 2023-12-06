import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FinalVariableInitTest {

    private int aa=5;
    private final int bb;
    {
        bb=aa;
        System.out.println(bb);
    }
    public static void main(String[] args) {
        FinalVariableInitTest ff = new FinalVariableInitTest();

      Predicate<String> p = s->s.length()>5;

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(25);

        List<Integer> newList = new ArrayList<Integer>();
        newList = list.stream().filter(i->i>15).collect(Collectors.toList());
        newList.stream().forEach(x->System.out.println(x));

        list.stream().filter(i->i>15).forEach(x->System.out.println(x));

        list.stream().map(x -> x*x).forEach(i -> System.out.println(i));
    }
}
