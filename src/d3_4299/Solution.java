package d3_4299;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int promisedTime = 11*60 + 11;
		
		for(int test_case=1; test_case<=T; test_case++) {
			int D = scan.nextInt();
			int H = scan.nextInt();
			int M = scan.nextInt();
			
			int recognizedTime = (D-11) * 1440 + H * 60 + M;
			
			System.out.print("#" + test_case + " ");
			
			if(promisedTime > recognizedTime) {
				System.out.println("-1");
			}else {
				System.out.println(recognizedTime - promisedTime);
			}
			
		}
		
		scan.close();
		
	}

}
