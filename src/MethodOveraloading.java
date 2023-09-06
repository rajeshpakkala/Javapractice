public class MethodOveraloading {


    public int method(int a,int b){
        int d=a+b;
        return d;
    }
    public double method(double a,double b,double c){
        double d=a+b+c;
        return d;
    }
    public float method(float a,float b,float c,float e)
    {
        float d=a+b+c+e;
        return d;
    }
    public static void main(String[] args) {
        MethodOveraloading p=new MethodOveraloading();

       float result= (p.method(2,3,4,5));
        System.out.println(result);
    }

    }
