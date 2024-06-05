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
    boolean turned;
    int addWater = 4;
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
        if(myWorld.getStage() == 3){
            image1.setTransparency(255);
            image2.setTransparency(255);
            if(Greenfoot.mouseDragged(this)){
                if (!turned){
                    try{MouseInfo mouse = Greenfoot.getMouseInfo();
                    setLocation(mouse.getX(), mouse.getY());}
                    catch(Exception E){}
                }
                if(addWater == 10){
                    myWorld.makeWater(getX(), getY());
                    addWater = 0;
                }
                addWater++;
            }
        }
        if(getX() < 500){
            setImage(image1);
        }
        else{
            setImage(image2);
        }
    }
}
