package kr.co.ezenac.loop;

//********
//*******
//******
//*****
//***
//***
//**
//*

public class ForTriangle {

	public static void main(String[] args) {
		int number=8;
		for(int i=1;i<=8;i++) {
			for(int j=0;j<number;j++) {
				System.out.print("*");
			}
			number--;
			System.out.println();
		}
	}

}
 