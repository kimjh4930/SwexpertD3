package d3024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static List<Integer> primeNumberList = new ArrayList<>();
	static List<int[]> combinationSetList = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		//gerPrimeNumber
		getPrimeNumber();
		
		System.out.println(primeNumberList.size());
		
		//get combination Set
		int[] arr = new int[3];
//		combination(arr, 0, 5, 3, 0);
		combination(arr, 0, primeNumberList.size(), 3, 0);
		System.out.println(combinationSetList.size());
		
//		for(int[] combi : combinationSetList) {
//			for(int i=0; i<combi.length; i++) {
//				System.out.print(combi[i] + " ");
//			}
//			System.out.println("");
//		}
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int input = scan.nextInt();
			int num = 0;
			
			next : for(int[] combi : combinationSetList) {
				int sum = 0;
				
				for(int i=0; i<combi.length; i++) {
					if(primeNumberList.get(combi[i]) > input) {
						continue next;
					}
					sum += primeNumberList.get(combi[i]);
					
					if(sum > input) {
						continue next;
					}
				}
				if(sum == input) {
					num++;
				}
			}
			System.out.println("#" + test_case + " " + num);
		}
		
		scan.close();
	}
	
	static void getPrimeNumber () {
		
		int[] numbers = new int[1000];
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = i+2;
		}
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == -1) {
				continue;
			}
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[j] != -1 && numbers[j]%numbers[i] == 0) {
					numbers[j] = -1;
				}
			}
		}
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] != -1) {
				primeNumberList.add(numbers[i]);
			}
		}
	}
	
	static void combination (int[] arr, int arrSize, int n, int r, int index) {
		if(arrSize == r) {
			combinationSetList.add(arr.clone());
			return;
		}
		
		if(index == n) {
			return;
		}
		
		arr[arrSize] = index;
		combination(arr, arrSize+1, n, r, index);
		combination(arr, arrSize, n, r, index+1);
	}
}
