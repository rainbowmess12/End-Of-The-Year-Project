import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Towel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Towel extends Actor
{
    /**
     * Act - do whatever the Towel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("Towel.png");
    double i = 0.05;
    public Towel(){
        image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
        image.setTransparency(0);
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(i <= 0.6 && myWorld.getStage() == 4){
            image = new GreenfootImage("Towel.png");
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            image.setTransparency(255);
            setImage(image);
            i+=0.05;
        }
        if(myWorld.getStage() == 4){
            if (Greenfoot.mouseDragged(this)){
                try{MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY());}
                catch(Exception E){}
            }
            if(myWorld.waters.size() == 0 && myWorld.bubbles.size() == 0){
                myWorld.setStage(myWorld.getStage()+1);
            }
        }
        if(myWorld.getStage() > 4){
            image = new GreenfootImage("Towel.png");
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            setImage(image);
            i-=0.05;
            if(i <= 0.05){
                getWorld().removeObject(this);
            }
        }
    }
}
