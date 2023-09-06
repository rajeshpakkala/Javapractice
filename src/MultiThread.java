import java.util.Scanner;

    class Bankers extends Thread{
        public void run() {
            System.out.println("process 1 started");
            int acc = 1234;
            int pass = 5678;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account number");
            acc = sc.nextInt();
            System.out.println("Enter password");
            pass = sc.nextInt();
           /* if (acc == 1234 && pass == 5678)
            {
                System.out.println("collect your cash");
            }
            else
            {
                System.out.println("hacker");
            }*/
            System.out.println("process 1 ended");
        }
    }
    class Numberss extends Thread {
        public  void run() {
            System.out.print("Printing numbers");
            System.out.println("process 2 started");
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(i);
                try{
                    Thread.sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("process 2 ended");

        }
    }
    class Alphabetss extends Thread{
        public  void run()

        {
            System.out.println("printing alphabets");
            System.out.println("process 3 started");
            for (int i = 65; i <= 70; i++)
            {
                System.out.println((char)(i));
                try{
                    Thread.sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("process 3 ended");

        }
    }

    public class MultiThread{
        public static void main(String[]args){
            System.out.println("main thread started");
            Bankers b=new Bankers();
            Alphabetss a=new Alphabetss();
            Numberss n=new Numberss();

            //Thread t1=new Thread(b);
            //Thread t2=new Thread(a);
           // Thread t3=new Thread(n);

            System.out.println(b.isAlive());
            System.out.println(a.isAlive());
            System.out.println(n.isAlive());
            b.start();
            a.start();
            n.start();


            System.out.println(b.isAlive());
            System.out.println(a.isAlive());
            System.out.println(n.isAlive());

            b.run();
            a.run();
            n.run();

            System.out.println("main thread ended");

        }

    }


