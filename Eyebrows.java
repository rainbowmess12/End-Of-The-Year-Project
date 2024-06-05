import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eyebrows here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eyebrows extends Actor
{
    /**
     * Act - do whatever the Eyebrows wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Eyebrows(){
        GreenfootImage image = new GreenfootImage("Eyebrows.png");
        image.scale((int)(image.getWidth()*0.25), (int)(image.getHeight()*0.25));
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(myWorld.getStage() == 1){
            getWorld().removeObject(this);
        }
    }
}
