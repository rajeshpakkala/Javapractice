public class Stringconcatenation {
    public static void main(String[]args){
        String str=new String("Java");
        String str1="Learning";
        System.out.println(str);
        str.concat(str1);
        System.out.println(str);

        String str3=new String("Java");
        String str4="Learning";
        System.out.println(str3);
        str3=str3.concat(str4);
        System.out.println(str3);

        String str6="India";
        String str7="GDP 7.0";
        System.out.println(str6.concat(str7));

        String st=new String("America"+" ");
        String st1="need java developers"+" "+"India has more java skilled developers"+"need visas";
        st=st.concat(st1);
        System.out.println(st);

        String s=new String("java");
        System.out.println(s);
        String s1="java"+"python";
        s=s.concat(s1);
        System.out.println(s);

        String s11=new String("java");
        s11="java"+"coding";
        System.out.println(s11);

        String s111=new String("java");
        s111="java"+"coding";
        System.out.println(s111);

    }
}
