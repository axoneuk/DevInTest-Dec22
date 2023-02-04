package uk.axone.devintest.accessmodifiers.pack2;

import uk.axone.devintest.accessmodifiers.pack1.AccessModifiers;

public class AccessModifiersChild extends AccessModifiers {

    void testAccess(){

        publicMethod();
        protectedMethod();
        //privateMethod();
        //defaultMethod();

        i = 20;
        c  = 30;
        //j = 30;
        //d = 40;
    }

}
