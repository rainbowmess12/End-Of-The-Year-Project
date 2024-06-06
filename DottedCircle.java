import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DottedCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DottedCircle extends Actor
{
    /**
     * Act - do whatever the DottedCircle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public DottedCircle(){
        GreenfootImage image = new GreenfootImage("DottedCircle.png");
        image.scale((int)(image.getWidth()*1.3), (int)(image.getHeight()*1.3));
        setImage(image);
    }
    
    public void act()
    {
        turn(1);
    }
}
