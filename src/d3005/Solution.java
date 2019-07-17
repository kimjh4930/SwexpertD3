package d3005;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {		
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		
		for(int test_case=1; test_case <= T; test_case++) {
		
			int S = scan.nextInt();
			int E = scan.nextInt();
			int M = scan.nextInt();
			
			System.out.print("#" + test_case + " ");
			
			for(int i=0; i<254040; i++) {
				if((i%365+1) == S && (i%24+1) == E && (i%29+1) == M) {
					System.out.println(i+1);
					break;
				}
			}
			
		}
		scan.close();
	}
}
