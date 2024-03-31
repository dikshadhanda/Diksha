import java.util.Scanner;
public class ScannerUser {
    public static void main(int a , int b ) {
        System.out.println("in function" + (a*b));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        System.out.println("value of a"+a);
        int b;
        b = scanner.nextInt();
        System.out.println("value of b"+b);
        System.out.println("a "+ a +"b "+(a-b));
        main(a,b);
    }
}
