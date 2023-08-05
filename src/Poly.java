class Flight{
   public void takeoff(){

       System.out.println("flight fly");
    }
    public void transport(){

       System.out.println("flight carries some instruments");
    }
}
class Cargoplane extends Flight{
   public void takeoff(){
        System.out.println("flight fly with load");
    }
    public void transport(){
        System.out.println("flight carries some mobile and vehicle");
    }
}
class Fighterplane extends Flight {
    public void takeoff(){
        System.out.println("flight fly for war");
    }
   public void transport(){
        System.out.println("flight carries bombs and war instruments");
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
        Flight f=new Flight();
        Fighterplane ft=new Fighterplane();
        Cargoplane cp=new Cargoplane();

        Airport a=new Airport();
        a.permit(f);
        a.permit(ft);
        a.permit(cp);

    }
}
