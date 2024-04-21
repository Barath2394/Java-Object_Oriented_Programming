package Java.Object_Oriented_Programming.PolyMorphism;
public class OverLoading {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(2,3,4));
    }
    static int add(int a,int b){
        int c = a+b;
        return c;
    }
    static int add(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }
}