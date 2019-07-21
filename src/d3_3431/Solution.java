package d3_3431;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int L = scan.nextInt();
			int U = scan.nextInt();
			int X = scan.nextInt();
			
			String result = "#" + test_case + " ";
			
			if(X >= L && X <= U) {
				result += "0";
			}else if(X <= L) {
				result += (L-X);
			}else {
				result += "-1";
			}
			
			System.out.println(result);
		}
		
		scan.close();
	}

}
