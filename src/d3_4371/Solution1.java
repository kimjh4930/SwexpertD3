package d3_4371;

import java.util.Scanner;

public class Solution1 {
	
	static int[] funnyDays = new int[5001];
	static int[] visited = new int[5001];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int days = scan.nextInt();
			
			//input
			for(int i=0; i<days; i++) {
				funnyDays[i] = scan.nextInt();
			}
			
			int ships = 0;
			int temp = funnyDays[0];
			visited[0] = 1;
			
			for(int i=1; i<days; i++) {
				temp = funnyDays[0];
				
				if(visited[i] == 1) {
					continue;
				}
				
				temp = funnyDays[i] - temp;
				
				for(int j=i; j<days; j++) {
					
				}
				
			}
			
			System.out.println("#" + test_case + " " + ships);
			
			for(int i=0; i<days; i++) {
				funnyDays[i] = 0;
				visited[i] = 0;
			}
			
		}
		
		scan.close();
	}

}
