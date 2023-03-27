


public class Static_Methods {

    static void static_method(){

        System.out.println(" No need for object declarion, This is coming from Static method");

    }

    void nonstatic_method() {

        System.out.println(" Need object to acess this");
    }


    public static void main(String args[]) {


        static_method();

        Static_Methods abc = new Static_Methods();

        abc.nonstatic_method();



    }







}
