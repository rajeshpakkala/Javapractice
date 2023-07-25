class Outer{
    public void disp(){
        System.out.println("it is a outer class method");

    }
    static class Inner{
        public void show(){
            System.out.println("show product details");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[]args){
        Outer obj=new Outer();
        obj.disp();
        //non static inner class
        //Outer.Inner obj1=obj.new Inner();
        //static class calling
        Outer.Inner obj1=new Outer.Inner();

        obj1.show();
    }
}
