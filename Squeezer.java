import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Squeezer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squeezer extends Actor
{
    /**
     * Act - do whatever the Squeezer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("Squeezer.png");
    double i = 0.05;
    public Squeezer(){
        image.setTransparency(0);
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(myWorld.getStage() == 5){
            if(i <= 1){
                image = new GreenfootImage("Squeezer.png");
                image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
                image.setTransparency(255);
                setImage(image);
                i+=0.05;
            }
            if (Greenfoot.mouseDragged(this)){
                MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY());
                try{
                    Pimple pimple = moveToPimple(myWorld, getX(), getY());
                    setLocation(pimple.getX(), pimple.getY()+185);
                    System.out.println("moved to pimple");
                    Greenfoot.delay(20);
                    pimple.pop();
                }
                catch(Exception E){}
            }
            if(myWorld.getPimples().size() == 0){
                getWorld().removeObject(this);
            }
        }
        if(myWorld.getStage() < 5){
            image.setTransparency(0);
            setImage(image);  
        }
        if(myWorld.getStage() > 5){
            GreenfootImage image = new GreenfootImage("Squeezer.png");
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            setImage(image);
            i-=0.05;
            if(i <= 0.05){
                getWorld().removeObject(this);
            }
        }
    }
    
    public Pimple moveToPimple(MyWorld myWorld, int x, int y){
        ArrayList<Pimple> pimples = myWorld.getPimples();
        for(Pimple pimple : pimples){
            if(pimple.getX() < x+10 && pimple.getX() > x-10 && pimple.getY() < y-180 && pimple.getY() > y-190){
                return pimple;
            }
        }
        return null;
    }
}
