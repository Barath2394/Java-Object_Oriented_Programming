package Java-Object_Oriented_Programming.Object_Oriented_Programming.Collections;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println(fruits);

        fruits.add(2,"Watermelon");

//        Adding at the front
        fruits.addFirst("Strawberry");

        System.out.println(fruits);

//        Adding elements at the last

        fruits.addLast("Pineapple");

        System.out.println(fruits);
    }
}
