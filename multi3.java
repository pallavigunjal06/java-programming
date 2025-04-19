import java.lang.Runnable;
public class multi3 implements Runnable  {
    public void run()
    {
         System.out.println("|Thread 1 is running ");
    }
    public static void main(String[] args) {
        multi3 obj=new multi3();
        multi obj1=new multi();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();
    }
}
 class multi implements Runnable 
{
    public void run()
    {
        System.out.println("Thread 2 is runnng");
    }
}
