package InnerClasses;
//We can't create objects of inner class without creating objects of outer class.
public class Display {

    private static final int DISPLAY_HEIGHT=1920;
    private static final int DISPLAY_WIDTH=1280;




    public Display() {
    Pixel pixel=new Pixel(10,10,Color.BLUE);//Display already has 1 pixel by default.
    }

    private  static class Pixel{//We will use it only inside "Display",so we make it private.
       private int x;//We'll use that field only inside of class "Pixel",so we make it private.
       private int y;//We'll use that field only inside of class "Pixel",so we make it private.
       private Color color;//We'll use that field only inside of class "Pixel",so we make it private.

        private Pixel(int x, int y, Color color) {
            //We will use it only inside "Display",so we make it private.
            if (0<=x && x<=DISPLAY_WIDTH && 0<=y && y<=DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creating "+color+" pixel at "+ "("+ x + ";"+y + ")");
            } else {
                throw new IllegalArgumentException("Coordinates x and y must" +
                        " be between 0-"+DISPLAY_WIDTH + " and 0-" +DISPLAY_HEIGHT);
                //Throwing exception so other Devs will understand why.
            }
        }
    }
    public enum Color{
        RED,GREEN,BLUE,CYAN,PURPLE,YELLOW,BLACK
    }
}
