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
    Pot pot;
    
    public MyWorld()
    {    
        super(1000, 600, 1);
        GreenfootImage image = new GreenfootImage("Background.jpg");
        setBackground(image);
        Circle circle = new Circle();
        addObject(circle, 800, 500);
        reset();
        setPaintOrder(Start.class, Water.class, Shower.class, Wax.class, Pot.class, Brush.class, Bubble.class, Dirt.class, Eyebrows.class, Pimple.class, Sparkle.class, Girl.class, Circle.class, Chair.class);
        Start start = new Start();
        addObject(start, 500, 300);
    }
    
    public void reset(){
        stage = 0;
        int girlNum = (int)(Math.random()*1);
        Chair chair = new Chair();
        addObject(chair, 500, 500);
        Girl girl = new Girl("Girl" + girlNum);
        addObject(girl, 500, 340);
        Eyebrows eyebrows = new Eyebrows();
        addObject(eyebrows, 492, 265);
        Brush brush = new Brush();
        addObject(brush, 180, 250);
        pot = new Pot();
        addObject(pot, 830,400);
        Wax wax = new Wax();
        addObject(wax, 880, 200);
        Marker marker = new Marker();
        addObject(marker, 800, 435);
        Dirt dirt1 = new Dirt(0);
        addObject(dirt1, 450, 600);
        Dirt dirt2 = new Dirt(1);
        addObject(dirt2, 575, 380);
        Shower shower = new Shower();
        addObject(shower, 180, 500);
        generatePimples();
    }
    
    public void generatePimples(){
        for(int i = 0; i < 7; i++){
            Pimple pimple = new Pimple();
            int x = (int)(Math.random()*160)+435;
            int y = (int)(Math.random()*200)+210;
            while(!validPimple(x, y)){
                x = (int)(Math.random()*160)+435;
                y = (int)(Math.random()*200)+200;
            }
            addObject(pimple, x, y);
        }
    }
    
    public boolean validPimple(int x, int y){
        if(405 < x && x < 605 && 200 < y && y < 240){
            return true;
        }
        if((x < 465 || x > 525) && 380 < y && y < 430){
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
            addObject(sparkle, (int)(Math.random()*350+300), (int)(Math.random()*350+100));
            Greenfoot.delay(2);
        }
        Greenfoot.delay(6);
    }
    
    public int getPotLocation(){
        return pot.getY();
    }
    
    public void makeWater(int x, int y){
        Water water1 = new Water();
        if(x < 500){
            addObject(water1, x-5, y-80);
            Water water2 = new Water();
            addObject(water2, x+15, y-90);
            Water water3 = new Water();
            addObject(water3, x+35, y-100);
        }
        else{
            addObject(water1, x-35, y-100);
            Water water2 = new Water();
            addObject(water2, x-15, y-90);
            Water water3 = new Water();
            addObject(water3, x+5, y-80);
        }
    }
}
