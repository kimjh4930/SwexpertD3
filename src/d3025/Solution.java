package d3025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static int[] array = new int[7];
	static int[] combi = {0, 1, 2, 3, 4, 5, 6};
	static List<int[]> combinationList = new ArrayList<>();
	static List<Integer> resultList = new ArrayList<>();
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		combination(combi, 0, 7, 3, 0);
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			//input
			for(int i=0; i<7; i++) {
				array[i] = scan.nextInt();
			}
			
			//조합 곱하기
			for(int i=0; i<combinationList.size(); i++) {
				int sum = 0;
				for(int j=0; j<3; j++) {
					sum += array[combinationList.get(i)[j]];
				}
				//set으로 저장한다음 iterator로 list로 변경한다.
				//시간비교.
				if(!resultList.contains(sum)) {
					resultList.add(sum);
				}
			}
			
			//내림차순으로 정렬.
			resultList.sort(new AscendingList());
			
			System.out.println("#" + test_case + " " + resultList.get(4));
			
			//initialize
			resultList.clear();
			for(int i=0; i<7; i++) {
				array[i] = 0;
			}
			
		}
		
		scan.close();
		
	}
	
	static void combination(int arr[], int arrSize, int n, int r, int target) {
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

class AscendingList implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
	
}
