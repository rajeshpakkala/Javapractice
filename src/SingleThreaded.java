import java.util.Scanner;
class Banker {
    public void bankdet() {
        System.out.println("process started");
        int acc = 1234;
        int pass = 5678;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number");
        acc = sc.nextInt();
        System.out.println("Enter password");
        pass = sc.nextInt();
        if (acc == 1234 && pass == 5678)
        {
            System.out.println("collect your cash");
        }
        else
        {
            System.out.println("hacker");
        }
    }
}
class Numbers {
        public  void numbers() {
            System.out.print("Printing numbers");
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(i);
            }
        }
}
class Alphabets{
    public  void aplha()

    {
        System.out.println("printing alphabets");
        for (int i = 65; i <= 70; i++)
        {
            System.out.println((char) (i));
        }
    }
        }

public class SingleThreaded {
    public static void main(String[]args){
        Banker b=new Banker();
        Alphabets a=new Alphabets();
        Numbers n=new Numbers();
        b.bankdet();
        a.aplha();
        n.numbers();
    }

}
