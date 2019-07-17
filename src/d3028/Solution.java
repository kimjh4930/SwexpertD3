package d3028;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int test_case=1; test_case<=T; test_case++) {
			String numStr = scan.nextLine();
			
			switch (numStr.charAt(numStr.length() -1)) {
			case '0':
			case '2':
			case '4':
			case '6':
			case '8':
				System.out.println("#" + test_case + " Even");
				break;
			default :
				System.out.println("#" + test_case + " Odd");
			}
		}
		
		scan.close();
	}

}
