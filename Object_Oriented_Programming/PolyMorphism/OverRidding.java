package Java.Object_Oriented_Programming.PolyMorphism;

public class OverRidding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Insect insect = new Insect();
        insect.eat();
    }
}
class Animal{
    int leg = 4;
    boolean canBark = false;
    public static void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    int leg = 5;
    boolean canBark = true;
    public static void eat(){
        System.out.println("Dog is eating");
    }
}
class Insect extends Animal{
    int leg = 8;
    boolean canBark = false;
    public static void eat(){
        System.out.println("Insect can also eat");
    }
}
