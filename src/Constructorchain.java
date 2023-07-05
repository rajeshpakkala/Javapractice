class Constructor{
   public Constructor(){
       this(5);
        System.out.println("in constructor");
    }
    public Constructor(int a){
       super();
        System.out.println("in int constrctor");
    }
}
class Constructorch extends Constructor {
   public Constructorch(){
       super();
        System.out.println("in Constructorch");

    }
   public Constructorch(int a){
    this();
        System.out.println("in int Constructorch");
    }
}
public class Constructorchain {
    public static void main (String[]args){
        Constructorch obj=new Constructorch(6);

    }
}

