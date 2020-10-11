/*
Course:CS4308
Section:01
assignment#:1st Deliverable
date:10/10/20
name:Samuel Joel Megginson
*/
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
