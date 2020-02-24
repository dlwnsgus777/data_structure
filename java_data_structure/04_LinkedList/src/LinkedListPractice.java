

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList list = new LinkedList("one");
		list.add(2);
		list.findData(2);
		list.add("one", 3);
		list.printAll();
		list.add("Test");
		list.printAll();
	}
}

class Node {
	
	private Object data;
	private Object next;
	
	public Node(Object data) {
		this.data = data;
		this.next = null;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public Object getNext() {
		return this.next;
	}
	
	public void setNext(Object nextNode) {
		this.next = nextNode;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}

class LinkedList {
	
	private Node data;
	private Node head;
	
	public LinkedList(Object data) {
		this.data = new Node(data);
		this.head = this.data;
	}
	
	public void add(Object data) {
		if (this.data.getNext() == null) { 
			Node node = new Node(data);
			this.data.setNext(node);
		} else {
			Node endNode = findEndData();
			Node node = new Node(data);
			endNode.setNext(node);
		}
		
		System.out.println("Success Add");
	}
	
	// 첫번째 인자로 받은 값을 가지는 리스트 다음에 data추가.
	public void add(Object between, Object data) {
		Node beforeNode = findData(between);
		Node afterNode = (Node) beforeNode.getNext();
		
		if (beforeNode != null) {
			Node node = new Node(data);
			beforeNode.setNext(node);
			node.setNext(afterNode);
			System.out.println("Success Add Between Data -> " + beforeNode.getData());
		} 
	}
	
	public Node findEndData() {
		Node node = this.data;
		while (node.getNext() != null) {
			node = (Node) node.getNext();
		}	
		return node;
	}
	
	public Node findData(Object value) {
		if (this.head.getNext() == null) {
			return null;
		}
		Node node = this.head;
		while (node != null) {
			if (node.getData() == value) {
				System.out.println("find Success : " + node.getData());
				return node;
			}
			node = (Node) node.getNext();
		}
		return null;
	}
	
	public void printAll() {
		Node head = this.head;
		
		while (head != null) {
			System.out.println(head.getData());
			head = (Node) head.getNext();
		}
	}
}
