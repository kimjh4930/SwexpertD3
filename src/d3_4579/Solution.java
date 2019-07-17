package d3_4579;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			String input = scan.nextLine();
			int length = input.length();
			boolean flag = true;
			
			for(int i=0; i<input.length()/2; i++) {
				
				if(input.charAt(i) == '*' || input.charAt(length-1-i) == '*') {
					break;
				}
				
				if(input.charAt(i) != input.charAt(length-1-i)) {
					flag = false;
					break;
				}
			}
			
			System.out.print("#" + test_case + " ");
			
			if(flag) {
				System.out.println("Exist");
			}else {
				System.out.println("Not exist");
			}
			
		}
		
		scan.close();
	}

}
