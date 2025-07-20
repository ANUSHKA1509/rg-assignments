import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void printName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anushka", "PayPal", "Bootcamp");

        // Using lambda expression
        System.out.println("Using Lambda:");
        names.forEach(name -> printName(name));

        // Using method reference
        System.out.println("\nUsing Method Reference:");
        names.forEach(MethodReference::printName);
    }
}
