package d3026;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int N = scan.nextInt();
			int Q = scan.nextInt();
			
			int boxes[] = new int[N+1];
			
			for(int i=1; i<=Q; i++) {
				int L = scan.nextInt();
				int R = scan.nextInt();
				
				for(int j=L; j<=R; j++) {
					boxes[j] = i;
				}
			}
			
			System.out.print("#" + test_case + " ");
			for(int i=1; i<boxes.length; i++) {
				System.out.print(boxes[i] + " ");
			}
			
			System.out.println("");
			
		}
		
		scan.close();
	}

}
