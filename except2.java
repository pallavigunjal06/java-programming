
public class excp2{
        public static void main(String args[])
        {
           try{
              int a[]=new int[5];
              a[2]=30/1;
              a[6]=1;
              }
           catch(ArithmeticException e)
           {
              System.out.println("Arithmatic caught"+e.getMessage());
             }
           catch(ArrayIndexOutOfBoundsException e)
           {
              System.out.println("Array index out f bound caught"+e.getMessage());
             }
           catch(Exception e)
           {
              System.out.println("Parent exception caught"+e.getMessage());
             }
        System.out.println("Rest of the code");    
        }
}
