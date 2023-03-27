import org.w3c.dom.ls.LSOutput;

import java.security.PublicKey;
import java.security.spec.RSAOtherPrimeInfo;

class Animal {
    void sound(){
        System.out.println(" Animal sound");
    }

}
class cat extends Animal{

    void sound(){
        System.out.println(" cat sound");
    }

}
public class polymorphism {

    public static void  main(String args[]){

        Animal animal = new Animal();

        Animal c= new cat();

        cat c1 = new cat();

        animal.sound();
        c.sound();
    }


}
