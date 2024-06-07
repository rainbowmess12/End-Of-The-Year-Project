import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Wax extends Actor
{
    double n = 0;
    double i = 0.05;
    boolean turned;
    int clickable;
    /**
     * Act - do whatever the Wax wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wax(){
        turned = false;
        clickable = 0;
        GreenfootImage image = new GreenfootImage("Pot.png");
        image.setTransparency(0);
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(i <= 0.7 && myWorld.getStage() == 0 && myWorld.getBegin()){
            GreenfootImage image = new GreenfootImage("Popsicle.png");
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            image.setTransparency(255);
            setImage(image);
            i+=0.05;
        }
        if(myWorld.getStage() == 0){
            if (Greenfoot.mouseDragged(this) && !turned){
                try{MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY());}
                catch(Exception E){}
                if(this.getX() > 300 && this.getX() < 600 && this.getY() > 200 && this.getY() < 400){
                    setLocation(360, 307);
                    GreenfootImage image = new GreenfootImage("Wax.png");
                    image.scale((int)(image.getWidth()*1.1), (int)(image.getHeight()*1.1));
                    setImage(image);
                    turned = true;
                }
                else{
                    GreenfootImage image = new GreenfootImage("Popsicle.png");
                    image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
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
        if(!Greenfoot.mouseDragged(this) && !turned){
            setLocation(getX(), getY()+(int)(Math.sin(n)*3));
        }
        n+=0.06;
    }
}
