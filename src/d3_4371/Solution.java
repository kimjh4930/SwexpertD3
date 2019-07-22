package d3_4371;

import java.util.Scanner;

public class Solution {
	
	static long[] harbors = new long[5001];
	static int[] visited = new int[5001];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int days = scan.nextInt();

			for(int i=1; i<=days; i++) {
				harbors[i] = scan.nextInt();
			}

			int ships = 0;
			int first = 1;
			for(int i=2; i<=days; i++) {
				long term = harbors[i]-first;
				
				if(visited[i] == 0) {
					visited[i] = 1;
					ships++;
				}
				
				for(int j=i+1; j<=days; j++) {
					if((harbors[j] - harbors[i]) % term == 0) {
						if(visited[j] == 0) {
							visited[j] = 1;
						}
					}
				}
			}
			
			System.out.println("#" + test_case + " " + ships);
			
			for(int i=1; i<=days; i++) {
				harbors[i] = 0;
				visited[i] = 0;
			}
		}
		scan.close();
	}

}
