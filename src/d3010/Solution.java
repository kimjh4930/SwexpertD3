package d3010;

import java.util.Scanner;

public class Solution {
	
	static int values[] = new int[41];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int max = -1;
			
			for(int i=1; i<=num1; i++) {
				for(int j=1; j<=num2; j++) {
					values[i+j]++;
					if(values[i+j] > max) {
						max = values[i+j];
					}
				}
			}
			
			System.out.print("#" + test_case + " ");
			for(int i=1; i<=num1+num2; i++) {
				if(values[i] == max) {
					System.out.print(i + " ");
				}
			}
			System.out.println("");
			
			for(int i=1; i<=num1+num2; i++) {
				values[i] = 0;
			}
		}
		
		scan.close();
	}

}
