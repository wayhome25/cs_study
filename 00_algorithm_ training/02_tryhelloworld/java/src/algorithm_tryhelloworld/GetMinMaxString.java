package algorithm_tryhelloworld;

public class GetMinMaxString {
	public String getMinMaxString(String str) {
		String[] tmp = str.split(" ");
		int min, max, n;
		min = max = Integer.parseInt(tmp[0]);
		for (int i = 1; i < tmp.length; i++){
			n = Integer.parseInt(tmp[i]);
			if (min > n) min = n;
			if (max < n) max = n;
		}

		return min + " " + max;
		
	}
	
	public static void main(String[] args) {
		String str = "1 2 3 4";
		GetMinMaxString minMax = new GetMinMaxString();
		System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
	}

}
