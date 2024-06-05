import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean move = false;
    GreenfootImage image = new GreenfootImage("Start.jpg");
    
    public Start(){
        image.scale((int)(image.getWidth()*0.6), (int)(image.getHeight()*0.6));
        setImage(image);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            move = true;
        }
        if(move){
            image.setTransparency(image.getTransparency()-7);
        }
        if(image.getTransparency() < 4){
            getWorld().removeObject(this);
        }
    }
}
