
public class StackPractice {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}

}

class Stack {
	private int[] stackArray;
	int lastIndex;
	
	public Stack(int length) {
		this.stackArray = new int[length];
		this.lastIndex = 0;
	}
	
	public void push(int param) {
		this.stackArray[lastIndex] = param;
		this.lastIndex += 1;
	}
	
	public int pop() {
		return stackArray[--lastIndex];
	}
	
	public int peek() {
		return stackArray[lastIndex - 1];
	}
}
