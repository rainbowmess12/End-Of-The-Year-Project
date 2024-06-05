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
    double i = 0.05;
    
    public Pot(){
        GreenfootImage image = new GreenfootImage("Pot.png");
        image.setTransparency(0);
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(i <= 0.9 && myWorld.getStage() == 0 && myWorld.getBegin()){
            GreenfootImage image = new GreenfootImage("Pot.png");
            image.setTransparency(255);
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            setImage(image);
            i+=0.05;
        }
        if(myWorld.getStage() > 0){
            GreenfootImage image = new GreenfootImage("Pot.png");
            image.setTransparency(255);
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            setImage(image);
            i-=0.05;
            if(i <= 0.05){
                getWorld().removeObject(this);
            }
        }
    }
}
