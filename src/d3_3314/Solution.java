package d3_3314;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int sum = 0;
			int score = 0;
			
			for(int i=0; i<5; i++) {
				score = scan.nextInt();
				
				if(score < 40) {
					sum += 40;
				}else {
					sum += score;
				}
			}

			System.out.println("#" + test_case + " " + (sum/5));
		}
		
		scan.close();
	}

}
