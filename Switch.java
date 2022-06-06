import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Switch extends Actor
{
    boolean on= false;
    //we set false as 0 we're going to use this variable to add up and see if they equal wswitches lenght
    int onvalue=0;
    public void act()
    {
        if(on==true)
        {
            setImage("lever/2.png");
            onvalue=1;
        }
        if(on==false) 
        {
            setImage("lever/1.png");
            onvalue=0;
        }
        
    }
    
    
}
