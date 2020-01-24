package HashTable;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;

public class hashTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable ht = new HashTable(12);
		ht.insert_data("Lee", "ABCD");
		ht.insert_data("Lee", "BCBC");
		ht.insert_data("Lee", "dvdv");
		ht.insert_data("Andy", "andy's data");
		Object data = ht.get_data("Lee");
		Object andyData = ht.get_data("Andy");
		System.out.println("this data is " +  data);
		System.out.println("this data is " +  andyData);
	}
}

class HashTable {
	private Object[] hash_table;
	
	public HashTable(int size) {
		// TODO Auto-generated constructor stub
		hash_table = new Object[size];
		for (int i = 0; i < size; i++) {
			hash_table[i] = 0;
		}
	}
	
	public void desc() {
		for(Object value: this.hash_table) {
			System.out.print(value.toString() + " ");
		}
	}
	
	public int hash_function(String data) {
		MessageDigest md;
		int hashNumber = 0;
		
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(data.getBytes());
			
			byte[] mdToString = md.digest();
			
			for (int i = 0; i < mdToString.length; i++) {
				byte mdToByte = mdToString[i];
				hashNumber += (mdToByte & 0xff);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return hashNumber; 
	}
	
	public int getKey(int data) {
		return data % 12;
	}
	
	public void insert_data(String key, Object data) {
		int hashData = this.hash_function(key);
		int tableKey = this.getKey(hashData);
		ArrayList<Object> hashArr = new ArrayList();
		Object[] key_value = {hashData, data};
		hashArr.add(key_value);
		
		if (this.hash_table[tableKey] == (Object)0) {
			this.hash_table[tableKey] = hashArr;
		} else {
			ArrayList<Object> originData = (ArrayList<Object>) this.hash_table[tableKey];
			for (int i = 0; i < originData.size(); i++) {
				Object[] dataArray = (Object[]) originData.get(i);
				if (dataArray[0] == key) {
					dataArray[1] = data;
				} else {
					originData.add(key_value);
					return;
				}
			}

		}
	}
	
	public Object get_data(String key) {
		int hashData = this.hash_function(key);
		int tableKey = this.getKey(hashData);
		Object[] data = null;
		
		if (this.hash_table[tableKey] == (Object)0) {
			System.out.println("None Data");
			return null;
		} else {
			ArrayList<Object> originData = (ArrayList<Object>) this.hash_table[tableKey];
			for (int i = 0; i < originData.size(); i++) {
				data = (Object[]) originData.get(i);
				System.out.println(data[1].toString());
				if (data[0] == key) {
					System.out.println(data[1]);
				}
			}
		}
		return data[1];
		
	}
}