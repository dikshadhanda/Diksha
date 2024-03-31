package abstractpackage;

public class AbstractImplement extends Abstractclass{

    @Override 
     void abstractMethod(){
        System.out.println("in abstractMethod");
     }

     public static void main(String[] args){
        AbstractImplement abstractImplement=new AbstractImplement();
        abstractImplement.abstractMethod();
     }
}