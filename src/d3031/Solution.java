package d3031;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static List<String> strList = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			//입력.
			for(int i=0; i<5; i++) {
				String str = scan.nextLine();
				strList.add(str);
			}
			
			System.out.print("#" + test_case + " ");
			//출력.
			for(int j=0; j<16 ; j++ ) {
				for(int i=0; i<5; i++) {
					if(j < strList.get(i).length()) {
						System.out.print(strList.get(i).charAt(j));
					}
				}
			}
			System.out.println("");
			
			strList.clear();
			
		}
		
		scan.close();
	}

}