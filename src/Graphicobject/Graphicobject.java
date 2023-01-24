package Graphicobject;

public abstract class Graphicobject {
    public abstract class Main{int x,y;
        void moveTo(int newX , int newY){
            System.out.println( "move to x:" +x+ "and y:" +y );
        }
        abstract  void  draw();
        abstract void resize();


        public static void main(String[] args) {

        }
    }
    public class circle extends Graphicobject{
        void draw(){
            System.out.println("drawing a circle");

        }
        void resize(){
            System.out.println("Resizing a circle");

        }
    }
}








