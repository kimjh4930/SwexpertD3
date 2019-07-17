package d3_4522;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		next : for(int test_case=1; test_case<=T; test_case++) {
			String input = scan.nextLine();
			int length = input.length();
			
			System.out.print("#" + test_case + " ");
			
			for(int i=0; i<length/2; i++) {
				
				if(input.charAt(i) == '?' || input.charAt(length-1-i) == '?') {
					continue;
				}
				
				if(input.charAt(i) != input.charAt(length-1-i)) {
					System.out.println("Not exist");
					continue next;
				}
			}
			
			System.out.println("Exist");
		}
		
		scan.close();
	}

}
