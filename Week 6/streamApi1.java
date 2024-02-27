import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class streamApi1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 2, 6);
        // Predicate<Integer> p=(n) -> n%2==0;

        // Function<Integer,Integer> fun=(Integer n) -> n*2;

        // int result = nums.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> n * 2)
        // .reduce(0, (c, e) -> c + e);

        // System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();
        sortedValues.forEach(n->System.out.println(n));
    }
}
