package Java.Object_Oriented_Programming;
public class Multilevel {
    public static void main(String[] args) {
        B obj = new B();
        obj.dispaly();

    }
}
class A{
    int a;
    public A() {
       a = 5;
    }
}
class B extends A{
    int a = 10;
    void dispaly(){
        System.out.println(a);
        System.out.println(super.a);
    }

}