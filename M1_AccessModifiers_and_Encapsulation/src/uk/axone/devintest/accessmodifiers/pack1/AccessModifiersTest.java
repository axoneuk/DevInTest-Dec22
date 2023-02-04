package uk.axone.devintest.accessmodifiers.pack1;

public class AccessModifiersTest {

    void testAccess(){
        AccessModifiers accMod = new AccessModifiers();
        accMod.i = 10;
        accMod.c = 20;
        accMod.d = 30;
        //accMod.j = 45; - int j is private

        accMod.publicMethod();
        accMod.defaultMethod();
        accMod.protectedMethod();
        //accMod.privateMethod();//privateMethod is private
    }

}
