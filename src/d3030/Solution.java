package d3030;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static List<Integer> submitList = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int num = scan.nextInt();
			int submit = scan.nextInt();
			
			for(int i=0; i<submit; i++) {
				submitList.add(scan.nextInt());
			}
			
			submitList.sort(new AscendingList());
			
			System.out.print("#" + test_case + " ");
			
			for(int i=1; i<=num; i++) {
				if(!submitList.contains(i)) {
					System.out.print(i + " ");
				}
			}
			System.out.println("");
			submitList.clear();
		}
		
		scan.close();
	}
	
}

class AscendingList implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
}
