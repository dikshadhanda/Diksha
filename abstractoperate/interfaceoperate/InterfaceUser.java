package abstractoperate.interfaceoperate;

import abstractoperate.AbstractClass;

public class InterfaceUser extends AbstractClass implements InterfaceClass {
        public void abstractMethod(){
           System.out.println("in abstractMethod");
        }
        public void newMethod(){
           System.out.println("in newMethod");
        }
public static void main(String[] args) {
    InterfaceUser interfaceUser = new InterfaceUser();
    interfaceUser.abstractMethod();
    interfaceUser.newMethod();
    }
 }
