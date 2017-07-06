package algorithm_tryhelloworld;

import java.util.ArrayList;

public class SelfNumber {
	private static ArrayList<Integer> numberHasGenerator;
	
	public static void main(String[] args) {
		calculateNumberHasGenerator();
		int sum = 0;
		for (int i=0; i<5001; i++) {
			if (!hasGenerator(i)) {
				sum += i;
			}
			System.out.println("sum: "+sum);
		}
	}
	
	private static boolean hasGenerator(int num) {
		return
	}
}
