import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    Switch[] switches;
    Arrow arrow;
    int selection =0;
    int  ind;
    
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
            int xloc=switches[i].getX();
            System.out.println(""+xloc);
            
            
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
        selectioncond();
        
        
        
        if (arrow!=null&&Greenfoot.isKeyDown("d")&&selection<=switches.length&&selection!=6)
        {
            selection=selection+1;
            arrow.setLocation(switches[selection].getX(),50);    
            
            
        }
        
        
        if (arrow!=null&&Greenfoot.isKeyDown("a")&&arrow.getX()>=switches.length&&selection!=0)
        {
            selection=selection-1;
            arrow.setLocation(switches[selection].getX(), 50);    
            
           
        }
        
        
        
        if(Greenfoot.isKeyDown("enter"))
        {
            switches[selection].on=!switches[selection].on;
            if(selection>0&&selection<7)
            {
                switches[selection+1].on=!switches[selection].on;
                switches[selection-1].on=!switches[selection].on;
            }
        }
        
        
        
    }
    
    public void selectioncond()
    {
        if (selection>=5)
        {
            selection=6;
        }
        
        if (selection<=0)
        {
            selection=0;
        }
    }
}
