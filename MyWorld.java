import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Rikard Karlsson 
 * @version 20-01-24
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(420, 420, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int row = 0;
        while (row < 3)
        {
            int x = 30;
            while (x < 420)
            {
                Apple apple = new Apple();
                int y = 30 + row * 60; 
                addObject(apple,x , y);
                x = x + 60;
            }
            row = row + 1;
        }
    }
}
