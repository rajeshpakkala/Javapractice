public class Stringcomparision {
    public static void main(String[]args){
        String str="Java rajesh";
        String str1="Java Rajesh";
        System.out.println(str==str1);//compare references (memory add)//F
        System.out.println(str.equals(str1));//compare original values (literals).//F

        String str3="Java Rajesh";//T
        String str4="Java Rajesh";//T
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        String str5=new String("JavaRajesh");
        String str6="JavaRajesh";
        System.out.println(str5==str6);//F
        System.out.println(str5.equals(str6));//T

        String st=new String("rajesh");
        String st1=new String("Rajesh");
        System.out.println(st.equalsIgnoreCase(st1));

        String s="Java is a oop language";
        String s1="Java is a oop Language";
        int res=s.compareTo(s1);//get int value
        if(res==0){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }

        System.out.println(s==s1);
        System.out.println(s.equals(s1));


    }
}
