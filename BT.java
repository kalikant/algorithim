package org.ds.examples;

import java.util.TreeSet;



public class BT {

		
	private BTNode root;
	
	public BT()
	{
		root=null;
	}
	
	
	// function to check if tree is empty
	public boolean isEmpty()
	{
		return root==null;
	}
	
	// function to insert data 
	
	public void insert(int data)
	{
		root=insert(root,data);
	}
	
	
	private BTNode insert(BTNode node,int data)
	{
		if(node == null)
			node=new BTNode(data);
		else
		{
			if(node.getLeft() == null)
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right,data);
			
		}
		return node;
	}
	
	// function to count no of rows
	
	public int countNodes()
	{
		return countNodes(root);
	}
	
	private int countNodes(BTNode node)
	{
		if(node == null)
			return 0;
		else
		{
			int count=1;
			count +=countNodes(node.getLeft());
			count +=countNodes(node.getRight());
			return count;
		}
	}
	
	// function to search an element recursively
	
	public boolean search(int val)
	{
		return search(root,val);
		
	}
	
	private boolean search(BTNode node,int val)
	{
		if(node == null)
			return false;
		
		if (node.getData() == val)
			return true;
		
		if(node.getLeft() != null)
			if(search(node.getLeft(),val))
				return true;
		
		if(node.getRight() !=null)
			if(search(node.getRight(),val))
				return true;
		
		return false;
		
	}
	
	// function for inorder traversal
	public void inorder()
	{
		inorder(root);
	}
	
	private void inorder(BTNode node)
	{
		if(node != null)
		{
			inorder(node.getLeft());
			System.out.print(node.getData() + "," );
			inorder(node.getRight());
		}
	}
	
	// function to print pre-order traversal
	public void preorder()
	{
		preorder(root);
	}
	
	private void preorder(BTNode node)
	{
		if(node != null)
		{
			System.out.print(node.getData() + "," );
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	
	// function to print post-order traversal
		public void postorder()
		{
			postorder(root);
		}
		
		private void postorder(BTNode node)
		{
			if(node != null)
			{
				postorder(node.getLeft());
				postorder(node.getRight());
				System.out.print(node.getData() + "," );
			}
		}
		
	
}

