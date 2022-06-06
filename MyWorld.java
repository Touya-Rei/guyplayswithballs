import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    //setting up the array
    Switch[] switches;
    //setting up the arrow to be recognized
    Arrow arrow;
    //selection allows us to track which switch are we highlighting or in this case pointing at
    int selection =0;
    //if you don't know what this is I don't even know
    int howmanyswitchesareon=3;
    int initialvalue=0;
    
    public MyWorld()
    {    
        super(600, 400, 1); 
        
        switches= new Switch[8];
        arrow= new Arrow();

        
        //100,  170,240,310,380,450,520






        
        
        //common array spaw set up, we use switches.length to mark the threshhold, and the for loop makes sure we hit that threshhold
        for (int i= 0;i<switches.length;i++)
        {
            int x= 50+i*70;
            int y= 200;
            int random=  Greenfoot.getRandomNumber(2);
            switches[i]= new Switch();
            
            
            addObject(switches[i],x, y);
            
            
            //checks if the switches have been added yet since we need the full length because if we do this before checking
            //greenfoot cries and says nullpointer exception
            if (i%switches.length==0)
            {
                addObject(arrow,100+switches.length, 50);
                
            }
            

            
        }

        //we want 2 switches to be on so 
        for(int m= 0;m<howmanyswitchesareon;m++)
            {
                int randorder=  Greenfoot.getRandomNumber(6);
                switches[randorder].on=true;
                
            }
        
        
        
            

    }
    
    public void act()
    {
        
        
        
        //basic movement but with a twist of referencing which element of the array are we currently selecting now, and moving the player to that specific x location
        //the switcheslength-1 is there to safe guard the condition from a nullpointer exception or an array out of bounds
        if (arrow!=null&&Greenfoot.isKeyDown("d")&&selection<switches.length-1)
        {
            selection=selection+1;
            arrow.setLocation(switches[selection].getX(),50);    
            
            
        }
        
        
        if (arrow!=null&&Greenfoot.isKeyDown("a")&&selection!=0)
        {
            selection=selection-1;
            arrow.setLocation(switches[selection].getX(), 50);    
            
           
        }
        
        
        //selection tells us which element in the array we are talking about, the =! flips the values inside the actor itself, we use the selection+1and -1 for switching both sides
        //and I added extra conditions as to when the player is flicking the switches at the ends.
        if(Greenfoot.isKeyDown("enter"))
        {
            switches[selection].on=!switches[selection].on;
            if(selection>0&&selection<switches.length-1)
            {
                switches[selection+1].on=!switches[selection].on;
                switches[selection-1].on=!switches[selection].on;
            }
            if(selection==0)
            {
                switches[selection+1].on=!switches[selection].on;
            }
            if(selection==switches.length-1)
            {
                switches[selection-1].on=!switches[selection].on;
            }
            //checks if all onvalues which is worth 1 if on is equal to the lenght of th earray
            //so it means it's checking if all values in the array are true
            
                initialvalue =initialvalue+ switches[switches.length-1].onvalue;
                
                if (initialvalue==switches.length)
                {
                    addObject(new YouWin(), 300, 200);
                }

            
        }
        
        
        
        
        }
        
    }
    
    

