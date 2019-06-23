package d3004;

import java.util.Scanner;

public class Solution02 {

	static String pattern = "";
	static int maxCase = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		pattern = "001";
		
		for(int test_case=1; test_case<=T; test_case++) {
			long num = scan.nextLong();
			//입력받은 숫자로 문자열을 얼마나 생성해야 하는지를 알아야 한다.
			int strIndex = patternNum(num);
			
			if(strIndex > maxCase) {
				for(int idx = maxCase+1; idx<=strIndex; idx++) {
					nextPattern(idx);
				}
				maxCase = strIndex;
			}
			System.out.println(pattern);
			
			//한번에 처리하면 index개수를 넘어
//			System.out.println("#" + test_case + " " + pattern.charAt(num));
		}
		scan.close();
	}
	
	static void nextPattern (int index) {
		pattern = pattern + "0" + function_f(function_g(pattern));
//		strArray[index] = strArray[index-1] +  "0" + function_f(function_g(strArray[index-1]));
	}
	
	static int patternNum (long test) {
		
		int times = 0;
		while(test != (long) 0) {
			test = test >> 1;
			times++;
		}
		times -= 1;
		
		return times;
	}
	
	static String function_f (String input) {
		String output = "";
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '1') {
				output += 0;
			}else {
				output += 1;
			}
		}
		
		return output;
	}
	
	static String function_g (String input) {
		String output = "";
		char inputChar[] = input.toCharArray();
		int length = inputChar.length;
		
		char temp = 0;
		
		for(int i=0; i<length/2; i++) {
			temp = inputChar[i];
			inputChar[i] = inputChar[length-1-i];
			inputChar[length-1-i] = temp;
		}
		
		for(int i=0; i<length; i++) {
			output += inputChar[i];
		}
		
		return output;
		
	}

}
