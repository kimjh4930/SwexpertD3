package d3034;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			int num;
			
			if(a <= b) {
				num = c/a;
			}else {
				num = c/b;
			}
			
			System.out.println("#" + test_case + " " + num);
		}
		
		scan.close();
	}

}
