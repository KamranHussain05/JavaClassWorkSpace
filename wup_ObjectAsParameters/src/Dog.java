
public class Dog {

	// Implementing Classes Warmup 01
	// 1) what does this class represent?
		//A dog and its different defined features
	// 2) identify the number of constructor methods
		//2
	// 3) identify the number and name(s) of the accessor methods
		//5 mutators, getName, getColorCoat, getWeight, getWalkingState, and getPoopState
	// 4) what does each Accessor method do?
		//getName, returns the value of the name variable
		//getColorCoat returns the value of the coarColor var\	
		//getWeight returns the value of the weight var
		//getPoopState returns the value of the poopState var
		//getWalk state returns the value of the walking state var
	// 5) identify the number and the name(s) of the mutator methods\
		//set.Name, setcolorCoat, setWeight, and setPoopState
	// 6) what does each mutator method do?
		//setName assign the input value name 
		//setCoatColor assigns the input value to the coatColor var
		//setWeight assigns the input to the weight var
		//setWalkingState assigns the input to the walking state var
		//setPoopState assigns the input to the poopstate var
	// if you are working with a printed copy of this file,
	// make note of your answers to the above questions on a piece of paper
	// if you are working with the soft copy of this file,
	// comment your answers to the above questions in the file below
	
	private String name;
	private int weight;
	private String coatColor;
	private int walkingState;
	private boolean poopState;
	
	public static final int RUN = 3;
	public static final int WALK = 2;
	public static final int STAND = 1;
	public static final int SIT = 0;
	public final static boolean POOPING = true;
	public final static boolean NOT_POOPING = false;
	
	public Dog() {
		this.setName("none");
		this.setCoatColor("none");
		this.setWeight (0);
		this.setWalkingState(0);
		this.setPoopState(false);
	}
	
	public Dog(String name, String coatColor, int weight) {
		this.setName(name);
		this.setCoatColor(coatColor);
		this.setWeight (weight);
		this.setWalkingState(SIT);
		this.setPoopState(false);
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getCoatColor() {
		
	return coatColor;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getWalkingState() {
		return walkingState;
	}
	
	public boolean getPoopState() {
		return poopState;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setWalkingState(int walkingState) {
		this.walkingState = walkingState;
	}
	
	public void setPoopState(boolean poopState) {
		this.poopState = poopState;
	
	}
}
