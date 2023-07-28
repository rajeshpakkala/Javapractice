public class FinalkwString {
    public static void main(String[]args){
        final String st=new String("java");
        String st2="learning";

        //st=st.concat(st2);//not possible to reassign a variable.
        String st3=st.concat(st2);
        System.out.println(st3);
    }
}
