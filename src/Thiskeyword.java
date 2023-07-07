class Dog {
   private int age;
    private String name;
    private int cost;
    public Dog(){
        this("Puppy");
    }
    public Dog(String name,int age,int cost){

        this.name=name;
        this.age=age;
        this.cost=cost;

    }
    public Dog(String name){
        this("sheeru",5,6666);
      this.name=name;

    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age=age;
    }
    int getCost(){
        return cost;
    }
    void setCost(int cost){
        this.cost=cost;
    }
}

    public class Thiskeyword {
    public static void main(String[]args){
                Dog obj=new Dog();
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getCost());
    }

}
