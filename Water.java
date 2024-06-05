import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("Water.png");
    public Water(){
        image.scale((int)(image.getWidth()*0.075), (int)(image.getHeight()*0.075));
        setImage(image);
    }
    
    public void act()
    {
        image.setTransparency(image.getTransparency()-2);
        setLocation(getX(), getY()+2);
        if(getY() >= 550 || image.getTransparency() <= 1){
            getWorld().removeObject(this);
        }
    }
}
