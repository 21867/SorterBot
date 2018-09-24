/**
   @Author:
      Date:	10-02-06
   Teacher:	Coglianese
       Lab: Ch6_25
      Misc: 
  */
import kareltherobot.*;
import java.awt.Color;

public class SorterBotDriver implements Directions
{
    public static void main(String args[])  
	{
		SorterBot  alice= new SorterBot (1, 1, East, 0);
		alice.sortThemAll();
	}
	
    static {
        World.reset(); 
        World.readWorld("Ch6_25.kwld"); 
        //World.setBeeperColor(Color.magenta);
        //World.setStreetColor(Color.blue);
        //World.setNeutroniumColor(Color.green.darker());
        World.setDelay(1);  
        World.setVisible(true);
    }
}