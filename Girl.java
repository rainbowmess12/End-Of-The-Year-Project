import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Girl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Girl extends Actor
{
    /**
     * Act - do whatever the Girl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Girl(){
        MyWorld myWorld = (MyWorld)(getWorld());
        GreenfootImage image = new GreenfootImage("Girl" + (int)(Math.random()*1) + myWorld.getStage() + ".png");
        image.scale(image.getWidth()/10, image.getHeight()/10);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
