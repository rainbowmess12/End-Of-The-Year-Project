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
    int clickable;
    /**
     * Act - do whatever the Brush wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Brush(){
        GreenfootImage image = new GreenfootImage("BrushIdle.png");
        image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(myWorld.getStage() == 1){
            if (Greenfoot.mouseDragged(this) && !turned){
                MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY());
                if(this.getX() > 600 && this.getX() < 700){
                    GreenfootImage image = new GreenfootImage("Brush.png");
                    image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
                    setImage(image);
                    turned = true;
                    setLocation(500, 200);
                    for(int i=0; i<60; i++){
                        setLocation(500, this.getY()+5);
                        Greenfoot.delay(1);
                    }
                    setLocation(500, 200);
                    for(int i=0; i<60; i++){
                        setLocation(500, this.getY()+5);
                        Greenfoot.delay(1);
                    }
                    image.mirrorHorizontally();
                    setImage(image);
                    setLocation(900, 200);
                    for(int i=0; i<60; i++){
                        setLocation(900, this.getY()+5);
                        Greenfoot.delay(1);
                    }
                    setLocation(900, 200);
                    for(int i=0; i<60; i++){
                        setLocation(900, this.getY()+5);
                        Greenfoot.delay(1);
                    }
                }
                else{
                    GreenfootImage image = new GreenfootImage("BrushIdle.png");
                    image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
                    setImage(image);
                }
            }
            if(Greenfoot.mouseClicked(this) && turned){
                clickable++;
                if(clickable == 2){
                    Greenfoot.playSound("Ow.mp3");
                    myWorld.setStage(myWorld.getStage()+1);
                    getWorld().removeObject(this);
                }
            }
        }
    }
}
