@FunctionalInterface
interface Operation {
    int execute(int a, int b);
}

public class LambdaAndFunctionalRelation {
    public static void main(String[] args) {
        // Lambda assigned to a functional interface
        Operation add = (a, b) -> a + b;
        Operation multiply = (a, b) -> a * b;

        System.out.println("Sum of 4 and 5: " + add.execute(4, 5));
        System.out.println("Product of 4 and 5: " + multiply.execute(4, 5));
    }
}