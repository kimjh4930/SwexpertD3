package d3023;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int D = scan.nextInt();
			int A = scan.nextInt();
			int B = scan.nextInt();
			int F = scan.nextInt();
			
			System.out.println("#" + test_case + " " + (((double)D/(A+B)) * F));
		}
		
		scan.close();
	}

}
