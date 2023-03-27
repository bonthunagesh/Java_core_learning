import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class inheritence_example {

    static class animal {

        public void eat(){
            System.out.println(" this is class animal method");

        }

    }
    static class Dog extends animal{

        public void bark(){
            System.out.println(" this is from Dog method ");

        }
    }

    public static void main(String args[]){

        Dog d = new Dog();
        d.bark();
        d.eat();






    }


}
