import java.util.ArrayList;

public class QuerePractice {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		// 데이터 넣기
		queue.enqueue(123);
		queue.enqueue("queue");
		
		// 데이터 빼면서 삭제하기
		queue.peek();	// 123
		System.out.println(queue.dequeue());	// "123"
		System.out.println(queue.dequeue());	// "queue"
		
		// 큐가 비어있는지 확인하기
		System.out.println(queue.isEmpty());	// true -> 비어있다
		
		// 비어 있는 큐에서 데이터를 가져오려고 할때
		System.out.println(queue.dequeue());
	}
}

// 큐 구현
class Queue {
	private ArrayList<Object> queue = new ArrayList<>();

	public void enqueue(Object param) {
		this.queue.add(param);
	}
	
	public Object dequeue() {
		if (this.queue.size() == 0) {
			System.out.println("Queue가 비어있습니다. ");
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