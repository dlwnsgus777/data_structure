
public class ArrayPractice {

	public static void main(String[] args) {
		int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println("1�� ���� : 2���� �迭 {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}} ����  9, 8, 7�� ����Ͻÿ�");
		System.out.println(array[2][2] + ", " + array[2][1] + ", " + array[2][0]);
		
		String[] strArray = {"Braund, Mr. Owen Harris",
				"Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
				"Heikkinen, Miss. Laina",
				"Futrelle, Mrs. Jacques Heath (Lily May Peel)",
				"Allen, Mr. William Henry",
				"Moran, Mr. James",
				"McCarthy, Mr. Timothy J",
				"Palsson, Master. Gosta Leonard",
				"Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
				"Nasser, Mrs. Nicholas (Adele Achem)",
				"Sandstrom, Miss. Marguerite Rut",
				"Bonnell, Miss. Elizabeth",
				"Saundercock, Mr. William Henry",
				"Andersson, Mr. Anders Johan",
				"Vestrom, Miss. Hulda Amanda Adolfina",
				"Hewlett, Mrs. (Mary D Kingcome) ",
				"Rice, Master. Eugene",
				"Williams, Mr. Charles Eugene",
				"Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
				"Masselmani, Mrs. Fatima",
				"Fynney, Mr. Joseph J",
				"Beesley, Mr. Lawrence",
				"McGowan, Miss. Anna \"Annie\"",
				"Sloper, Mr. William Thompson",
				"Palsson, Miss. Torborg Danira",
				"Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
				"Emir, Mr. Farred Chehab",
				"Fortune, Mr. Charles Alexander",
				"Dwyer, Miss. Ellen \"Nellie\"",
				"Todoroff, Mr. Lalio"};
		
		System.out.println("���ڿ� �迭���� M�� �� ������ ��ϱ��?");
		
		int m_count = 0;
		for(String s : strArray) {
			for(int i = 0; i < s.length(); i++) {
				
				if (s.charAt(i) == 'M') {
					m_count += 1;
				}
			}
		}
		
		System.out.println("���� : " + m_count + "��");
		
	
	}
}
