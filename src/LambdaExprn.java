interface Bus{
    public abstract void show();
}

public class LambdaExprn {
    public static void main(String[]args){
        Bus obj=()->System.out.println("lambda exprn");

    }
}

