import java.awt.dnd.DropTarget;
// Create The Interface
interface Drawable{
    void draw();
}
// We can Inherit the Interface
class Ractangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Ractangle is Draw.");
    }
}

//Again inherit the interface
class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Circle is Draw.");
    }
}
// This is our Public class
public class DrawableInterface {
    public static void main(String[] args) {
        Drawable obj=new Circle();
        obj.draw();
        Drawable obj1=new Ractangle();
        obj1.draw();
    }
}
