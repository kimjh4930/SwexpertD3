package d3_8741;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int test_case=1; test_case<=T; test_case++) {
			StringBuilder str = new StringBuilder();
			String[] inputList = scan.nextLine().split(" ");
			
			for(String input : inputList) {
				str.append(input.charAt(0));
			}
			
			System.out.println("#" + test_case + " " + str.toString().toUpperCase());
			
		}
		
		scan.close();
		
	}

}
