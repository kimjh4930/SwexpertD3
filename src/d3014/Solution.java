package d3014;

import java.util.Scanner;

public class Solution {
	
	static int in = 0, on = 0, out = 0;
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			
			int points = scan.nextInt();
			
			for(int i=0; i<points; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				pointLocation(x1, y1, x2, y2, x, y);
				
			}
			
			System.out.println("#" + test_case + " " + in + " " + on + " " + out + " ");
			in = on = out = 0;
			
		}
		scan.close();
	}
	
	static void pointLocation (int x1, int y1, int x2, int y2, int x, int y) {
		
		//내부에 있는 경우.
		if(x > x1 && x < x2 && y > y1 && y < y2) {
			in++;
		}else if( ((x >= x1 && x <= x2) && (y == y1 || y == y2 )) || ((y >= y1 && y <= y2) && (x == x1 || x == x2 ))) {
			on++;
		}else {
			out++;
		}
		
//		if((x < x1 && x > x2) && (y < y1 && y > y2)) {
//			out++;
//		}
		
	}
}
