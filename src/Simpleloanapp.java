import java.util.Scanner;

class Farmer{
    float principle;
    static float rate;
    float time;
    float Totalsimpleintrest;

    static{
        rate=2.5f;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle you want:");
        principle=sc.nextFloat();
        System.out.println("Enter time duration in years:");
        time=sc.nextFloat();

    }
    public void compute(){
        Totalsimpleintrest=(principle*time*rate)/100;
    }
    public void disp(){
        System.out.println("Total is"+" "+ Totalsimpleintrest);
    }
}
public class Simpleloanapp {
    public static void main(String[]args){
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();
        Farmer f3=new Farmer();
        Farmer f4=new Farmer();
        f1.input();
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();

        f3.input();
        f3.compute();
        f3.disp();

        f4.input();
        f4.compute();
        f4.disp();
    }
}
