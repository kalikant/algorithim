public class BTNode {

	BTNode left,right;
	int data;
	
	public BTNode getLeft() {
		return left;
	}
	public void setLeft(BTNode left) {
		this.left = left;
	}
	public BTNode getRight() {
		return right;
	}
	public void setRight(BTNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BTNode(BTNode left, BTNode right, int data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}
	public BTNode(int data) {
		super();
		this.data = data;
	}
	
	
	
	
	
}
