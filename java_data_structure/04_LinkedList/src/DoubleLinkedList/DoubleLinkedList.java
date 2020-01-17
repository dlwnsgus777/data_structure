package DoubleLinkedList;

public class DoubleLinkedList {

	public static void main(String[] args) {
		LinkedListDouble list = new LinkedListDouble(0);
		
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		
		list.desc();
	}

}

class LinkedList {
	private Object data;
	private Object next;
	
	public LinkedList(Object data) {
		this.data = data;
		this.next = null;
	}
	
	public LinkedList get() {
		return this;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public LinkedList getNext() {
		return (LinkedList) this.next;
	}
	
	public void add(Object data) {
		this.next = new LinkedList(data);
	}
}

class LinkedListDouble {
	private LinkedList prev;
	private LinkedList head;
	private LinkedList tail;
	private LinkedList data;
	
	public LinkedListDouble(Object data) {
		this.data = new LinkedList(data);
		this.prev = null;
		this.head = this.prev;
		this.tail = this.data;
	}
	
	public void desc() {
		LinkedList node = this.head.get();
		System.out.println(node.getData());
		while (node != null) {
			System.out.println("asdasd" + node.getData());
			node = node.getNext();
		}
	}
	
	public void add_front(Object data, LinkedListDouble befor_front) {

	}
	
	public void add(Object data) {

		LinkedListDouble list = new LinkedListDouble(data);
		System.out.println(list.data.getData());
		list.prev = this.data;
		System.out.println("dlwjsepdlxj" + list.prev.getData());
		this.data.add(list.data);
		this.tail = list.data;
		
	}
	

}