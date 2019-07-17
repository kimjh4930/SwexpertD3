package d3017;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int stairs = scan.nextInt();
			
			int upMax = 0;
			int downMax = 0;
			int formerStair = -1;
			
			for(int i=0; i<stairs; i++) {
				int stair = scan.nextInt();
				
				if(formerStair == -1) {
					formerStair = stair;
					continue;
				}
				
				int diff = stair - formerStair;
				
				//내려오기.
				if(diff < 0) {
					if(downMax < (-diff)) {
						downMax = -diff;
					}
				}else if(diff > 0) {
					if(upMax < diff) {
						upMax = diff;
					}
				}
				
				formerStair = stair;
			}
			
			System.out.println("#" + test_case + " " + upMax + " " + downMax + " ");
		}
		
		scan.close();
	}

}
