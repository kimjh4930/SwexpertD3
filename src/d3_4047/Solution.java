package d3_4047;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static List<String> sList = new ArrayList<>();
	static List<String> dList = new ArrayList<>();
	static List<String> hList = new ArrayList<>();
	static List<String> cList = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			String cards = scan.nextLine();
			int length = cards.length();
			boolean flag = true;
			
			for(int i=0; i<length; i+=3) {
				String num = cards.substring(i+1, i+3);
				
				switch(cards.charAt(i)) {
				case 'S' :
					System.out.println("S");
					flag = confirm(sList, num);
					break;
				case 'D' :
					System.out.println("D");
					flag = confirm(dList, num);
					break;
				case 'H' :
					System.out.println("H");
					flag = confirm(hList, num);
					break;
				case 'C' :
					System.out.println("C");
					flag = confirm(cList, num);
					break;
				}
				
				if(flag == false) {
					System.out.println("#" + test_case + " ERROR");
					sList.clear();
					dList.clear();
					hList.clear();
					cList.clear();
					break;
				}
			}
			
			if(flag == true) {
				System.out.println("#" + test_case + " " + (13-sList.size()) + " " + (13-dList.size()) + " " + (13-hList.size()) + " " + (13-cList.size()));
			}
			
			sList.clear();
			dList.clear();
			hList.clear();
			cList.clear();
			
		}
		scan.close();
	}
	
	static boolean confirm (List<String> list, String num) {
		if(list.contains(num)) {
			return false;
		}
		list.add(num);
		return true;
	}

}
