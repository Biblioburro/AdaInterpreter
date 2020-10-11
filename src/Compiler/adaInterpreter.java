/*
Course:CS4308
Section:01
assignment#:1st Deliverable
date:10/10/20
name:Samuel Joel Megginson
*/
package Compiler;

public class adaInterpreter {
	public adaInterpreter() {
		exec = new adaExecutor();
		
	}
	public adaInterpreter(adaExecutor ex,adaParser par, adaScanner scan) {
		
	}
	private String contents;
	private adaExecutor exec;
	private adaParser parser;
	private adaScanner scan;
	
}
