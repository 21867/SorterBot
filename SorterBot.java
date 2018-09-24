import kareltherobot.*; 
/**
 * @author : 
 * teacher : Coglianese
 * due date:
 */
public class SorterBot extends Robot //extends ???
{
    /**
     * Constructor for objects of class SorterBot
     */
        public SorterBot (int st, int ave, Direction direction, int beeps)
        {
            super(st,ave, direction, beeps);
        }
       public boolean beepersInARow()
       {
           while(frontIsClear())
           {
               move();
               if (nextToABeeper())
               {
                   return true;
                }
            }
          return false;
        }
    
        
    
        /**
     * Any required methods - replace this comment with your own
     * You are not allowed to count the number of beepers
     * Any code that involves counting will receive no credit!!!
     */
    public void sortThemAll()
    {
        while (nextToABeeper())
        {
            move();
           }
        turnLeft();
        move();
        turnLeft();
       
        
        while (beepersInARow())
        {
            moveBackward();
            while(frontIsClear())
        {
            move();
            if (nextToABeeper())
            {
                pickBeeper();
            }
        }
        
      
        
        turnLeft();
        while(frontIsClear())
        {
            move();
        }
        turnLeft();
        while (nextToABeeper())
        {
            move();
           }
           moveBackward();
           turnLeft();
           
       while (nextToABeeper())
       {
           move();
        }
        turnLeft();
        while(anyBeepersInBeeperBag())
        {
            putBeeper();
            move();
        }
        
        moveBackward();
        turnAround();
        while (nextToABeeper())
        {
            move();
           }
           
          turnLeft();
          move();
          turnLeft();
    }
    
}
    public void turnRight()
        {
            turnLeft();
            turnLeft();
            turnLeft();
        }
        public void turnAround()
        {
            turnLeft();
            turnLeft();
        }
        public void moveBackward()
        {
            turnAround();
            move();
            turnAround();
        }
}
