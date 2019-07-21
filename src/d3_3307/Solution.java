package d3_3307;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static List<Integer> numList = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int n = scan.nextInt();
			int num = 1;
			
			for(int i=0; i<n; i++) {
				int number = scan.nextInt();
				numList.add(number);
				
				num*=2;
			}
			int prev_num = -1;
			int i = num-1;
			while(i != 0) {
				int temp = i;
				while(temp != 0) {
					if((temp & 0x01) == 1) {
						if(prev_num == -1) {
//							prev_num = numList;
						}
					}
					temp >>= 1;
				}
				
				
				temp >>= 1;
			}
			
			numList.clear();
		}
		
		scan.close();
	}

}
