package abstractoperate.interfaceoperate;

public class InterfaceImplement implements InterfaceClass  {
    
    @Override
    public void newMethod(){
        
    }
    void newcheckMethod(){
        int a = 10;
    }

    public static void main(String[] args) {
        InterfaceImplement interfaceimplement = new InterfaceImplement();
        interfaceimplement.newMethod();
        System.out.println("interfaceimplement.a"+interfaceimplement.a);
    
    int a = 20;
    System.out.println("value of a"+a);
    }
}