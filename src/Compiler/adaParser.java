package Compiler;

public class adaParser {
public adaParser() {
	
}




treeNode<String> parseTree = null;
}
//

//node class for generating a parse tree
class treeNode<T>{
	public treeNode() {
		
	}
	public treeNode(treeNode<T> left,treeNode<T> right,T info) {
		data = info;
		leftChild = left;
		rightChild = right;
	}
	
	private T data;
	private treeNode leftChild;
	private treeNode rightChild;
}