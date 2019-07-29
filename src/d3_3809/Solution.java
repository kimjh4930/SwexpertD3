package d3_3809;

import java.util.Scanner;

public class Solution {
	
	static boolean checked[] = new boolean[1000];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		next : for(int test_case=1; test_case<=T; test_case++) {
			
			for(int i=0; i<checked.length; i++) {
				checked[i] = false;
			}
			
			int num = scan.nextInt();
			String numString = "";
			
			for(int i=0; i<num; i++) {
				int input = scan.nextInt();
				checked[input] = true;
				numString += input;
			}
			
			//첫번째 인풋이 끝나고 한자리 숫자중 만들 수 없는 것 확인.
//			for(int i=0; i<10; i++) {
//				if(!checked[i]) {
//					System.out.println("#" + test_case + " " + i);
//					continue next;
//				}
//			}
			
			int k = 1;
			
			for(int i=1; i<=numString.length(); i++) {
				for(int j=0; j<=numString.length()-i; j++) {
					checked[Integer.parseInt(numString.substring(j, j+i))] = true;
				}
				
				//check
				for(int j=k; j<k*10; j++) {
					if(!checked[j]) {
						System.out.println("#" + test_case + " " + j);
						continue next;
					}
				}
				k *= 10;
			}
		}
		
		scan.close();
	}

}
