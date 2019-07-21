package d3_3499;

import java.util.Scanner;

public class Solution {
	
	static String[] cards;
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int card = scan.nextInt();
			scan.nextLine();
			
			String input = scan.nextLine();
			cards = input.split(" ");
			int j=0;
			
			String result = "#" + test_case + " ";
			for(int i=0; i<card; i++) {
				if(i == 0 || i % 2 == 0) {
					result += cards[i/2] + " ";
				}else {
					result += cards[(card+1)/2 + j] + " ";
					j++;
				}
			}
			System.out.println(result);
		}
		
		scan.close();
	}

}
