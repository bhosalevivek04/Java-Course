import java.util.Arrays;
import java.util.List;

public class methodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vivek", "Vishal", "Tejas");
        List<String> uNames = names.stream()
                .map(String::toUpperCase) // this is method Reference /* .map(name->name.toUpperCase())*/
                .toList();
        uNames.forEach(System.out::println);
    }
}