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
        GreenfootImage image = new GreenfootImage("HeartBubbles.png");
        image.scale((int)(image.getWidth()*0.8), (int)(image.getHeight()*0.8));
        setImage(image);
        turn((int)(Math.random()*360));
    }
    
    public void act()
    {
        Greenfoot.delay(5);   
        getWorld().removeObject(this);
    }
}
