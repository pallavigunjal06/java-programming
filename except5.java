
class excp5{
    public static void main(String args[])
    {
        try{
              int[] a={1,2,3,4};
              System.out.println(a[10]);
            }
         catch(Exception e){
            System.out.println("Exception caught"+e.getMessage());
         }
         finally{
            System.out.println("finally block executed");
          }
     }
}
