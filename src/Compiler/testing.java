package Compiler;
import java.io.*;
import java.util.*;
public class testing {
public static void main(String[] args) throws IOException {

adaScanner Ada = new adaScanner(getContents());
}

//function to extract the string from the user specified file
static public String getContents() throws IOException {
	String contents = "";
	String filename = "";
	Scanner scan = new Scanner(System.in);
	System.out.println("please enter your file name");
	filename = scan.next();
	try {
	//put any test files in  eclipse-workspace\AdaCompiler
	FileReader in = new FileReader(filename);
	int c;
	//while loop to print the function
	while((c= in.read())!= -1) {
		contents += (char)c;
	}
	
	in.close();

	}finally {
		
	}
	scan.close();
	return contents;
}
	
	
}
