public class Loperators{
    public static void main(String[]args){
        int a=10;
        int b=5;
        if(a<b&&a>b){
            System.out.println("true");
        }
        else{
             System.out.println("false");
        }
        if(b<a||a>b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(a<b & b>a){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}