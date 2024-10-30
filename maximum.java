public class maximum {
    public static void main(String[] args) {
        int num1= 20;
        int num2= 30;
        int num3 = 40;
        if (num1<num2 &&  num1<num3) {
            System.out.println( +num1 +"is my  smallest number ");
        }
       else if (num2<num1 && num2<num3) {
        System.out.println(+num2 + "is my  smallest  number");
        
       }
       else{
        System.out.println(+num3 +"is my  smallest number ");
       }
    }
}
