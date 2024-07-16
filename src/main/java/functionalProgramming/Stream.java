package functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class Stream {

    static List <String> veggies = List.of(
            "spinach",
            "cabbage",
            "green beans",
            "carrots"
    );

    public static void main(String[] args) {
        int[] numbers = {0, 2, 4, 6, 8, 10};
        Arrays.stream(numbers).parallel().forEach(n -> System.out.println(n + 1 + " "));

        // calling the method
        anyMatchDemo();
        allMatchDemo();
        filterDemo();

        mapDemo();
        reduceDemo();
        intReducedDemo();
        collectDemo();
    }

    public static void anyMatchDemo() {
        boolean anyMatch = veggies.stream().anyMatch(v -> v.contains(" "));
        System.out.println(anyMatch);
    }

    public static void allMatchDemo() {
        boolean allMatch = veggies.stream().allMatch(v -> v.contains("a"));
        System.out.println(allMatch);
    }

    public static void filterDemo() {
        veggies.stream().filter(v -> v.startsWith("c")).forEach(System.out::println);
    }

    public static void mapDemo() {
        veggies.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void reduceDemo() {
        String reduced = veggies.stream().sorted().reduce("", (a, b) -> a + " | " + b);
        System.out.println(reduced);
    }

    public static void intReducedDemo() {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void collectDemo(){
        List<String> endingWithS = veggies.stream().filter(v -> v.endsWith("s")).toList();

        endingWithS.forEach(System.out::println);
    }
}
