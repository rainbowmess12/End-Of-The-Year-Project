import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
    ArrayList<Water> waters; 
    ArrayList<Bubble> bubbles;
    boolean smoking = false;
    ArrayList<Pimple> pimples;
     
    public MyWorld()
    {    
        super(1000, 600, 1);
        GreenfootImage image = new GreenfootImage("Background.jpg");
        setBackground(image);
        Circle circle = new Circle();
        addObject(circle, 725, 420);
        DottedCircle dottedCircle = new DottedCircle();
        addObject(dottedCircle, 725,420);
        setPaintOrder(Smoke.class, Start.class, Wax.class, Pot.class, Brush.class, Water.class, Shower.class, Soap.class, Bubble.class, Dirt.class, Eyebrows.class, Pimple.class, Girl.class, DottedCircle.class, Circle.class, Chair.class);
        Start start = new Start();
        addObject(start, 500, 300);
        stage = -1;
    }
    
    public void reset(){
        stage = 0;
        waters = new ArrayList<Water>();
        bubbles = new ArrayList<Bubble>();
        int girlNum = (int)(Math.random()*1);
        Chair chair = new Chair();
        addObject(chair, 350, 500);
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
        Soap soap = new Soap();
        addObject(soap, 725, 425);
        Towel towel = new Towel();
        addObject(towel, 725, 425);
        Squeezer squeezer = new Squeezer();
        addObject(squeezer, 740, 380);
        generatePimples();
    }
    
    public void generatePimples(){
        pimples = new ArrayList<Pimple>();
        for(int i = 0; i < 7; i++){
            Pimple pimple = new Pimple();
            int x = (int)(Math.random()*160)+285;
            int y = (int)(Math.random()*200)+210;
            while(!validPimple(x, y)){
                x = (int)(Math.random()*160)+285;
                y = (int)(Math.random()*200)+200;
            }
            addObject(pimple, x, y);
            pimples.add(pimple);
        }
    }
    
    public boolean validPimple(int x, int y){
        if(264 < x && x < 400 && 200 < y && y < 240){
            return true;
        }
        if((x < 315 || x > 375) && 380 < y && y < 430){
            return true;
        }
        return false;
    }
    
    public void setStage(int stage){
        this.stage = stage;
        System.out.println(stage);
    }
    
    public int getStage(){
        return stage;
    }
    
    public void smoke(){
        smoking = true;
        Smoke smoke = new Smoke();
        addObject(smoke, 310, 320);
    }
    
    public boolean makeWater(int x, int y){
        if(x < 400 && x > 75){
            Water water1 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water1, x-5, y-80);
            Water water2 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water2, x+15, y-90);
            Water water3 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water3, x+35, y-100);
            waters.add(water1);
            waters.add(water2);
            waters.add(water3);
        }
        else{
            Water water1 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water1, x-35, y-100);
            Water water2 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water2, x-15, y-90);
            Water water3 = new Water(0 != (int)(Math.random()*10), y);
            addObject(water3, x+5, y-80);
            waters.add(water1);
            waters.add(water2);
            waters.add(water3);
        }
        return waters.size() < 47;
    }
    
    public boolean getBegin(){
        return begin;
    }
    
    public void setBegin(){
        begin = true;
    }
    
    public boolean addBubble(int x, int y){
        if(x < 500 && x > 75){
            Bubble bubble = new Bubble();
            addObject(bubble, x, y);
            bubbles.add(bubble);
        }
        return bubbles.size() < 30;
    }
    
    public void removeBubble(Bubble bubble){
        bubbles.remove(bubble);
    }
    
    public void removeWater(Water water){
        waters.remove(water);
    }
    
    public void setSmoking(boolean val){
        smoking = val;
    }
    
    public ArrayList<Pimple> getPimples(){
        return this.pimples;
    }
    
    public void removePimple(Pimple pimple){
        pimples.remove(pimple);
    }
    
    public void generate
}
