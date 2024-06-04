import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bubble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bubble extends Actor
{
    /**
     * Act - do whatever the Bubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Bubble(){
        GreenfootImage image = new GreenfootImage("Bubble.png");
        image.scale((int)(image.getWidth()*0.1), (int)(image.getHeight()*0.1));
        image.rotate((int)(Math.random()*360));
        setImage(image);
    }
    public void act()
    {
    }
}
