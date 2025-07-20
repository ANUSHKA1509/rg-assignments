import java.util.Optional;
public class OptionalEx {
    public static void main(String[] args) {
        String name = "Anushka";
        Optional<String> optionalName = Optional.ofNullable(name);

        // Case 1: Check if value is present
        if (optionalName.isPresent()) {
            System.out.println("Name is: " + optionalName.get());
        } else {
            System.out.println("Name is not available.");
        }

        // Case 2: Using orElse to provide a default
        String maybeNull = null;
        String finalName = Optional.ofNullable(maybeNull).orElse("Default Name");
        System.out.println("Final Name: " + finalName);

        // Case 3: Using ifPresent with Lambda
        optionalName.ifPresent(n -> System.out.println("Hello, " + n + "!"));
    }
}

