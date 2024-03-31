public class NewProgram
{
    public static void main(String[] args){
        int firstnumber=25;
        int secondnumber=78;
        int thirdnumber=87;
        if(firstnumber>secondnumber && firstnumber>thirdnumber){
             System.out.println("firstnumber is greater");
        }else if(secondnumber>firstnumber && secondnumber>thirdnumber){
            System.out.println("secondnumber is greater");
        }else if(thirdnumber>firstnumber && thirdnumber>secondnumber){
            System.out.println("thirdnumber is greater");
        }
        
            else{
                System.out.println("error");
            }
        
        
    }
}