import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mask here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mask extends Actor
{
    /**
     * Act - do whatever the Mask wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Mask(){
        GreenfootImage image = new GreenfootImage("Mask.png");
        image.scale((int)(image.getWidth()*0.05), (int)(image.getHeight()*0.05));
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
