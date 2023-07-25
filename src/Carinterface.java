interface Car {
    public abstract void speed();
    public abstract void gears();

    }
abstract class Nano implements Car{
    public void speed(){
        System.out.println("speed is very good");
    }
}
class Suzuki extends Nano{
    public void gears(){
        System.out.println("It has 5 gears also");
    }
}
public class Carinterface{
    public static void main(String[]args){
        Car obj=new Suzuki();
        obj.speed();
        obj.gears();
    }
}