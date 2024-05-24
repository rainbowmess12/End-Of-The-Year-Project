import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wax extends Actor
{
    /**
     * Act - do whatever the Wax wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wax(){
        GreenfootImage image = new GreenfootImage("Wax.png");
        image.scale((int)(image.getWidth()*1.1), (int)(image.getHeight()*1.1));
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
