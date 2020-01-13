

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList list = new LinkedList("one");
		LinkedList head = list;		// 첫번째 노드를 저장하기 위한 변수
		
		for (int i = 0; i < 10; i ++) {
			list.add(i);
			list = list.getNext();
		}
		
		list = head;

		while (list.hasNext()) {
			list.get();
			list = list.getNext();
		}
		list.get();
	}
}

class LinkedList {
	private Object data;
	private Object next;
	
	public LinkedList(Object data) {
		this.data = data;
		this.next = null;
	}
	
	public void add(Object data) {
		LinkedList linked = new LinkedList(data);
		this.next = linked;
	}
	
	public void get() {
		System.out.println(this.data);
	}
	
	public LinkedList getNext() {
		return (LinkedList)next;
	}
	
	public boolean hasNext() {
		if (this.next != null) {
			return true;
		} else {
			return false;
		}
	}
}
