import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] name = {"곰", "호랑이", "토끼"};

        Arrays.stream(name).forEach(n -> System.out.println(n));

        Arrays.stream(name).forEach(System.out::println);
    }
}
