package com.saravanan.algorithms;

public class BinaryTreeTest {
	private Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeTest bt = new BinaryTreeTest();
		bt.add(5);
		bt.add(4);
		bt.add(6);
		
		bt.add(2);
		bt.add(1);
		bt.add(3);
		
		System.out.println(bt.find(2));
		
		bt.traverseInOrder(bt.root);
		bt.delete(1);
		bt.traverseInOrder(bt.root);
		
	}
	
	public void delete(int value){
		Node node =deleteRecursive(root, value);
		node = deleteNode(node);
	}
	
	public Node deleteRecursive(Node node, int value){
		if(node == null){
			return null;
		}
		
		if(node.value == value){
			return node;
		}else if(node.value > value){
			node.right = deleteRecursive(node.right, value);
		}else if(node.value < value){
			node.left = deleteRecursive(node.left, value);
		}
		
		return node;
	}
	
	public Node deleteNode(Node node){
		System.out.println("----------");
		System.out.println(node.value);
		if(node.left == null && node.right == null){
			return null;
		}
		return null;
	}
	
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}
	
	private boolean find(int value){
		return findRecursive(root, value);
	}
	
	private boolean findRecursive(Node current, int value){
		if(current == null){
			return false;
		}
		
		if(current.value == value){
			return true;
		}else if(current.value < value){
			return findRecursive(current.right, value);
		}else if(current.value > value){
			return findRecursive(current.left, value);
		}
		
		return false;
	}
	
	private void add(int value){
		root = addRecursive(root, value);
	}
	
	private Node addRecursive(Node current , int value){
		if(current == null){
			return new Node(value);
		}
		
		if(current.value < value){
			current.right=addRecursive(current.right, value);
		}else if(current.value > value){
			current.left=addRecursive(current.left, value);
		}
		
		return current;
	}

}

class Node{
	 int value;
	 Node left, right;
	
	public Node(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.left=null;
		this.right = null;
	}
}