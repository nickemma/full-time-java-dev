package DSA;

import java.util.*;

public class DataStructuresDemo {

    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }


    public static void setDemo(){
        Set <String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("watermelon");


        System.out.println(fruits);

        fruits.remove("apple");
        System.out.println(fruits);

    }

    public static void listDemo() {
        List <String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("watermelon");

        // advance iterator
        for (String fruit : fruits) {
            System.out.println("am here "+ fruit);
        }
        System.out.println(fruits);

        fruits.set(2, "grape");
        System.out.println(fruits);
        fruits.add("lemon");
        fruits.add("mango");
        fruits.remove("lemon");
        System.out.println(fruits);

    }

    public static void queueDemo() {
        Queue <String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("watermelon");

        // advance iterator
        fruits.forEach(f-> System.out.println("wow this is sweet " + f));
        System.out.println(fruits);

        fruits.remove();
        System.out.println(fruits);
    }

    public static void mapDemo() {
        Map <String, Integer> fruitCalories = new HashMap<>();

        fruitCalories.put("apple", 99);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("orange", 55);
        fruitCalories.putIfAbsent("lemon", 30);

        // advance iterator
        for(Map.Entry caloryInfo : fruitCalories.entrySet()){
            System.out.println("key and value printed here " + caloryInfo.getKey() + ": " + caloryInfo.getValue());

        }
        System.out.println(fruitCalories);

        fruitCalories.remove("lemon");
        System.out.println(fruitCalories);

        // getting a single value
        System.out.println("the value is " + fruitCalories.get("apple"));
    }
}
