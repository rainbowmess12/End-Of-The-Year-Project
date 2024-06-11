import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clay extends Actor
{
    /**
     * Act - do whatever the Clay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("Clay.png");
    double i = 0.05;
    boolean turned = false;
    public Clay(){
        image.setTransparency(0);
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(i <= 0.7 && myWorld.getStage() == 6){
            image = new GreenfootImage("Clay.png");
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            image.setTransparency(255);
            setImage(image);
            i+=0.05;
        }
        if(myWorld.getStage() == 6 && !turned){
            if (Greenfoot.mouseDragged(this)){
                try{MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY());}
                catch(Exception E){}
                if(this.getX() > 125 && this.getX() < 600){
                    GreenfootImage image = new GreenfootImage("ClayHand.png");
                    image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
                    setImage(image);
                    if(!myWorld.addMask(getX(), getY())){
                        myWorld.setStage(myWorld.getStage()+1);
                        turned = true;
                    }
                }
                else{
                    GreenfootImage image = new GreenfootImage("Clay.png");
                    image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
                    setImage(image);
                }
            }
        }
        if(myWorld.getStage() > 6){
            image = new GreenfootImage("ClayHand.png");
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            setImage(image);
            i-=0.05;
            if(i <= 0.05){
                getWorld().removeObject(this);
            }
        }
    }
}
