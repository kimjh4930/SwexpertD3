package d3008;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static List<int[]> combinationList = new ArrayList<>();
	static Point[] snailPoints = new Point[20];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int snails = scan.nextInt();
			long vector_min = Long.parseLong("80000000001");
			
			Point totalSum = new Point(0, 0);
			Point startSum = new Point(0,0);
			Point endSum = new Point(0, 0);
			//지렁이 입
			for(int i=0; i<snails; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				totalSum.x += x;
				totalSum.y += y;
				
				snailPoints[i] = new Point(x, y);
			}
			
			int[] arr = new int[snails/2];
			
			combination(arr, 0, snails, snails/2, 0);
			
			//전체 벡터의 합 - 선택된 벡터의 
			for(int[] temp : combinationList) {
				for(int i=0; i<snails/2; i++) {
					startSum.x += snailPoints[temp[i]].x;
					startSum.y += snailPoints[temp[i]].y;
				}
				
				endSum.x = totalSum.x - startSum.x;
				endSum.y = totalSum.y - startSum.y;
				
				long vector_x = startSum.x - endSum.x;
				long vector_y = startSum.y - endSum.y;
				
				long result = (vector_x * vector_x) + (vector_y * vector_y);
				
				if(vector_min > result) {
					vector_min = result;
				}
				
				startSum.x = startSum.y = endSum.x = endSum.y = 0;
			}
			
			System.out.println("#" + test_case + " " + vector_min);
			
			combinationList.clear();
			for(int i=0; i<20; i++) {
				snailPoints[i] = null;
			}
			
		}
		
		scan.close();
	}
	
	static void combination (int arr[], int arrSize, int n, int r, int target) {
		
		if(arrSize == r) {
			combinationList.add(arr.clone());
			return;
		}
		
		if(target == n) {
			return;
		}
		
		arr[arrSize] = target;
		combination(arr, arrSize+1, n, r, target+1);
		combination(arr, arrSize, n, r, target+1);
	}
}

class Point {
	long x;
	long y;
	
	public Point(long x, long y) {
		this.x = x;
		this.y = y;
	}
}
