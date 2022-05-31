import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    Switch[] switches;
    Arrow arrow;
    
    public MyWorld()
    {    
        super(600, 400, 1); 
        
        switches= new Switch[7];
        arrow= new Arrow();

        
        //100,  170,240,310,380,450,520






        
        
        
        for (int i= 0;i<switches.length;i++)
        {
            int x= 100+i*70;
            int y= 200;
            int random=  Greenfoot.getRandomNumber(2);
            switches[i]= new Switch();
            addObject(switches[i],x, y);
            System.out.println(""+x);
                if (i%6==0)
            {
                addObject(arrow,100+switches.length, 50);
                
            }
            
            

            
        }    
        
        for(int m= 0;m<3;m++)
            {
                int randorder=  Greenfoot.getRandomNumber(6);
                switches[randorder].on=true;
                
            }
        
        
        
            

    }
    
    public void act()
    {
        if (arrow!=null&&Greenfoot.isKeyDown("d"))
        {
            arrow.setLocation(arrow.getX()+5, arrow.getY());                
        }
        if (arrow!=null&&Greenfoot.isKeyDown("a"))
        {
            arrow.setLocation(arrow.getX()-5, arrow.getY());                
        }
    }
}
