package d3_4406;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T= scan.nextInt();
		scan.nextLine();
		
		for(int test_case=1; test_case<=T; test_case++) {
			String input = scan.nextLine();
			int length = input.length();
			String answer = "";
			char word;
			
			for(int i=0; i<length; i++) {
				word = input.charAt(i);
				if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
					continue;
				}else {
					answer += word;
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
		
		scan.close();
	}

}
