
class Staticblock{
    int a;
    int b;
    static int x;
    static int y;
    //static block
    static
    {
        x=10;
        y=20;
        System.out.println("in static block");
    }
    //instance block
    {
        a=30;
        b=40;
    }


    public Staticblock()
    {
//		{
//			x=10;
//			y=20;
//			System.out.println("Non Static block/Java Block");
//		}
        System.out.println("Constructor");
    }
    public void disp1(){
        System.out.println("it is a instance method");
    }

    public static void disp()
    {
        System.out.println("Value of a : " + x);
        System.out.println("Value of b : " + y);
    }

    public void disp3()
    {
        System.out.println("Value of x : " + a);
        System.out.println("Value of y : " + b);
    }


}
class StaticNotOverrided extends Staticblock{
    @Override //static methods don't participate overriding but in inheritance
    public  void disp1() {
        super.disp1();
    }
}
public class Statickeyword {
    public static void main(String[]args){
        Staticblock sb=new Staticblock();
        System.out.println(Staticblock.x);
        System.out.println(Staticblock.y);
        System.out.println(sb.a);
        System.out.println(sb.b);
        sb.disp1();
        Staticblock.disp();
        sb.disp3();
        StaticNotOverrided Sn = new StaticNotOverrided();
        Sn.disp1();

    }
}
