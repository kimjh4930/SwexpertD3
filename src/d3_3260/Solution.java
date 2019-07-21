package d3_3260;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int test_case=1; test_case<=T; test_case++) {
			String line = scan.nextLine();
			
			String[] numbers = line.split(" ");
			
			char[] num1 = numbers[0].toCharArray();
			char[] num2 = numbers[1].toCharArray();
			
			String result = "";
			
			if(num1.length >= num2.length) {
				result = plus(num1, num2);
			}else {
				result = plus(num2, num1);
			}
			
			System.out.println("#" + test_case + " " + result);
			
		}
		
		scan.close();
	}
	
	static String plus (char[] num1, char[] num2) {
		String result = "";
		
		int length1 = num1.length;
		int length2 = num2.length;
		boolean up = false;
		
		for(int i=0; i<length1; i++) {
			int n1=0, n2=0, sum = 0;
			
			n1 = num1[length1-1-i] - '0';
			
			if(length2-1-i >= 0) {
				n2 = num2[length2-1-i] - '0';
			}
			sum = n1 + n2;
			
			if(up == true) {
				sum += 1;
				up = false;
			}
			
			if(sum >= 10) {
				sum -= 10;
				up = true;
			}
			
			result = sum + result;
		}

		if(up == true) {
			result = 1 + result;
		}
		
		return result;
	}

}
