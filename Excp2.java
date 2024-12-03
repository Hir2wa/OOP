class alainException extends RuntimeException {
  //i need to  create  a class  with no public  keyword  wowwww
  // here  we create an  a  constructoor  and i give it s parameter for it 
      public  alainException(String string){
         super(string);
      }
}


public class Excp2 {
    

    public static void main(String[] args) {
        
        
    int i = 20 ;
    int j = 0;
  
    try
    {
      j= 18/i;
      if(i==0)
        throw  new alainException(" division by zero: error ");
    if(j==0){
        throw new ArithmeticException( "i don't need to print zero");
    }
      
    }
    catch(alainException e)
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
