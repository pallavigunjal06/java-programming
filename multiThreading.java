public class multiThreading extends Thread{
    public void run()
    {
        System.out.println("The thread  is running");
    }
    public static void main(String[] args) {
        multiThreading obj=new multiThreading();
        obj.start();
    }
}
