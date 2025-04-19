
class excp3{
     static void check(int Age)
     {
        if(Age<18){
         throw new ArithmeticException("Access Denied you must be 18 year old");
         }
         else {
           System.out.println("Access gramted");
           }
        }
      public static void main(String args[])
      {   excp3 obj=new excp3();
          obj.check(15);
          
      }
 }
      
