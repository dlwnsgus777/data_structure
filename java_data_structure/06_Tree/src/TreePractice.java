
public class TreePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("추후 작성 예정");
		System.out.println("???");
	}
	
}

class Tree {
	private Object value;
	private Tree left;
	private Tree right;
	private Tree root;
	
	public Tree(Object data) {
		// TODO Auto-generated constructor stub
		this.value = data;
		this.left = null;
		this.right = null;
		this.root = this;
	}
	
	public void insertData(Object data) {
		if (this.root == null) {
			System.out.println("this is not Type of Tree");
		}
		
		Tree tree = new Tree(data);
		
	}
	
	public Tree getLeft() {
		return this.left;
	}
	
	public Tree getRight() {
		return this.right;
	}
	
	private Boolean hasBranch(Tree tree) {
		return true;
	}
}
