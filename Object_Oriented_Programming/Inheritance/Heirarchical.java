package Java.Object_Oriented_Programming.Inheritance;

public class Heirarchical {
    public static void main(String[] args) {
        First obj = new Third();
        Second obj1 = new Four();

    }
}
class First{
    First(){
        System.out.println("Im in the first");
    }
}
class Second extends First{
    Second(){
        System.out.println("I am in the second And i inherit the class First");
    }
}
class Third extends First{
    Third(){
        System.out.println("I am in the third and i also inherit the first");
    }
}
class Four extends Second{
    Four(){
        System.out.println("I am in the fourth");
    }
    
}
