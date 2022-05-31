import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
        Switch[] switches;
    public MyWorld()
    {    
        super(600, 400, 1); 
        
        switches= new Switch[7];
    
        
        for (int i= 0;i<switches.length;i++)
        {
            int x= 100+i*55;
            int y= 200;
            int random=  Greenfoot.getRandomNumber(2);
            switches[i]= new Switch();
            addObject(switches[i],x, y);
            
            for(int m= 0;m<2;i++)
            {
                int randorder=  Greenfoot.getRandomNumber(6);                    
            }
        
                if(random==1)
                {
                    
                }
            
        }    
        

        
            

    }
}
