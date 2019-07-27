package d3_3975;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
		
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			int D = scan.nextInt();
			
			int alice = A * D;
			int bob = B * C;
			
			if(alice > bob) {
				System.out.println("#" + test_case + " ALICE");
			}else if(alice < bob) {
				System.out.println("#" + test_case + " BOB");
			}else {
				System.out.println("#" + test_case + " DRAW");
			}
			
		}
		
		scan.close();
	}

}
