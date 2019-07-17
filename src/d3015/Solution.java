package d3015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static boolean cards[] = new boolean[19];
	static List<Integer> yourCardList = new ArrayList<>();
	static List<Integer> myCardList = new ArrayList<>();
	static List<int[]> permutationList = new ArrayList<>();
	
	public static void main(String args[]) {
		
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		permutation(arr, 0, 9, 9);
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			for(int i=0; i<9; i++) {
				int cardNum = scan.nextInt();
				cards[cardNum] = true;
				yourCardList.add(cardNum);
			}
			
			for(int i=1; i<=18; i++) {
				if(cards[i] == false) {
					myCardList.add(i);
				}
			}
			
			comparePoints(test_case);
			
			//clear
			for(int i=1; i<=18; i++) {
				cards[i] = false;
			}
			
			yourCardList.clear();
			myCardList.clear();
			
		}
		
		scan.close();
	}
	
	static void comparePoints (int test_case) {
		
		int win = 0;
		int lose = 0;
		
		for(int[] mycardSet : permutationList) {
			
			int yourSum = 0;
			int mySum = 0;
			
			 for(int i=0; i<9; i++) {
				if(yourCardList.get(i) > myCardList.get(mycardSet[i])) {
					yourSum += (yourCardList.get(i) + myCardList.get(mycardSet[i]));
				}else {
					mySum += ((yourCardList.get(i) + myCardList.get(mycardSet[i])));
				}
				
				if(mySum > 85 || yourSum > 85) {
					break;
				}
			}
			
			if(mySum > yourSum) {
				lose++;
			}else if(mySum < yourSum) {
				win++;
			}else {
				//do nothing
			}
		}
		System.out.println("#" + test_case + " " + win + " " + lose);
		
	}
	
	static void permutation (int[] arr, int arrSize, int n, int r) {
		if(arrSize == r) {
			permutationList.add(arr.clone());
			return;
		}
		
		for(int i=arrSize; i<n; i++) {
			SwapArr(arr, i, arrSize);
			permutation(arr, arrSize+1, n, r);
			SwapArr(arr, i, arrSize);
		}
		
		
	}
	
	static void SwapArr(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
