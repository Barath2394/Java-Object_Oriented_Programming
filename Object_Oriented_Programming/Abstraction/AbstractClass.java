package Java.Object_Oriented_Programming.Abstraction;
public class AbstractClass {
    public static void main(String[] args) {
        Hp lap = new Hp();
        lap.turnON();
    }
}
abstract class Computer{
    void turnON(){
        System.out.println("Turning On");
    }
}
class Hp extends Computer{
    void turnON(){
        System.out.println("Hp TurnsON");
    }
}