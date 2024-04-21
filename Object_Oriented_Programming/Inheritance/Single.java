package Java.Object_Oriented_Programming.Inheritance;
public class Single {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
class Parent{
    int a = 5;
}
class Child extends Parent{
    public void display(){
        System.out.println("a" + a);
    }
}