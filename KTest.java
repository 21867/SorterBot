import kareltherobot.*; 
/**
 * @author :C. Nelson
 * teacher :
 * due date:
 */
public class KTest extends KJRTest implements Directions
{
		public KTest(String name)
    {
    		super(name);  
   	}
   	
   	public void assertState(Robot karel, int str, int av, Direction dir, boolean beeps)
   	{
   			if(dir == Directions.East)
   				assertFacingEast(karel);
   			else if(dir == Directions.West)
   				assertFacingWest(karel);
   			else if(dir == Directions.North)
   				assertFacingNorth(karel);
   			else if(dir == Directions.South)
   				assertFacingSouth(karel);
   			
   			assertAt(karel, str, av);
   			
   			if(beeps)
   				assertBeepersInBeeperBag(karel);
   	}
   	
   	/*public void assertWorldBeeps(int[] ... beepLocs)
   	{
   			for(int[] n : beepLocs){}
   				//assertBeepersAt(n[0], n[1], n[2]);
   	}
   	
   	public void assertWorldBots(int[] ... botLocs)
   	{
   			for(int[] n : botLocs)
   				assertRobotsAt(n[0], n[1], n[2]);
   	}*/
}