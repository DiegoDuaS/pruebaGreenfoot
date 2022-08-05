import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        dance();
        shoutHooray();
        if(isHungry()){
            eat();
        }
        if(isBored()){
            dance();
        }
        if(isSleepy()){
            sleep(3);
        }
        if(isAlone()){
            sleep(2);
        }
        if(hasCompany()){
            shoutHooray();
        }
        
    }    
}
