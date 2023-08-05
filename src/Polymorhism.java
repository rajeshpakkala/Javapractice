class Animal{
    public void eat(){
        System.out.println("animals eat based on their taste");
    }
    public void running(){
        System.out.println("animals run based on their capacity");
    }
}
class Tiger extends Animal{
    public void eat(){
        System.out.println("eats meat");
    }
    public void running(){
        System.out.println("faster");
    }
}
class Cheetah extends Animal{
    public void eat(){
        System.out.println("eats grass");
    }
    public void running(){
        System.out.println("runs very faster");
    }
}

class Poly1{
    public void permit(Animal ref){
    ref.eat();
    ref.running();
}
}

public class Polymorhism {
    public static void main(String[]args){
        Animal a=new Animal();
        Cheetah c=new Cheetah();
        Tiger t=new Tiger();

        Poly1 p=new Poly1();
        p.permit(a);
        p.permit(t);
        p.permit(c);

    }
}
