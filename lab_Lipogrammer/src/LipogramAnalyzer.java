 // Author: Kamran Hussain
 // Date: 4/6/2021
 // Rev: 01
 // Notes: 

public class LipogramAnalyzer {
    private String text = "";  //initializes the text private field

    public LipogramAnalyzer(String input){ //initializes the text field for use in the methods for this class
        this.text = input;
    }

    public String mark(char letter){
        String replacement = text.replace(letter, '#'); //replaces all the instances of the forbidden letter with a hashtag to mark them
        return(replacement);
    }

    public String allWordsWith(char letter) {
        text = text.replace('#', letter).replaceAll("\\p{Punct}","").replace("\n"," "); //this assigns the cleansed string and the replacement of the forbidden letter to the text field. 

        String[] allWords = text.split(" "); //creates a string array and populates it with the words in the input
        String output = "";
        boolean tester = false;

        for (int i = 0; i < allWords.length; i++) { 
            if (allWords[i].contains(Character.toString(letter))) { //converts every letter to a string from a char value in the array, checks if the tester word contains the forbidden letter
                tester = true;
                for (int j = 0; j < i; j++) {
                    if (allWords[i].trim().equals(allWords[j].trim())) { //checks if the word being tested is repeated
                        tester = false;
                    }
                }

                if (tester == true) { //checks if all test cases are true.
                    output = output.concat(allWords[i] + "\n"); //creates a new line for every test case.
                }
            }
        }
        return (output);
    }
}