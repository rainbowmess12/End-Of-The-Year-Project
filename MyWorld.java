import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int stage;
    boolean begin = false;
    int waterMade = 0;
    
    public MyWorld()
    {    
        super(1000, 600, 1);
        GreenfootImage image = new GreenfootImage("Background.jpg");
        setBackground(image);
        Circle circle = new Circle();
        addObject(circle, 725, 420);
        DottedCircle dottedCircle = new DottedCircle();
        addObject(dottedCircle, 725,420);
        setPaintOrder(Sparkle.class, Hand.class, Start.class, Water.class, Soap.class, Wax.class, Pot.class, Brush.class, Shower.class, Bubble.class, Dirt.class, Eyebrows.class, Pimple.class, Girl.class, DottedCircle.class, Circle.class, Chair.class);
        Start start = new Start();
        addObject(start, 500, 300);
        stage = -1;
    }
    
    public void reset(){
        stage = 0;
        int girlNum = (int)(Math.random()*1);
        Chair chair = new Chair();
        addObject(chair, 500, 500);
        Girl girl = new Girl("Girl" + girlNum);
        addObject(girl, 350, 340);
        Eyebrows eyebrows = new Eyebrows();
        addObject(eyebrows, 342, 265);
        Brush brush = new Brush();
        addObject(brush, 725, 425);
        Pot pot = new Pot();
        addObject(pot, 725,425);
        Wax wax = new Wax();
        addObject(wax, 775, 175);
        Marker marker = new Marker();
        addObject(marker, 800, 435);
        Dirt dirt1 = new Dirt(0);
        addObject(dirt1, 300, 600);
        Dirt dirt2 = new Dirt(1);
        addObject(dirt2, 425, 380);
        Shower shower = new Shower();
        addObject(shower, 705, 420);
        generatePimples();
    }
    
    public void generatePimples(){
        for(int i = 0; i < 7; i++){
            Pimple pimple = new Pimple();
            int x = (int)(Math.random()*160)+285;
            int y = (int)(Math.random()*200)+210;
            while(!validPimple(x, y)){
                x = (int)(Math.random()*160)+285;
                y = (int)(Math.random()*200)+200;
            }
            addObject(pimple, x, y);
        }
    }
    
    public boolean validPimple(int x, int y){
        if(255 < x && x < 455 && 200 < y && y < 240){
            return true;
        }
        if((x < 315 || x > 375) && 380 < y && y < 430){
            return true;
        }
        return false;
    }
    
    public void setStage(int stage){
        this.stage = stage;
    }
    
    public int getStage(){
        return stage;
    }
    
    public void sparkle(){
        for(int i = 0; i < 15; i++){
            Sparkle sparkle = new Sparkle();
            addObject(sparkle, (int)(Math.random()*350+150), (int)(Math.random()*500+100));
            Greenfoot.delay(2);
        }
        Greenfoot.delay(6);
    }
    
    public boolean makeWater(int x, int y){
        if(x < 500){
            Water water1 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water1, x-5, y-80);
            Water water2 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water2, x+15, y-90);
            Water water3 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water3, x+35, y-100);
        }
        else{
            Water water1 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water1, x-35, y-100);
            Water water2 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water2, x-15, y-90);
            Water water3 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water3, x+5, y-80);
        }
        waterMade++;
        return waterMade < 70;
    }
    
    public boolean getBegin(){
        return begin;
    }
    
    public void setBegin(){
        begin = true;
    }
}
