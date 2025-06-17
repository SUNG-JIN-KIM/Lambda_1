@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);

}

public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println(add.operate(2,5));
        System.out.println(multiply.operate(2 ,4));
    }
}
