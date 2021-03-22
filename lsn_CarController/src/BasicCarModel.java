
public class BasicCarModel
{
   public String myMoveState;
   public String myCarName;
   
   public BasicCarModel(String name)
   {
      myCarName = name; 
      this.stop();
   }
   
   public void move()
   {
      myMoveState = "FORWARD";
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
