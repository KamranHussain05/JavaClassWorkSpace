 // Author: Kamran Hussain
 // Date: 4/6/2021
 // Rev: 01
 // Notes: Research and development took a while but was really simple.

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
    //************Research and Development****************
    public String wordCount(String input) {  //this method counts the number of characters in the
    	String result = "";
    	int wordCount = 0;
    	String test = input;
    	
    	if(input.contains(" ")) { //checks if there are any words
    		wordCount++;
			while (test.contains(" ")) {  //counts every space
				test = test.replaceFirst(" ", ""); //removes every counted space to prevent a miscount
				wordCount++; //increases the word counter
			} 
    	}
    	
    	result = "The Word Count is: " + wordCount; //Adds the word count to the uneditable text box and signifies the meaning of the value
    	
    	return result; //returns the word count to be printed on the window
    }
    
}
/*
*** NEW TEST STRING ***
Test String: How does your lipogrammer handle this String?
how do#s your lipogramm#r handl# this string? = how do#s your lipogramm#r handl# this string?
Word mark Test: 1: PASS
does
lipogrammer
handle
-
does
lipogrammer
handle
printing word lists a second time
does
lipogrammer
handle
-
does
lipogrammer
handle
Compare: 0
Word list Test: 2: PASS
*** NEW TEST STRING ***
Test String: Currently the first and last words in the String contain the banned letter
curr#ntly th# first and last words in th# string contain th# bann#d l#tt#r = curr#ntly th# first and last words in th# string contain th# bann#d l#tt#r
Word mark Test: 3: PASS
currently
the
banned
letter
-
currently
the
banned
letter
Compare: 0
Word list Test: 4: PASS
*** NEW TEST STRING ***
Test String: How does your lipogrammer seek letters? This version has a few repeated words (and a few words with more than one banned letter too)
how do#s your lipogramm#r s##k l#tt#rs? this v#rsion has a f#w r#p#at#d words (and a f#w words with mor# than on# bann#d l#tt#r too) = how do#s your lipogramm#r s##k l#tt#rs? this v#rsion has a f#w r#p#at#d words (and a f#w words with mor# than on# bann#d l#tt#r too)
Word mark Test: 5: PASS
does
lipogrammer
seek
letters
version
few
repeated
more
one
banned
letter
-
does
lipogrammer
seek
letters
version
few
repeated
more
one
banned
letter
Compare: 0
Word list Test: 6: PASS
*** NEW TEST STRING ***
Test String: Technically, your LipogramAnalyzer should work even if there are repeated words that contain the banned letter, or possibly even punctuation!

Check to see if the punctuation is attached to the words, or if new line characters or tabs mess up your output.

	Using the Character wrapper class to analyze chars is important to extracting words with the letter "e".
t#chnically, your lipogramanalyz#r should work #v#n if th#r# ar# r#p#at#d words that contain th# bann#d l#tt#r, or possibly #v#n punctuation!

ch#ck to s## if th# punctuation is attach#d to th# words, or if n#w lin# charact#rs or tabs m#ss up your output.

	using th# charact#r wrapp#r class to analyz# chars is important to #xtracting words with th# l#tt#r "#". = t#chnically, your lipogramanalyz#r should work #v#n if th#r# ar# r#p#at#d words that contain th# bann#d l#tt#r, or possibly #v#n punctuation!

ch#ck to s## if th# punctuation is attach#d to th# words, or if n#w lin# charact#rs or tabs m#ss up your output.

	using th# charact#r wrapp#r class to analyz# chars is important to #xtracting words with th# l#tt#r "#".
Word mark Test: 7: PASS
technically
lipogramanalyzer
even
there
are
repeated
the
banned
letter
check
see
attached
new
line
characters
mess
character
wrapper
analyze
extracting
e
-
technically
lipogramanalyzer
even
there
are
repeated
the
banned
letter
check
see
attached
new
line
characters
mess
character
wrapper
analyze
extracting
e
Compare: 0
Word list Test: 8: PASS
*** NEW TEST STRING ***
Test String: Technically, your LipogramAnalyzer should work even if there are repeated words that contain the banned letter, or possibly even punctuation!
t#chnically, your lipogramanalyz#r should work #v#n if th#r# ar# r#p#at#d words that contain th# bann#d l#tt#r, or possibly #v#n punctuation! = t#chnically, your lipogramanalyz#r should work #v#n if th#r# ar# r#p#at#d words that contain th# bann#d l#tt#r, or possibly #v#n punctuation!
Word mark Test: 9: PASS
technically
lipogramanalyzer
even
there
are
repeated
the
banned
letter
-
technically
lipogramanalyzer
even
there
are
repeated
the
banned
letter
Compare: 0
Word list Test: 10: PASS
Testing wordCount: 12 = The Word Count is: 12

*****   TEST SUMMARY     *****
Tests:          10
Failed:         0
Total points:   10
Percent passed: 100%
Points earned:  10
*/