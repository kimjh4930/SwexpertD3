package d3019;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int num = scan.nextInt();
			
			double sum = 0.0;
			for(int i=0; i<num; i++) {
				double chance = scan.nextDouble();
				int money = scan.nextInt();
				
				sum += chance * money;
			}
			
			System.out.println("#" + test_case + " " + sum);
		}
		
		scan.close();
	}

}
