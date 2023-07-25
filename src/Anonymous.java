abstract class Lorry{
    abstract void show();
}

public class Anonymous {
    public static void main(String[]args){
        Lorry obj=new Lorry(){
            @Override
            public void show(){
                System.out.println("Lorry goods checked successfully");
            }

        };
        obj.show();
    }
}
