interface Vehicle{
    public abstract void show();
}

public class AnonymousInterface {
    public static void main(String[]args){
        Vehicle obj=new Vehicle(){
            @Override
            public void show(){
                System.out.println("vehicle goods checked successfully");
            }

        };
        obj.show();
    }
}
