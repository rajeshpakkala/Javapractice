
interface Audidemo {
    public static final String rate = "35lakhs";

    public abstract void body();

    public abstract void speed();

    void brake();
}
interface AudiA5{
    void model();
}
class AudiA6 implements Audidemo,AudiA5{
   public void brake(){
        System.out.println("it has strong braking system");
    }
    public void model(){
        System.out.println("its a new brand model");
    }
   public void body(){
        System.out.println("it has strong body in the car industry");
    }
    public void speed(){
        System.out.println("its main advantage is speed and safety");
    }
}
public class Mutlipleinhinterface {
    public static void main(String[]args){
        AudiA6 obj=new AudiA6();
        obj.speed();
        obj.model();
        obj.body();
        obj.brake();

    }

}
