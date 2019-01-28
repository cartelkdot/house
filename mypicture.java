
/**
 * Write a description of class mypicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mypicture
{
    
    
    private Square wall;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Circle sun;
    private Person person;
    private boolean drawn;
    /**
     * Constructor for objects of class mypicture
     */
    public mypicture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        person = new Person();
        window2 = new Square();
        drawn = false;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw()
    {
        if(!drawn) {
        
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("blue");
            wall.makeVisible();
            
            window.changeColor("yellow");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            
            window2.changeColor("yellow");
            window2.moveHorizontal(-80);
            window2.moveVertical(60);
            window2.changeSize(40);
            window2.makeVisible();
            
            
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
            
            person.moveHorizontal(0);
            person.moveVertical(-20);
            person.changeSize(20, 10);
            person.makeVisible();
            
            
            
    }
  }
}
