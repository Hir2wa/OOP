import java.util.Scanner;
public class Rectangle {
   public  void showA( int permeter){
    System.out.println("the permeter of  a rectangle is " +permeter);
   }

    public static void main(String[] args) {
        System.out.println("Enter width");
       Scanner sc = new Scanner(System.in);
       int width = sc.nextInt();
       System.out.println("Enter Height");
       int heiht = sc.nextInt();
       int permeter = width + heiht;
       Rectangle rectangle = new Rectangle();
        rectangle.showA(permeter);

        sc.close(); 
   
    }
}
