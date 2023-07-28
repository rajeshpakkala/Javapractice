public class BuffervsBuilder {
    public static void main(String[]args){
         StringBuffer st=new StringBuffer("java");//all methods r synchronized
        StringBuilder sr=new StringBuilder("java");//non-synchronized;
        System.out.println(st.equals(sr));//false not overriden toSting();


    }
}
