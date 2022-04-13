package kr.co.ezenac.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionVSStreamTest {

	public static void main(String[] args) {
		int arr[]= {1, 5, 3, 2, 4};
		List<Integer> list = new ArrayList<>();
		
		// 컬렉션 프레임워크를 이용한 방식
		for(int i: arr) {
			if(i%2==1) {
				list.add(i);
			}
		}
		Collections.sort(list);			// 오름차순 정렬
		for(int i:list) {
			System.out.print(i+"\t");
		}
		System.out.println();
		// stream 이용한 방식
		Arrays.stream(arr)
			.filter(n ->n%2==1)
			  .sorted()
			    .forEach(n -> System.out.print(n + "\t"));
	}

}
