import java.util.*;

public class HeterogeniousArray {
    public static void main(String[]args){
                Object[]st=new Object[4];
                st[0]="hello";
                st[1]=123;
                st[2]=33.33;
                st[3]=true;

                String str=(String) st[0];
                int i=(int)st[1];
                double d=(double) st[2];
                boolean b=(boolean) st[3];

                System.out.println(str);
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }

    }

