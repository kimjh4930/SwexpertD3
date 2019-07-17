package d3003;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int lines = scan.nextInt();
			scan.nextLine();
			
			String sentence = scan.nextLine();
			
			int names = 0;
			boolean isUpper = false;
			boolean isLower = false;
			boolean isDigit = false;
			
			System.out.print("#" + test_case + " ");
			
			for(int i=0; i<sentence.length(); i++) {
				if(sentence.charAt(i) == '!' || sentence.charAt(i) == '?' || sentence.charAt(i) == '.') {
					//nextline
					//모든 내용을 초기화함.
					if(isUpper == true && isLower == true && isDigit == false) {
						names++;
					}
					
					System.out.print(names + " ");
					isUpper = isLower = isDigit = false;
					names = 0;
					
					continue;
				}
				
				if(sentence.charAt(i) == ' ') {
					if(isUpper == true && isLower == true && isDigit == false) {
						names++;
					}
					isUpper = isLower = isDigit = false;
					
					continue;
				}
				
				if(sentence.charAt(i) >= '0' && sentence.charAt(i) <= '9') {
					isDigit = true;
					
					continue;
				}
				
				if(sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z') {
					if(isUpper == true) {
						isUpper = false;
						continue;
					}

					if(isLower == false && isDigit == false) {
						isUpper = true;
						continue;
					}
				}
				
				if(sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
					if(isUpper == true) {
						isLower = true;
						continue;
					}
				}
			}
			System.out.println("");
		}
		
		scan.close();
	}

}
