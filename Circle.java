import java.util.Scanner;
public class Circle {
    float radius;
     double pi = 3.14;
     double area;

    public  void showw(){
     
        System.out.println( "the area of  circle is :" +area);
    }

    public  void main(String[] args) {
        Scanner s = new Scanner(System.in);
       radius = s.nextInt();
       area = pi*radius*radius;
    
       Circle circle = new Circle();
       circle.showw();

          


    }
}
