import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brush here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brush extends Actor
{
    boolean turned;
    GreenfootImage image = new GreenfootImage("Brush.png");
    double i = 0.05;
    /**
     * Act - do whatever the Brush wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Brush(){
        image.setTransparency(0);
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(myWorld.getStage() == 1){
            if(i <= 0.7){
                image = new GreenfootImage("Brush.png");
                image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
                image.setTransparency(255);
                setImage(image);
                i+=0.05;
            }
            if (Greenfoot.mouseDragged(this) && !turned){
                MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY());
                if(this.getX() > 300 && this.getX() < 600 && this.getY() > 100 && this.getY() < 400){
                    turned = true;
                    setLocation(325, 200);
                    for(int i=0; i<50; i++){
                        setLocation(325, this.getY()+7);
                        Greenfoot.delay(1);
                    }
                    setLocation(325, 200);
                    for(int i=0; i<50; i++){
                        setLocation(325, this.getY()+7);
                        Greenfoot.delay(1);
                    }
                    image.mirrorHorizontally();
                    setImage(image);
                    setLocation(675, 200);
                    for(int i=0; i<50; i++){
                        setLocation(675, this.getY()+7);
                        Greenfoot.delay(1);
                    }
                    setLocation(675, 200);
                    for(int i=0; i<50; i++){
                        setLocation(675, this.getY()+7);
                        Greenfoot.delay(1);
                    }
                    Greenfoot.delay(10);
                    myWorld.sparkle();
                    myWorld.setStage(myWorld.getStage()+1);
                    getWorld().removeObject(this);
                }
            }
        }
        else{
            image.setTransparency(0);
            setImage(image);  
        }
    }
}
