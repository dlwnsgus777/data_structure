import java.util.ArrayList;

public class QuerePractice {

	public static void main(String[] args) {
		System.out.println("project Test");
		Queue queue = new Queue();
		
		queue.enqueue(123);
		queue.enqueue("asdasd");
		queue.size();
		queue.dequeue();
		queue.dequeue();
		queue.size();
	}
}

class Queue {
	private ArrayList<Object> queue = new ArrayList<>();

	public void enqueue(Object param) {
		this.queue.add(param);
	}
	
	public Object dequeue() {
		Object data = this.queue.get(0);
		this.queue.remove(0);
		System.out.println(data);
		return data;
	}
	
	public void size() {
		System.out.println(this.queue.size());
	}
}