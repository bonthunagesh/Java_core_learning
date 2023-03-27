
interface Drawable {
     default void draw(){

    }

}

class rectangle implements Drawable {

     public void draw(){
         System.out.println(" this is rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println(" this is circle");
    }
}

class Abc {
    public static void main(String args[]){
        Drawable r = new rectangle();
        Drawable c = new Circle();

        r.draw();
        c.draw();


    }
}

