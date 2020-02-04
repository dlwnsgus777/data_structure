package Heap;

import java.util.ArrayList;
import java.util.List;

public class HeapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap test = new Heap(10);
		test.getData();
		test.insert(1);
		test.insert(2);
		test.insert(13);
		test.insert(15);
		test.insert(3);
		test.getData();
		test.getData(1);
		System.out.println("poped : " + test.pop());
		System.out.println("poped : " + test.pop());
		System.out.println("poped : " + test.pop());
		test.insert(16);
		System.out.println("poped : " + test.pop());
		System.out.println("poped : " + test.pop());
		System.out.println("poped : " + test.pop());
		System.out.println("poped : " + test.pop());
		System.out.println("poped : " + test.pop());
	}
}

class Heap {
	private List<Integer> heapArr;
	
	public Heap(int data) {
		this.heapArr = new ArrayList<Integer>();
		this.heapArr.add(data);
	}
	
	public void insert(int data) {
		if (this.heapArr.get(0) == null) {
			this.heapArr.set(0, data);
			return;
		}
		
		System.out.println("Insert Data : " + data);
		
		this.heapArr.add(data);
		
		int insertIndex = this.heapArr.size() - 1;
		int parentIndex = insertIndex % 2 == 0 ? insertIndex / 2 - 1 : insertIndex / 2;
	
		while (this.heapArr.get(insertIndex) > this.heapArr.get(parentIndex)) {
			this.swap(insertIndex, parentIndex);
			insertIndex = parentIndex;
			parentIndex = insertIndex % 2 == 0 ? insertIndex / 2 - 1 : insertIndex / 2;
			if (parentIndex == -1) {
				break;
			}
		}
		
	}
	
	public int pop() {
		if (this.heapArr.size() == 0) {
			return -1;
		}
		
		int popData =  this.heapArr.get(0);
		int popIndex = 0;
		int left = popIndex * 2 + 1;
		int right = popIndex * 2 + 2;
		this.swap(popIndex, this.heapArr.size() - 1);
		this.heapArr.remove(this.heapArr.size() - 1);
		
		// 자식이 둘다 있을 때
		if (left < this.heapArr.size() - 1) {
			while (left < this.heapArr.size() - 1) {

				if (this.heapArr.get(left) > this.heapArr.get(right)) {					
					this.swap(left, popIndex);
					popIndex = left;
					left = popIndex * 2 + 1;
					right = popIndex * 2 + 2;
					
				} else {					
					this.swap(right, popIndex);
					popIndex = right;
					left = popIndex * 2 + 1;
					right = popIndex * 2 + 2;
				}				
			} 
			
		} else if (right == this.heapArr.size()) { //  오른쪽 자식만 없을 때
			this.swap(left, popIndex);
		}
		
		return popData;
	}
	
	public void getData() {
		System.out.println(this.heapArr.toString());
		System.out.println("getData Max Num : " + this.heapArr.get(0));
	}
	
	public void getData(int num) {
		System.out.println("getData Index Num : " + this.heapArr.get(num));
	}
	
	public void swap(int beforeIndex, int afterIndex) {
		int temp = this.heapArr.get(beforeIndex);
		this.heapArr.set(beforeIndex, this.heapArr.get(afterIndex));
		this.heapArr.set(afterIndex, temp);
		
		// swap이 잘 이루어졌는지 확인하고 싶을 때
		// System.out.println("Swap Result : " + this.heapArr.toString());
	}
}
