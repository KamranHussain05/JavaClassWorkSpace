
public class DogWalker {
	// Implementing Classes Warmup 01
	// This file should be used with the Dog.java class
	// 1) Predict the console output of this program on a piece of paper
	// 2) Run the program and compare the results.
	public static void main(String[] args) {
	Dog dog01;
	Dog dog02;
	Dog dog03;
	
	dog01 = new Dog();
	dog02 = new Dog("annabelle", "blue", 10);
	dog03 = new Dog("rex", "brown", 25);
	
	dog01.setName("girish");
	dog01.setWeight(250);
	dog01.setPoopState(Dog.POOPING);
	
	outputDogState(1, dog01);
	outputDogState(2, dog02);
	outputDogState(3, dog03);
	
	dog01 = dog03;
	dog01.setName("akshar");
	dog03.setWalkingState(Dog.WALK);
	
	outputDogState(1, dog01);
	outputDogState(2, dog02);
	outputDogState(3, dog03);
	}
	
	static void outputDogState(int num, Dog dog){
		System.out.println("No: " + num +
			"\nDog: " + dog.getName() +
			"\nColor: " + dog.getCoatColor() +
			"\nWeight: " + dog.getWeight() +
			"\nWalking State: " +
		dog.getWalkingState() +
		"\nPooping State: " +
		dog.getPoopState() +
		"\n");
	}
}
