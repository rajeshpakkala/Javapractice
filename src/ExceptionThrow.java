import java.util.Scanner;
class UserException extends Exception{
    public UserException(String msg){
        super(msg);
    }
}
class Atm{
    private int accNum=1234;
    private int pasWord=1243;
    int ac;
    int pw;

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your accnum");
        ac=sc.nextInt();
        System.out.println("enter your password");
        pw=sc.nextInt();
    }
    public void verify()throws UserException{


        if(accNum==ac && pasWord==pw){
            System.out.println("happy!collect your cash");
        }
        else{
            UserException use=new UserException("invalid credentials 1 more try");
            System.out.println(use.getMessage());
            throw use;

        }
    }
}
class Bank{
    public void initiate(){
        Atm a=new Atm();
        try{
            a.input();
            a.verify();
        }
        catch(UserException u){
            try{
                a.input();
                a.verify();
            }
            catch(UserException u1){
                try{
                    a.input();
                    a.verify();
                }
                catch(UserException u2){
                    System.out.println("Got it you are a hacker!your card is blocked");
                }
            }
        }
    }
}
public class ExceptionThrow
{

    public static void main(String[] args) throws Exception
    {
        Bank b=new Bank();
        b.initiate();


    }

}

