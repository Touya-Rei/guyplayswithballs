import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Arrow extends Actor
{
    int animinterval= 10;
    int framecounteranim= 0;
    GreenfootImage [] arrow;
    
    
    public void act()
    {
        loadImages();
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
        arrow= new GreenfootImage[7];
        for(int i= 0; i<arrow.length;i++)
        {
            String imgpath= "arrow/"+i+".png";

        }
        
        
    }
}
