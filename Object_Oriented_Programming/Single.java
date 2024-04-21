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
    void display(){
        System.out.println("a" + a);
    }
}