import java.util.Scanner;


    class Bankers2 implements Runnable{

        public void run()
        {
            String str=Thread.currentThread().getName();
            if(str.equals("Banking"))
            {
                bankdet();
            }
            else if(str.equals("Numb"))
            {
                numbers();
            }
            else
            {
                alpha();
            }
        }

        public void bankdet() {
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


        public  void numbers() {
            System.out.print("Printing numbers");
            System.out.println("process 2 started");
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(i);
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("process 2 ended");

        }


        public void alpha()

        {
            System.out.println("printing alphabets");
            System.out.println("process 3 started");
            for (int i = 65; i <= 70; i++)
            {
                System.out.println((char) (i));
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("process 3 ended");

        }
    }

    public class SharedResourceThreads{
        public static void main(String[]args){
            System.out.println("main thread started");
            Bankers2 b=new Bankers2();


            Thread t1=new Thread(b);
            Thread t2=new Thread(b);
            Thread t3=new Thread(b);

            t1.setName("Banking");
            t2.setName("Numb");
            t3.setName("Alpha");

            t1.start();
            t2.start();
            t3.start();

            System.out.println("main thread ended");

        }

    }



