package kr.co.ezenac.array4;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		double arr[]= {4.4, 3.3, 2.2, 1.1};
		String arr2[] = {"이순신","권율","이연","류성룡"};
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
//		for(double d : arr) {
//			System.out.print(d+"\t");
//		}
//		System.out.println();
//		
//		for(String s : arr2) {
//			System.out.print(s+"\t");
//		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
