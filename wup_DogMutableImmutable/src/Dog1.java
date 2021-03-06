// Implementing Classes Warm-up 02


// if you are working with a printed copy of this file,
// make note of your answers to the above questions on a piece of paper

// if you are working with the soft copy of this file,
// comment your answers to the above questions in the file below

public class Dog1 {
	
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
	
	public Dog1() {
		
		this.setName("none");
		this.setCoatColor("none");
		this.setWeight (0);
		this.setWalkingState(0);
		this.setPoopState(false);
	}
	
	public Dog1(String name, String coatColor, int weight) {
		
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
	
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setCoatColor(String coatColor) {
		 this.coatColor = coatColor;
	}
	
	private void setWeight(int weight) {
		this.weight = weight;
	}
	
	private void setWalkingState(int walkingState) {
		this.walkingState = walkingState;
	}
	
	private void setPoopState(boolean poopState) {
		this.poopState = poopState;
	}
}
