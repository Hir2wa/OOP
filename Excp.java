public class Excp {
  public static void main(String[] args) {
    
 
    int i = 20 ;
    int j = 0;
  
    try
    {
      j= 18/i;
      if(i==0)
        throw  new ArithmeticException(" division by zero: error ");
    if(j==0){
        throw new ArithmeticException( "i don't need to print zero");
    }
      
    }
    catch(ArithmeticException e)
    {
        j= 18/1;
       
      System.out.println("    that a default output " +j );
      System.out.println("Exception caught: " + e.getMessage());
    }
   
     catch( Exception e){
  System.out.println("something went wrong......." + e );
     }        
     System.out.println("byee");
   
    
  }
  
 
  }
      
 