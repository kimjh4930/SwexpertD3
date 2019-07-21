package d3_3456;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			String result = "#" + test_case + " ";
			
			if(a == b && b == c) {
				result += a;
				System.out.println(result);
				continue;
			}
			
			if( a == b) {
				result += c;
			}else if( b == c){
				result += a;
			}else {
				result += b;
			}
			
			System.out.println(result);
			
		}
		
		scan.close();
	}

}
