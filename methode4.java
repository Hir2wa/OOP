 import java.util.Scanner;
public class methode4 {
    public static void main(String[] args) {
    areaC();
    }
    public static void areaC(){
        System.out.println("Enter Radius:");
        Scanner c = new Scanner(System.in);
        double y = c.nextDouble();
        double pi = 3.14;
        double result = y*y*pi;
        System.out.println("  Radius of "+c  +" has  Area of" + "  " +result);
    }
}
