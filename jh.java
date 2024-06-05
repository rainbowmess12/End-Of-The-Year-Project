import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jh extends Actor
{
    /**
     * Act - do whatever the jh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public jh(){
        GreenfootImage image = new GreenfootImage(getImage());
        image.scale((int)(image.getWidth()*0.5), (int)(image.getHeight()*0.5));
        setImage(image);
    }
    
    public void act()
    {
    }
}
