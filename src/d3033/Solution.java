package d3033;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static Food[] foodArray = new Food[21];
	static List<Integer> combination = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		int foodNum, maxCalory, point, calory;
		
		for(int test_case=1; test_case<=T; test_case++) {
			foodNum = scan.nextInt();
			maxCalory = scan.nextInt();
			
			int caseNum = 1;
			
			//입력.
			for(int i=0; i<foodNum; i++) {
				point = scan.nextInt();
				calory = scan.nextInt();
				
				caseNum *= 2;
				
				foodArray[i] = new Food(point, calory);
			}
			
			//부분수열의 합을 구한다.
			int temp, index, calSum=0, pointSum=0, maxPoint=-1;
			next: for(int i=0; i<caseNum; i++) {
				temp = i;
				index=0;
				calSum=0;
				pointSum=0;
				
				while(temp != 0) {
					if((temp & 0x01) == 1) {
						calSum += foodArray[index].calory;
						pointSum += foodArray[index].point;
					}
					
					if(calSum > maxCalory) {
						continue next;
					}
					index++;
					temp = temp>>1;
				}
				
				if(pointSum > maxPoint) {
					maxPoint = pointSum;
				}
			}
			
			System.out.println("#" + test_case + " " + maxPoint);
			
			for(int i=0; i<21; i++) {
				foodArray[i] = null;
			}
		}
		
		scan.close();
	}
}

class Food {
	int point;
	int calory;
	
	public Food (int point, int calory) {
		this.point = point;
		this.calory = calory;
	}
}
