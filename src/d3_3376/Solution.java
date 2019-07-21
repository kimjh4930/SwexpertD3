package d3_3376;

import java.util.Scanner;

public class Solution {
	
	static long triangles[] = new long[101];
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		triangles[1] = (long)1;
		triangles[2] = (long)1;
		triangles[3] = (long)1;
		triangles[4] = (long)2;
		triangles[5] = (long)2;
		
		nextTriangle();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int n = scan.nextInt();
			
			System.out.println("#" + test_case + " " + triangles[n]);
		}
		
		scan.close();
	}
	
	static void nextTriangle () {
		for(int i=6; i<101; i++) {
			triangles[i] = triangles[i-5] + triangles[i-1];
		}
	}
}
