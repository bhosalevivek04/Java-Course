import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vivek", "Vishal", "Tejas");
        String name = names.stream()
                .filter(str -> str.contains("T"))
                .findFirst()
                .orElse("Not Found!");

        System.out.println(name);
    }
}
