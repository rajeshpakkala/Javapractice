public class Stringmethods {
    public static void main(String[]args){
        String str=new String("Java learning");
        String str1="java is easy";
        System.out.println(str.toUpperCase());
        System.out.println(str1.toUpperCase());

        System.out.println(str.toLowerCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str.charAt(2));
        System.out.println(str1.indexOf("a"));

        System.out.println(str.contains("a"));
        System.out.println(str.substring(2,6));
        System.out.println(str.length());
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str1.endsWith("g"));
    }
}
