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
    
    public MyWorld()
    {    
        super(1000, 600, 1); 
        stage = 0;
        int girlNum = (int)(Math.random()*1);
        Girl girl = new Girl("Girl" + girlNum);
        addObject(girl, 675, 300);
        Tray tray = new Tray();
        addObject(tray, 195, 300);
        Brush brush = new Brush();
        addObject(brush, 180, 250);
        Wax wax = new Wax();
        addObject(wax, 180, 120);
        Marker marker = new Marker();
        addObject(marker, 800, 435);
        
        for(int i = 0; i < 5; i++){
            Pimple pimple = new Pimple();
            int x = (int)(Math.random()*200)+575;
            int y = (int)(Math.random()*200)+210;
            while(!validPimple(x, y)){
                x = (int)(Math.random()*250)+550;
                y = (int)(Math.random()*250)+200;
            }
            addObject(pimple, x, y);
        }
    }
    
    public boolean validPimple(int x, int y){
        if(560 < x && x < 780 && 200 < y && y < 240){
            return true;
        }
        if((x < 640 || x > 700) && 360 < y && y < 410){
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
        for(int i = 0; i < 25; i++){
            Sparkle sparkle = new Sparkle();
            addObject(sparkle, (int)(Math.random()*150)+600, (int)(Math.random()*300)+150);
        }
    }
}
