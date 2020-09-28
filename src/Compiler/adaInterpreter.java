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
