import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    int animinterval= 10;
    int framecounteranim= 0;
    GreenfootImage [] arrow;
    public load()
    {
        loadImages();
    }
    
    public void act()
    {
        
    }
    
    void animate(GreenfootImage[] images)
    {
        if (framecounteranim >= images.length * animinterval)  // Greater or equal (>=) takes care of animations with different number of images.
        {
            framecounteranim = 0;
        }
        
        if (framecounteranim % animinterval == 0)  // If it's time to switch to next animation image.
        {
            setImage(images[framecounteranim/animinterval]);
        }
        
        framecounteranim++;
    }
    
    void loadImages()
    {
        
        
        
    }
}
