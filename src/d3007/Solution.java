package d3007;
import java.util.Scanner;

public class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.next();
		
		for(int test_case=1; test_case <= T; test_case++) {
		
			String line = scan.nextLine();
			String[] str = line.split(" ");
			
			String output1 = convertToHoleNum(str[0]);
			String output2 = convertToHoleNum(str[1]);
			
			System.out.print("#" + test_case + " ");
			if(output1.equals(output2)) {
				System.out.println("SAME");
			}else {
				System.out.println("DIFF");
			}
		}
		scan.close();
		
	}
	
	static String convertToHoleNum (String str) {
		String output = "";
		
		for(int i=0; i<str.length(); i++) {
			switch (str.charAt(i)) {
			case 'C':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				output += "0";
				break;
			case 'A' :
			case 'D' :
			case 'O' :
			case 'P' :
			case 'Q' :
			case 'R' :
				output += "1";
				break;
			case 'B' :
				output += "2";
				break;
			}
		}
		
		return output;
	}

}
