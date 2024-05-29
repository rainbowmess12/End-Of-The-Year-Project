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
        Wax wax = new Wax();
        addObject(wax, 180, 120);
    }
    
    public void setStage(int stage){
        this.stage = stage;
    }
    
    public int getStage(){
        return stage;
    }
}
