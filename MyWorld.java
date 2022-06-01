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
        
        if (arrow!=null&&Greenfoot.isKeyDown("d")&&selection<=switches.length)
        {
            
            arrow.setLocation(arrow.getX()+10, arrow.getY());    
            selection=selection+1;
            System.out.println(arrow.getX());
        }
        
        
        if (arrow!=null&&Greenfoot.isKeyDown("a")&&arrow.getX()>=switches.length)
        {
            
            arrow.setLocation(arrow.getX()-10, arrow.getY());    
            selection=selection-1;
            System.out.println(arrow.getX());
        }
        
        if(arrow.getX()<=127&&switches[selection].on==true)
        {
            switches[selection].on=false;
        }
        
        
    }
}
