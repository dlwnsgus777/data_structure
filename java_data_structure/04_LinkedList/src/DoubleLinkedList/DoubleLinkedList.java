package DoubleLinkedList;

public class DoubleLinkedList {

	public static void main(String[] args) {
		LinkedListDouble list = new LinkedListDouble(0);
		
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		
		list.desc();
		list.add_front(1.5, 2);
		list.desc();
	}

}


class LinkedListDouble {
	private LinkedListDouble prev;
	private LinkedListDouble head;
	private LinkedListDouble tail;
	private Object data;
	private LinkedListDouble next;
	
	public Object getData() {
		return this.data;
	}
	
	public LinkedListDouble(Object data) {
		this.data = data;
		this.prev = null;
		this.head = this;
		this.tail = this;
		this.next = null;
	}
	
	public LinkedListDouble get() {
		return this;
	}
	
	public void desc() {
		LinkedListDouble node = this.head.get();
		while (node != null) {
			System.out.println(node.getData());
			node = node.next;
		}
	}
	
	public LinkedListDouble getDoubleLinked() {
		return this;
	}
	
	public void add_front(Object data, Object befor_front) {
		LinkedListDouble node = this.head;
		LinkedListDouble list = new LinkedListDouble(data);
		while (node.getData() != befor_front) {
			node = node.next;
		}
		LinkedListDouble prevNode = node.prev; // 1 
		list.next = node;
		prevNode.next = list;
		list.prev = prevNode;
	}
	
	public void add(Object data) {
		LinkedListDouble list = new LinkedListDouble(data);
		LinkedListDouble nextList = this.head;
		
		if (nextList == null) {
			this.next = list;
			list.prev = this;
			this.tail = list;
		} else {
			while (nextList.next != null) {
				nextList = nextList.next;
			}
			nextList.next = list;
			list.prev = nextList;
			this.tail = list;
		}
	}

}