import java.util.Scanner;


public class methode3 {
    public static void main(String[] args) {
      concaName();
    }
     public static void concaName() {
        System.out.println("Enter Fname:");
        Scanner x = new Scanner(System.in);
        String  a =x.nextLine();
        System.out.println("Enter Lname:");
        String b =x.nextLine();
        System.out.println( " Full Name: " +a   +"  "  +b );
     }
}
