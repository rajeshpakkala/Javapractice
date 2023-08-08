import java.util.Scanner;
class Exceptionoverage extends Exception{
    public Exceptionoverage(String msg){
    super(msg);
}
}
class Underageexception extends Exception{
    public Underageexception(String msg){
        super(msg);
    }
}
class Rto{
    int age;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
         age=sc.nextInt();
    }
    public void verify() throws Underageexception, Exceptionoverage{
        if(age<18){
            Underageexception un=new Underageexception("you have more time cool");

            System.out.println(un.getMessage());
            throw un;
        }
        else if(age>60){
            Exceptionoverage oe=new Exceptionoverage("your time is near dont hurry");
            System.out.println(oe.getMessage());
            throw oe;

        }
        else {
            System.out.println("your eligible to driving licence");
        }
    }

}
class Acceptlicense {
    public void initiate() {
        Rto accept = new Rto();
        try {
            accept.input();
            accept.verify();
        } catch (Exceptionoverage et) {
            try {
                accept.input();
                accept.verify();
            } catch (Exception ee) {
                System.out.println("you are blocked");
            }
        } catch (Underageexception uu) {
            try {
                accept.input();
                accept.verify();
            } catch (Exception e) {
                System.out.println("your are blocked");
            }

        }

    }
}
public class DrivingLicenceException {
    public static void main(String[]args){
        Acceptlicense r=new Acceptlicense();
            r.initiate();
        }
    }

