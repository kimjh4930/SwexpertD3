package d3008;

import java.util.Scanner;

public class Solution1 {
	
	static Point[] points = new Point[20];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int snail = scan.nextInt();
			
			for(int i=0; i<snail; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				points[i] = new Point(x, y);
			}
			
			for(int i=0; i<snail; i++) {
				System.out.println("(" + points[i].x + ", " + points[i].y + ")");
			}
			
		}
		
		scan.close();
	}
	
	static void combination () {
		
	}

}

//class Point {
//	int x;
//	int y;
//	
//	public Point (int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}