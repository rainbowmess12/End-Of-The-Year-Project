import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pimple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pimple extends Actor
{
    /**
     * Act - do whatever the Pimple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pimple(){
        GreenfootImage image = new GreenfootImage("Pimple0.png");
        image.scale(image.getWidth()/9, image.getHeight()/9);
        setImage(image);
    }
    
    public void act()
    {
        /*
        GreenfootImage image = new GreenfootImage("Pimple1B.png");
        image.scale((int)(image.getWidth()/8), (int)(image.getHeight()/8));
        setImage(image);
        */
    }
}
