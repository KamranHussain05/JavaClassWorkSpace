
public class BasicCarModel
{
   public String myMoveState;
   public String myCarName;
   public static final String DEFAULT_MOVE_STATE = "Forward";
   public static final String SAFETY_MOVE_STATE = "Stop";
   public static final String DEFAULT_CAR_NAME = "NO NAME";
   public static int numMoveForwards = 0;	
   
   public BasicCarModel(String name)
   {
      myCarName = name; 
      this.stop();
   }
   
   public void move()
   {
      myMoveState = "FORWARD";
      numMoveForwards++;
      
      // moving code goes here
      System.out.println(myCarName + " car class code is making wheels move...");
   }
   
   public void stop()
   {
      myMoveState = "STOP";
      // stop code goes here
      System.out.println(myCarName + " car class code is making wheels stop...");
   }
   
   public void setCarName(String name)
   {
      myCarName = name;
   }
   
   public String getCarName()
   {
      return myCarName;
   }
   public String getMoveState()
   {
      return myMoveState;
   }
}
