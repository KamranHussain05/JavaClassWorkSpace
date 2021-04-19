
public class CarController
{

   public static void main(String[] args)
   {
      // working with the basic model
      
      System.out.println("Instantiating a new car");
      BasicCarModel car1 = new BasicCarModel("Mr. Taylor's Kia");
      System.out.println("the cars name is : " + car1.getCarName());
      System.out.println(car1.getCarName() + " move state is " + car1.getMoveState());
      
      System.out.println("Controller making car move");
      car1.move(); // move the car
      System.out.println(car1.getCarName() + " move state is " + car1.getMoveState());
      
      System.out.println("Controller changing car name");
      car1.setCarName("Angel's Kia"); // change the car's name
      System.out.println(car1.getCarName() + " move state is " + car1.getMoveState());
      
      System.out.println("Controller stopping car");
      car1.stop(); // stopping the car
      
      @SuppressWarnings("unused")
      String name = car1.myMoveState;
      car1.myMoveState = "whatever...";
      System.out.println(car1.getCarName() + " move state is " + car1.getMoveState());
      
      BasicCarModel car3 = new BasicCarModel(BasicCarModel.DEFAULT_MOVE_STATE);
      System.out.println(car3.getCarName() + "move state is " + car3.getMoveState());
   }
}