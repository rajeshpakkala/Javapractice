public class Mutablestrings {
    public static void main(String[]args){
        StringBuffer sb=new StringBuffer("sachin");
        sb=sb.append("India");
        System.out.println(sb);//changed
        System.out.println(sb.capacity());

        sb.append("he played cricket very well");
        System.out.println(sb);
        System.out.println(sb.capacity());

        StringBuilder sd=new StringBuilder("Sachin");
        sd=sd.append("Cricket playing");
        System.out.println(sd);
        System.out.println(sd.capacity());

        StringBuffer sb1=new StringBuffer("Sachin");
        StringBuilder sd2=new StringBuilder("Sachin");
        System.out.println(sb1.equals(sd2));//toString() method not overriden here but with string class overriden;

    }
}
