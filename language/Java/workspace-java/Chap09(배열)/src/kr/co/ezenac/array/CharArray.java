package kr.co.ezenac.array;

public class CharArray {

	public static void main(String[] args) {
		
		char[] alphabet =new char[26];
		char ch = 'A';
		
		for(int i=0;i<alphabet.length;i++) {
			alphabet[i] = ch++;
			
		}
		for(char alpha : alphabet) {
			System.out.println(alpha+", "+(int)alpha);
		}
	}

}
