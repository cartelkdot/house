
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
    private Square door;
    private Triangle roof;
    private Circle sun;
    private Circle knob;
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
        door= new Square();
        knob = new Circle();
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
            wall.changeColor("red");
            wall.makeVisible();
            
            
            
            
            
            door.moveHorizontal(-90);
            door.moveVertical(120);
            door.changeSize(20);
            door.changeColor("black");
            door.makeVisible();
            
            knob.moveHorizontal(1);
            knob.moveVertical(159);
            knob.changeSize(8);
            knob.changeColor("yellow");
            knob.makeVisible();
            
            
            window.changeColor("yellow");
            window.moveHorizontal(-130);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            
            
            
            window2.changeColor("yellow");
            window2.moveHorizontal(-70);
            window2.moveVertical(40);
            window2.changeSize(40);
            window2.makeVisible();
            
            
            person.changeColor("red");
            person.moveHorizontal(-20);
            person.moveVertical(-4);
            person.changeSize(20, 10);
            person.makeVisible();
            
            
            roof.changeColor("black");
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
            
             sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
           
            
            
            
    }
  }
}
