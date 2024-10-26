public class Mobilee {
 public void myLoop(){
    for (int i = 11; i <=70; i++) {
        System.out.println(i);
    }
 }  
 public void myValues(){
    for (int i = 11; i <=70; i++) {
       if (i%2==0) {
        System.out.println("Even  number " +i);
       
       }else{
        System.out.println("Odd Number"+i);
    
       }
    }
    
 } 
 public static void main(String[] args) {
    Mobilee mobilee = new Mobilee();
    mobilee.myLoop();
    mobilee.myValues();
 }
 }
    
    


