package d3021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static int[] numbers = new int[1000];
	static List<int[]> combiList = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int N = scan.nextInt();
			
			for(int i=0; i<N; i++) {
				numbers[i] = scan.nextInt();
			}
			
			int arr[] = new int[2];
			
			combination(arr, 0, N, 2, 0);
			
			int max = -1;
			
			next : for(int[] combi : combiList) {
				int mul = numbers[combi[0]] * numbers[combi[1]];
				String mulString = String.valueOf(mul);
				boolean isRight = true;
				
				for(int j=0; j<mulString.length()-1; j++) {
					if(mulString.charAt(j+1) < mulString.charAt(j)) {
						isRight = false;
						continue next;
					}
				}
				//answer 변수를 따로 선언.
				if(isRight == true && mul > max) {
					max = mul;
				}
			}
			
			System.out.println("#" + test_case + " " + max);
			
			combiList.clear();
		}
		scan.close();
	}
	
	static void combination (int[] arr, int arrSize, int n, int r, int index) {
		if(arrSize == r) {
			combiList.add(arr.clone());
			return;
		}
		
		if(index == n) {
			return;
		}
		
		arr[arrSize] = index;
		combination(arr, arrSize+1, n, r, index+1);
		combination(arr, arrSize, n, r, index+1);
	}
}
