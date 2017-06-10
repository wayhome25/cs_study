package algorithm_tryhelloworld;

import java.util.Arrays;

public class GetMinMaxString2 {
	public String getMinMaxString(String str) {
		String[] array = str.split(" ");
		int[] arrayInt = new int[array.length];
		
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = Integer.parseInt(array[i]);
		}
		
		Arrays.sort(arrayInt); // 최소 O(N LogN)의 시간복잡도 
		String result = arrayInt[0] + " " + arrayInt[arrayInt.length - 1];
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		String str = "1 2 3 4";
		GetMinMaxString2 minMax = new GetMinMaxString2();
		System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
	}

}
