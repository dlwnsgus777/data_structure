import java.util.ArrayList;

public class StackPractice {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.peek();
		System.out.println(stack.pop());
		stack.peek();
		System.out.println(stack.pop());
		stack.peek();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}

class Stack {
	private ArrayList<Object> stackArray;
	
	public Stack() {
		this.stackArray = new ArrayList<Object>();
	}
	
	public void push(int param) {
		this.stackArray.add(param);
	}
	
	public Object pop() {
		if (stackArray.size() == 0) {
			System.out.println("Stack is Empty");
			return null;
		} 
		
		Object data = this.stackArray.get(stackArray.size() - 1);
		this.stackArray.remove(stackArray.size() - 1);
		return data;
	}
	
	public void peek() {
		System.out.println("Last Data : " + this.stackArray.get(stackArray.size() - 1));
	}
}


//class Stack {
//	private int[] stackArray;
//	int lastIndex;
//	
//	public Stack(int length) {
//		this.stackArray = new int[length];
//		this.lastIndex = 0;
//	}
//	
//	public void push(int param) {
//		this.stackArray[lastIndex] = param;
//		this.lastIndex += 1;
//	}
//	
//	public int pop() {
//		return stackArray[--lastIndex];
//	}
//	
//	public int peek() {
//		return stackArray[lastIndex - 1];
//	}
//}