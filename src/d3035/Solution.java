package d3035;

import java.util.Scanner;

public class Solution {
	
	static char[] clapPerson = new char[1002];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int test_case=1; test_case<=T; test_case++) {
			String clapStr = scan.nextLine();
			
			for(int i=0; i<clapStr.length(); i++) {
				clapPerson[i+1] = clapStr.charAt(i);
			}
			
			int need = 0 ;
			int sum = clapPerson[1] - '0';
			
			for(int i=1; i<=clapStr.length(); i++) {
				if(i > sum) {
					need += ((i-1) - sum);
				}
				sum += clapPerson[i] - '0';
			}
			
			System.out.println("#" + test_case + " " + need);
			
			for(int i=0; i<1002; i++) {
				clapPerson[i] = '\0';
			}
			
		}
		
		scan.close();
	}
}
