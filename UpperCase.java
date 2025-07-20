import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("anushka", "paypal", "bootcamp", "assignment");

        // Convert each name to uppercase using map()
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Original Names: " + names);
        System.out.println("Uppercase Names: " + upperNames);
    }
}

