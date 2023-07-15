
class Instanceblock{
    int a;
    int b;
    static int count;
    {
        count++;
    }
    public Instanceblock(){

    }

    public Instanceblock(int a,int b){

    }
}
public class Useofinstanceblock {
    public static void main(String[]args){
        Instanceblock ib1=new Instanceblock();
        System.out.println(Instanceblock.count);
        Instanceblock ib2=new Instanceblock();
        System.out.println(Instanceblock.count);

        Instanceblock ib4=new Instanceblock(5,10);
        System.out.println(Instanceblock.count);



    }
}
