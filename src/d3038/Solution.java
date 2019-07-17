package d3038;

import java.util.Scanner;

public class Solution {
	
	static String[] newString = new String[101];
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int max = -1;
		
		for(int i=0; i<101; i++) {
			newString[i] = "";
		}
		
		for(int test_case=1; test_case<=T; test_case++) {
			scan.nextLine();
			String str = scan.nextLine();
			
			int num = scan.nextInt();
			for(int i=0; i<num; i++) {
				int location = scan.nextInt();
				newString[location] += "-";
				if(location > max) {
					max = location;
				}
			}
			
			int length = str.length();
			for(int i=0; i<length; i++) {
				newString[i] += str.charAt(i);
			}
			if(max < length) {
				max = length;
			}
			
			System.out.print("#" + test_case + " ");
			for(int i=0; i<=max; i++) {
				System.out.print(newString[i]);
			}
			System.out.println("");
			
			//clear
			for(int i=0; i<=max; i++) {
				newString[i] = "";
			}
			max = -1;
			
		}
		scan.close();
		
	}

}
