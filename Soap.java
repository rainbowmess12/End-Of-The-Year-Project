import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soap extends Actor
{
    /**
     * Act - do whatever the Soap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int addBubble = 0;
    GreenfootImage image = new GreenfootImage("Soap.png");
    double i = 0.05;
    boolean turned = false;
    public Soap(){
        image.setTransparency(0);
        setImage(image);
    }
    
    public void act()
    {
        MyWorld myWorld = (MyWorld)(getWorld());
        if(i <= 0.7 && myWorld.getStage() == 3){
            image = new GreenfootImage("Soap.png");
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            image.setTransparency(255);
            setImage(image);
            i+=0.05;
        }
        if(myWorld.getStage() == 3 && !turned){
            getWorld().setPaintOrder(Sparkle.class, Start.class, Wax.class, Pot.class, Brush.class, Shower.class, Soap.class, Towel.class, Bubble.class, Water.class, Dirt.class, Eyebrows.class, Pimple.class, Girl.class, DottedCircle.class, Circle.class, Chair.class);
            if (Greenfoot.mouseDragged(this)){
                try{MouseInfo mouse = Greenfoot.getMouseInfo();
                setLocation(mouse.getX(), mouse.getY());}
                catch(Exception E){}
                if(this.getX() > 125 && this.getX() < 500){
                    GreenfootImage image = new GreenfootImage("Hand.png");
                    image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
                    setImage(image);
                }
                else{
                    GreenfootImage image = new GreenfootImage("Soap.png");
                    image.scale((int)(image.getWidth()*0.7), (int)(image.getHeight()*0.7));
                    setImage(image);
                }
                if(addBubble == 10){
                    if(!myWorld.addBubble(getX(), getY())){
                        myWorld.setStage(myWorld.getStage()+1);
                        turned = true;
                    }
                    addBubble = 0;
                }
                addBubble++;
            }
        }
        if(myWorld.getStage() > 3){
            image = new GreenfootImage("Hand.png");
            image.scale((int)(image.getWidth()*i), (int)(image.getHeight()*i));
            setImage(image);
            i-=0.05;
            if(i <= 0.05){
                getWorld().removeObject(this);
            }
        }
    }
}
