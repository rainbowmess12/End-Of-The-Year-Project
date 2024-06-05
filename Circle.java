import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Actor
{
    /**
     * Act - do whatever the Circle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Circle(){
        GreenfootImage image = new GreenfootImage("Circle.png");
        image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
        image.setTransparency(220);
        for (int x = 0; x < image.getWidth(); x++)
        {
            for (int y = 0; y < image.getHeight(); y++)
            {
                Color c = image.getColorAt(x,y);     
                Color d = c.darker();
                
            }
        }
        setImage(image);
    }
    
    public void act()
    {
    }
}
