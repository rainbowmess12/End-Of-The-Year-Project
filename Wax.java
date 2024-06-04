import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Wax extends Actor
{
    boolean turned;
    int clickable;
    /**
     * Act - do whatever the Wax wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wax(){
        GreenfootImage image = new GreenfootImage("Popsicle.png");
        image.scale((int)(image.getWidth()*1.1), (int)(image.getHeight()*1.1));
        setImage(image);
        turned = false;
        clickable = 0;
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(myWorld.getStage() == 0){
            if (Greenfoot.mouseDragged(this) && !turned){
                MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY());
                if(this.getX() > 600 && this.getX() < 700){
                    setLocation(685, 310);
                    GreenfootImage image = new GreenfootImage("Wax.png");
                    image.scale((int)(image.getWidth()*1.1), (int)(image.getHeight()*1.1));
                    setImage(image);
                    turned = true;
                }
                else{
                    GreenfootImage image = new GreenfootImage("Popsicle.png");
                    image.scale((int)(image.getWidth()*1.1), (int)(image.getHeight()*1.1));
                    setImage(image);
                }
            }
            if(Greenfoot.mouseClicked(this) && turned){
                clickable++;
                if(clickable == 2){
                    Greenfoot.playSound("Wax.mp3");
                    myWorld.setStage(myWorld.getStage()+1);
                    GreenfootSound ow = new GreenfootSound("Ow.mp3");
                    Greenfoot.delay(1);
                    ow.setVolume(100);
                    ow.play();
                    getWorld().removeObject(this);
                }
            }
        }
    }
}
