
public class TreePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree(10);
		tree.insertData(7);
		tree.insertData(15);
		tree.insertData(13);
		tree.insertData(5);
		tree.insertData(9);
		tree.insertData(14);
		tree.insertData(16);
		System.out.println(tree.getData(1));
		tree.removeData(10);
		System.out.println("search 15 ��  : " + tree.getData(15));
		System.out.println("search 13 ��  : " + tree.getData(13));
		System.out.println("search 17 ��  : " + tree.getData(17));
		System.out.println("search 16 ��  : " + tree.getData(16));
	}
	
}

class Tree {
	private int value;
	private Tree left;
	private Tree right;
	private Tree root;
	
	public Tree(Object data) {
		// TODO Auto-generated constructor stub
		this.value = (int) data;
		this.left = null;
		this.right = null;
		this.root = this;
	}
	
	public void changeNode(Tree node) {
		this.value = node.value;
		this.left = node.left;
		this.right = node.right;
		this.root = node.root;
	}
	
	public void insertData(Object data) {
		if (this.root == null) {
			System.out.println("this is not Type of Tree");
		}
		
		Tree tree = new Tree(data);
		Tree searchRoot = this.root;
		
		while (searchRoot.hasBranch(tree)) {
			if (searchRoot.value > tree.value) {
				searchRoot = searchRoot.left;
			} else {
				searchRoot = searchRoot.right;
			}
		}
		
		tree.setRoot(searchRoot);
		
		if (searchRoot.value > tree.value) {
			searchRoot.left = tree;
		} else {
			searchRoot.right = tree;
		}
		
		
	}
	
	public void removeData(Object data) {
		int search = (int) data;
		Tree searchRoot = this.root;

		while (searchRoot.hasBranch(search)) {
			if (searchRoot.value > search) {
				searchRoot = searchRoot.left;

			} else if (searchRoot.value < search) {
				searchRoot = searchRoot.right;
			}
			
			if (searchRoot.value == search) {
				break;
			}
		}
		
		
		// ������ ����� branch �� ���� ��
		if (searchRoot.left == null && searchRoot.right == null) {
			if (searchRoot.value > searchRoot.root.value) {
				searchRoot.root.right = null;
			} else {
				searchRoot.root.left = null;
			}
		}
		
		// ������ ����� branch �� 1���� ��
		if (searchRoot.left != null && searchRoot.right == null) {
			System.out.println("�ڽ� 1�� left: " + searchRoot.value);
			System.out.println("�θ� : " + searchRoot.root.value);
			searchRoot.left.setRoot(searchRoot.root);
			searchRoot.root.left = searchRoot.left;

		} else if (searchRoot.right != null && searchRoot.left == null) {
			System.out.println("�ڽ� 1�� right: " + searchRoot.right.value);
			System.out.println("�θ� : " + searchRoot.root.value);
			searchRoot.right.setRoot(searchRoot.root);
			searchRoot.root.right = searchRoot.right;
		}

		// ������ ����� branch �� 2���� �� -> �������� ���� ���� ������ ����
		if (searchRoot.left != null && searchRoot.right != null) {
			Tree startBranch = searchRoot.right;
			
			while (startBranch.left != null) {
				startBranch = startBranch.getLeft();
			}
			
			if (startBranch.right != null) {
				startBranch.root.left = startBranch.getRight();
			}
			System.out.println("�ΰ��϶� �����ʿ��� ���� ������ " + startBranch.value);
			System.out.println("�ΰ��϶� �����ʿ��� ���� ������ ��Ʈ �� " + startBranch.root.value);
			
			
			startBranch.right = searchRoot.getRight();
			startBranch.left = searchRoot.getLeft();
			startBranch.setRoot(searchRoot);
			startBranch.right.setRoot(startBranch);
			startBranch.left.setRoot(startBranch);
			
			searchRoot.changeNode(startBranch);
			
		}
		
	}
	
	public Object getData(Object data) {
		int result = 0;
		int search = (int) data;
		Tree searchRoot = this.root;

		while (searchRoot.hasBranch(search)) {
			
			if (searchRoot.value > search) {
				searchRoot = searchRoot.left;

			} else if (searchRoot.value < search) {
				searchRoot = searchRoot.right;
			}
			
			if (searchRoot.value == search) {
				result = searchRoot.value;
				break;
			}
		}
		
		return result == search ? result : false;
	}
	
	public void setRoot(Tree root) {
		this.root = root;
	}
	
	public Tree getLeft() {

		return this.left;
	}
	
	public Tree getRight() {

		return this.right;
	}
	
	
	private Boolean hasBranch(Tree tree) {
		if (this.value > tree.value && this.left != null) {
			return true;
		} else if (this.value <= tree.value && this.right != null) {
			return true;
		} else {
			return false;
		}
	}
	
	private Boolean hasBranch(int data) {
		if (this.value > data && this.left != null) {
			return true;
		} else if (this.value <= data && this.right != null) {
			return true;
		} else {
			return false;
		}
	}
}
