import java.util.ArrayList;

public class QuerePractice {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		// ������ �ֱ�
		queue.enqueue(123);
		queue.enqueue("queue");
		
		// ������ ���鼭 �����ϱ�
		queue.peek();	// 123
		System.out.println(queue.dequeue());	// "123"
		System.out.println(queue.dequeue());	// "queue"
		
		// ť�� ����ִ��� Ȯ���ϱ�
		System.out.println(queue.isEmpty());	// true -> ����ִ�
		
		// ��� �ִ� ť���� �����͸� ���������� �Ҷ�
		System.out.println(queue.dequeue());
	}
}

// ť ����
class Queue {
	private ArrayList<Object> queue = new ArrayList<>();

	public void enqueue(Object param) {
		this.queue.add(param);
	}
	
	public Object dequeue() {
		if (this.queue.size() == 0) {
			System.out.println("Queue�� ����ֽ��ϴ�. ");
			return null;
		}
		Object data = this.queue.get(0);
		this.queue.remove(0);
		return data;
	}
	
	public void peek() {
		System.out.println(this.queue.get(0));
	}
	
	public Boolean isEmpty() {
	    if (this.queue.size() == 0) {
	      return true;
	    }
	    return false;
	}
}