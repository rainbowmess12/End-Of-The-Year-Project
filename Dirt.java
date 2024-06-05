import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dirt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dirt extends Actor
{
    /**
     * Act - do whatever the Dirt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dirt(int n){
        if(n == 1){
            GreenfootImage image = new GreenfootImage("Dirt.png");
            image.scale((int)(image.getWidth()*0.3), (int)(image.getHeight()*0.3));
            setImage(image);
        }
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
