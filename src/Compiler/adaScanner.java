package Compiler;
import java.util.ArrayList;
public class adaScanner {
	//constructors
public adaScanner() {
	
}
public adaScanner(String contents) {
	processString(contents);
}
//functions to process the string
public void tokenize() {
	
}

public void processString(String contents ) {
	//store the current lexeme
	String currLex = "";
	//go through the provided string one character
	//at a time
	for(int i =0 ; i< contents.length();i++) {
		if(contents.charAt(i)== ' ' || contents.charAt(0) == '.') {
			
			identifyToken(currLex);
			currLex = "";
		}else {
			currLex += contents.charAt(i);
		}
		
		
	}
	
	
}
public void identifyToken(String lex) {
	System.out.print(++numLex);
}
//
public void setContents() {
	
}
//intialize variables
static int numLex = 0;;
private String rawData;
private ArrayList<String> lexemes;
private ArrayList<String> tokens;
private String[][] keywords = {{";","End of Line"},{"with","import identifier"},{"use","use identifier"}}; 


}
