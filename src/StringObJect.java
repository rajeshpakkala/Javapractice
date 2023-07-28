public class StringObJect {
    public static void main(String[]args){
        String str=new String("rajesh");//heap
        String str2=new String("rajesh");//heap duplicate
        String str1="rajesh";//scp
        String strr="rajesh";//string pool no duplicate


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str);
        System.out.println(strr);
    }
}
