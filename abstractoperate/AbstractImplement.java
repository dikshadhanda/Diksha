package abstractoperate;

public class AbstractImplement extends AbstractClass {

   @Override
    void abstractMethod(){
       System.out.println("in abstractMethod");
    }
    public static void main(String[] args) {
       AbstractImplement abstractImplement=new AbstractImplement();
       abstractImplement.abstractMethod();
    }
}
