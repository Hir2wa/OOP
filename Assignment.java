public class Assignment {
    
public static void main(String[] args) {
    
    int x=4;
    int y=0;
    int z=x/y;


    System.out.println(z);

    System.out.println("HyAlain");

  // here the error we get
 // Exception in thread "main" java.lang.ArithmeticException: / by zero
 //at Assignment.main(Assignment.java:7)
  // you  can see that we didn't even get this//    System.out.println("HyAlain");     which doesn't hafve error total 
  // these  why because  the compiler when meet the automatry     because they are in the block 
  // here where try and catch comes  to solve these isses  right 

 try {
    //for  good let create different variables
    int d = x/y;
 } catch (Exception e) {
    System.out.println(d , + e.getMessage());
 }

 System.out.println("HyAlain");



 // here  as you  see we get out out as expected and the error  did't stops aour entire program that the beaty of  try and cath 
}



// here as you  see we  keep in different  block \
 

// remember  every class  extends object  
// object => throwablw= have error and exception they both extend trowablw      we were saying  a  keyword   that  we are throwing an error   righgt   these  how it commes  
// keyword throw is used  t throw t=exception and you get the messahe by using thesemethod (e.getMessage())

}
