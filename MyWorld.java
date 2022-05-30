import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
<<<<<<< Updated upstream
        
        
        for (int i= 0;i<=7;i++)
        {
            int x= 100+i*55;
            int y= 200;
            addObject( new Switch(),x, y);
        }    
        
=======
        int random=  Greenfoot.getRandomNumber(2);
        
        for (int i= 0;i<=7;i++)
        {
            int x = 100+i*55;
            int y = 200;
            addObject( new Switch(),x, y);
        }        
>>>>>>> Stashed changes
    }
}
