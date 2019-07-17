package d3018;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int num = scan.nextInt();
			
			int ret = 0;
			
			if(num < 100) {
				ret = 0;
			}else if (num >= 100 && num<1000) {
				ret = 1;
			}else if (num >= 1000 && num<10000) {
				ret = 2;
			}else if(num >= 10000 && num<100000) {
				ret = 3;
			}else if(num >= 100000 && num<1000000) {
				ret = 4;
			}else {
				ret = 5;
			}
			
			System.out.println("#" + test_case + " " + ret);
			
		}
		
		scan.close();
	}

}
