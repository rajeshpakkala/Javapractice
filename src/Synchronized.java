class Books implements Runnable {
 /*   String str = new String("DSA");
    String str1 = new String("DBMS");
    String str2 = new String("Spring");
    String st = Thread.currentThread().getName();

    public void run () {
        if ("tree".equals(st)) {
            try {
                Thread.sleep(3000);
                synchronized (str)
                {
                    System.out.println("Student 1 acquired" + str);
                    Thread.sleep(3000);
                    synchronized (str1)
                }
                System.out.println("Student 1 acquired" + str1);
                Thread.sleep(3000);
                synchronized (str2)
                {
                    System.out.println("Student 1 acquired" + str1);
                    Thread.sleep(3000);
                }
            } catch (Exception e) {
                System.out.println("problem is there");
            }
        }

        else{
            try {
                Thread.sleep(3000);
                synchronized(str) {
                    System.out.println("Student 1 acquired" + str);
                    Thread.sleep(3000);
                    synchronized (str1)
                }
                System.out.println("Student 1 acquired" + str1);
                Thread.sleep(3000);
                synchronized (str2)
                {
                    System.out.println("Student 1 acquired" + str2);
                    Thread.sleep(3000);
                }
            }
            catch (Exception e)
            {
                System.out.println("problem is there");
            }
        }
    }
}*/
    synchronized public  void run(){
    try{
        System.out.println(Thread.currentThread().getName()+" "+"entered bathroom");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName()+" "+"using bathroom");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName()+" "+"exiting bathroom");
        Thread.sleep(4000);
    }
    catch (Exception e){
        System.out.println("problem");
    }
    }
}
public class Synchronized {
    public static void main(String[]args)
    {
        Books b=new Books();

        Thread st3=new Thread(b);
        Thread st4=new Thread(b);
        Thread st5=new Thread(b);
        st3.setName("Tree");
        st4.setName("Throw");
        st5.setName("rook");

        st3.start();
        st4.start();
        st5.start();

        st3.run();
        st4.run();
        st5.run();


    }

}
