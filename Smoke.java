import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sparkle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smoke extends Actor
{
    /**
     * Act - do whatever the Sparkle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Smoke(){
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        for(int i = 1; i <= 9; i++){
            GreenfootImage image = new GreenfootImage("Smoke"+i+".png");
            image.scale((int)(image.getWidth()*0.6), (int)(image.getHeight()*0.6));
            setImage(image);
            if(i == 2){
                myWorld.setStage(myWorld.getStage()+1);
                myWorld.setSmoking(false);
            }
            Greenfoot.delay(1);
        }
        getWorld().removeObject(this);
    }
}
