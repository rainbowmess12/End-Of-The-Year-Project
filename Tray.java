import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tray extends Actor
{
    /**
     * Act - do whatever the Tray wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tray(){
        GreenfootImage image = new GreenfootImage("Tray.png");
        image.scale((int)(image.getWidth()/1.5), (int)(image.getHeight()/1.5));
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
