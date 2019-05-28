import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guile extends Player
{
    /**
     * Constructor
     * 
     * Runs once when this object is created
     */
    Guile(int startingX, String moveLeftWithKey, String moveRightWithKey, String jumpWithKey, String punchWithKey, String kickWithKey, String blockWithKey)
    {
        // Invoke the superclass constructor
        super(startingX, "guile", 4, 2, 3, 1,  moveLeftWithKey, moveRightWithKey, jumpWithKey, punchWithKey, kickWithKey, blockWithKey);
    }

    /**
     * Act - do whatever the Guile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    }    
}
