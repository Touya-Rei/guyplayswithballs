import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Switch extends Actor
{
    boolean on= false;
    public void act()
    {
        if(on==true)
        {
            setImage("lever/2.png");
        }
        if(on==false) 
        {
            setImage("lever/1.png");
        }
    }
}
