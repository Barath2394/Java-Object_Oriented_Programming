package Java.Object_Oriented_Programming.Encapsulation;

class Info{
    private String name;
    private int roll;

    public void setfun(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
    public void getfun(){
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
    }
}
public class Bundling {
    public static void main(String[] args) {
        Info obj = new Info();
        obj.setfun("Barath",11);
        obj.getfun();
    }
}
