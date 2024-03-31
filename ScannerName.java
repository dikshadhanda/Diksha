import java.util.Scanner;
public class ScannerName{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int a;
         a = scanner.nextInt();
         System.out.println("value of a"+a); 
         float b;
         b = scanner.nextFloat();
         System.out.println("value of b"+b);
         double c;
         c = scanner.nextDouble();
         System.out.println("value of c"+c); 
         long d;
         d = scanner.nextLong();
         System.out.println("value of d"+d);
    }
}