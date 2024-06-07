import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shower extends Actor
{
    /**
     * Act - do whatever the Shower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int addWater = 4;
    double i = 0.1;
    GreenfootImage image1 = new GreenfootImage("Shower.png");
    GreenfootImage image2 = new GreenfootImage("Shower.png");
    public Shower(){
        image1.mirrorHorizontally();   
        image1.setTransparency(0);
        image2.setTransparency(0);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(i <= 1 && myWorld.getStage() == 2){
            image1 = new GreenfootImage("Shower.png");
            image2 = new GreenfootImage("Shower.png");
            image1.mirrorHorizontally();
            image1.scale((int)(image1.getWidth()*i), (int)(image1.getHeight()*i));
            image1.setTransparency(255);
            image2.scale((int)(image2.getWidth()*i), (int)(image2.getHeight()*i));
            image2.setTransparency(255);
            i+=0.05;
        }
        if(myWorld.getStage() == 2){
            image1.setTransparency(255);
            image2.setTransparency(255);
            if(Greenfoot.mouseDragged(this)){
                try{MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY());}
                catch(Exception E){}
                if(addWater == 10){
                    if(!myWorld.makeWater(getX(), getY())){
                        myWorld.setStage(myWorld.getStage()+1);
                    }
                    addWater = 0;
                }
                addWater++;
            }
        }
        if(getX() < 300){
            setImage(image1);
        }
        else{
            setImage(image2);
        }
        if(myWorld.getStage() > 2){
            GreenfootImage image = new GreenfootImage("Shower.png");
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
