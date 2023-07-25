class Outerr{
    public void disp(){
        System.out.println("it is a outer class method");

    }
   static class Innerr{
        public void show(){
            System.out.println("show product details");
        }
    }
}
public class Nestedclasses {
    public static void main(String[]args){
        Outerr obj=new Outerr();
        obj.disp();
        //non static inner class
        //Outer.Inner obj1=obj.new Inner();
        //static class calling
        Outerr.Innerr obj1=new Outerr.Innerr();

        obj1.show();
    }
}
