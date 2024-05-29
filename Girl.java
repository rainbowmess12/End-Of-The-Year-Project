import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Girl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Girl extends Actor
{
    String imageName;
    /**
     * Act - do whatever the Girl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Girl(String imageName){
        //GreenfootImage image = new GreenfootImage("Girl00.png");
        MyWorld myWorld = (MyWorld)(getWorld());
        GreenfootImage image = new GreenfootImage(imageName + "0.png");
        image.scale((int)(image.getWidth()*1.5), (int)(image.getHeight()*1.5));
        setImage(image);
        this.imageName = imageName;
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        GreenfootImage image = new GreenfootImage(imageName+myWorld.getStage()+".png");
        image.scale((int)(image.getWidth()*1.5), (int)(image.getHeight()*1.5));
        setImage(image);
    }
}
