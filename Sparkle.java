import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sparkle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sparkle extends Actor
{
    /**
     * Act - do whatever the Sparkle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Sparkle(){
        GreenfootImage image = new GreenfootImage("Sparkle.png");
        image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
        setImage(image);
    }
    
    public void act()
    {
        Greenfoot.delay(10);
        getWorld().removeObject(this);
    }
}
