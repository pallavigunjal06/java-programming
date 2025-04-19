
import java.io.IOException;
class excp4{
   
      void m() throws IOException{
          throw new IOException("Error found");
         }
      void n() throws IOException{
          m();
        }
      void p(){
         try {
          n();
          }catch(Exception e){
           System.out.println("Exception handled successfully"+e.getMessage());
        }
      }
      public static void main(String args[])
      {
          excp4 obj=new excp4();
          obj.p();
          System.out.println("Further execution");
      }
}
