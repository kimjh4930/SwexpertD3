package d3012;

import java.util.Scanner;

public class Solution {
	
	static int scores[] = new int[21];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			int max = -1;
			int count = 0;
			
			//N : 사람, M : 문
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=M; j++) {
					int score = scan.nextInt();
					scores[i] += score;
				}

				if(scores[i] > max) {
					max = scores[i];
				}
			}
			
			for(int i=1; i<=N ; i++) {
				if(scores[i] == max) {
					count++;
				}
			}
			
			System.out.println("#" + test_case + " " + count + " " + max);
			
			for(int i=1; i<=N; i++) {
				scores[i] = 0;
			}
			
		}
		
		scan.close();
	}

}
