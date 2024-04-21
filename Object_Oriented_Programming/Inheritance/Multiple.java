package Java.Object_Oriented_Programming.Inheritance;

interface Father{
    abstract void money();
}
interface Mother{
    abstract void love();
}
class Son implements Father,Mother{
    @Override
    public void money() {
        System.out.println("Father gives me money");
    }
    public void love(){
        System.out.println("Mother gives me love");
    }
}
public class Multiple {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.money();
        obj.love();
    }
}
