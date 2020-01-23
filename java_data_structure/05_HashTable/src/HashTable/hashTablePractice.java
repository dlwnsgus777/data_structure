package HashTable;

import java.security.MessageDigest;

public class hashTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable ht = new HashTable(12);
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
}