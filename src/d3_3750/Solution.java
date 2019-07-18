package d3_3750;

import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int test_case=1; test_case<=T; test_case++) {
			String input = scan.nextLine();
			int length = input.length();
			int num = 0;
			
			for(int i=0; i<length; i++) {
				num = num + (input.charAt(i)-'0');
			}
			System.out.println("num : " + num);
			System.out.println("#" + test_case + " " + plus(num));
		}
		
		scan.close();
	}
	
	static int plus (int number) {
		
		if(number < 10) {
			return number;
		}
		
		int temp = number;
		int sum = 0;
		while(temp != 0) {
			sum += (temp%10);
			temp /= 10;
			System.out.println("sum : " + sum);
		}
		
		return plus(sum);
	}

}
