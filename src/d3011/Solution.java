package d3011;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static List<String> strList = new ArrayList<>();
	
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int num = scan.nextInt();
			scan.nextLine();
			
			for(int i=0; i<num; i++) {
				String str = scan.nextLine();
				strList.add(str);
			}
			strList.sort(new ascendingSort());
			
			char c = 'A';
			int count = 0;
			
			for(int i=0; i<num; i++) {
				if(strList.get(i).charAt(0) == c) {
					count++;
					c++;
				}
			}
			
			System.out.println("#" + test_case + " " + count);
			
			strList.clear();
		}
		
		scan.close();
	}

}

class ascendingSort implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}


