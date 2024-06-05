import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pot extends Actor
{
    /**
     * Act - do whatever the Pot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double i = 0;
    
    public Pot(){
        GreenfootImage image = new GreenfootImage("Pot.png");
        image.scale((int)(image.getWidth()*0.9), (int)(image.getHeight()*0.9));
        setImage(image);
    }
    
    public void act()
    {
        setLocation(getX(), getY()+(int)(Math.sin(i)*3));
        i+=0.06;
        MyWorld myWorld = (MyWorld)(getWorld());
        if(myWorld.getStage() != 0){
            getWorld().removeObject(this);
        }
    }
}
