package uk.axone.devintest.accessmodifiers.pack2;

import uk.axone.devintest.accessmodifiers.pack1.AccessModifiers;

public class AccessTest {

    void testAccess(){
        AccessModifiers accMod = new AccessModifiers();
        accMod.publicMethod();
        accMod.i = 10;
    }
}
