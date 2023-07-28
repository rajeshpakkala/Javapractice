class Flight{
   public void takeoff(){
        System.out.println("flight fly");
    }
    public void transport(){
        System.out.println("flight carries some instruments");
    }
}
class Flight1 {
   public void takeoff(){
        System.out.println("flight fly");
    }
    public void transport(){
        System.out.println("flight carries some instruments");
    }
}
class Flight2 {
    public void takeoff(){
        System.out.println("flight fly");
    }
   public void transport(){
        System.out.println("flight carries some instruments");
    }
}
class Airport{
    public void permit(Flight ref){
        ref.takeoff();
        ref.transport();
    }
}
public class Poly {
    public static void main(String[]args){





    }
}
