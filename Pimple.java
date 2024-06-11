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
    boolean popped = false;
    GreenfootImage image = new GreenfootImage("Pimple0.png");
    
    public Pimple(){
        image.scale(image.getWidth()/9, image.getHeight()/9);
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(popped){
            image = getImage();
            image.setTransparency(image.getTransparency()-2);
            setImage(image);
        }
        if(image.getTransparency() <= 1){
            myWorld.removePimple(this);
            getWorld().removeObject(this);
        }
    }
    
    public void pop(){
        if(!popped){
            int i = (int)(Math.random()*2);
            if(i == 0){
                GreenfootImage image = new GreenfootImage("Pimple1A.png");
                image.scale((int)(image.getWidth()/8), (int)(image.getHeight()/8));
                setImage(image);
            }
            else{
                GreenfootImage image = new GreenfootImage("Pimple1B.png");
                image.scale((int)(image.getWidth()/8), (int)(image.getHeight()/8));
                setImage(image);
            }
            popped = true;
        }
    }
}
