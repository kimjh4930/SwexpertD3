package d3008;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
	
	static Point points[] = new Point[20];
	static boolean visited[] = new boolean[20];
	
	static List<Integer> combinationList = new ArrayList<>();
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			
			int snails = scan.nextInt();
			
			for(int i=0; i<snails; i++) {
				long x = scan.nextLong();
				long y = scan.nextLong();
				
//				points[i] = new Point(x, y);
				
			}
			
			makeCombination(snails);
			
			long vector_min = Long.parseLong("80000000001");
			
			for(Integer binary : combinationList) {
				
				Point sumStart = new Point(0,0);
				Point sumEnd = new Point(0,0);
				
				//1인 비트 순
				for(int i=0; i<snails; i++) {
//					System.out.println("binary : " + Integer.toBinaryString(binary) + "\t" + i);
//					System.out.println(binary & (1<<i));
					if((binary & (1<<i)) >> i == 1) {
//						System.out.println("true : i : " + i);
						sumStart.x += points[i].x;
						sumStart.y += points[i].y;
						visited[i] = true;
					}
				}
				
				//0인 비트 순
				for(int i=0; i<snails; i++) {
					if(visited[i] == false) {
//						System.out.println("false : i : " + i);
						sumEnd.x += points[i].x;
						sumEnd.y += points[i].y;
					}
				}
				
				long vector_x = sumStart.x - sumEnd.x;
				long vector_y = sumStart.y - sumEnd.y;
				
				long vector_size = (vector_x * vector_x) + (vector_y * vector_y);
				
				if(vector_size < vector_min) {
					vector_min = vector_size;
				}
				
				for(int i=0; i<20; i++) {
					visited[i] = false;
				}
			}
			
			System.out.println("#" + test_case + " " + vector_min);
			
			for(int i=0; i<20; i++) {
				points[i] = null;
				combinationList.clear();
			}
		}
		scan.close();
	}
	
	static void makeCombination (int snails) {
		//set bit;
		int bit = 1;
		int half = snails/2;
		
		for(int i=0; i<half; i++) {
			bit = bit | (1<<i);
		}
		
		//make combination
		int tempbit = bit;
		for(int j=0; j<half; j++) {
			for(int i=0; i<half; i++) {
				tempbit = tempbit ^ (1<<((half-1-j) + i));
				tempbit = tempbit ^ (1<<((half-j) + i));
				int temp = tempbit;
				combinationList.add(temp);
			}
		}
		
//		for(int i=0; i<combinationList.size(); i++) {
//			System.out.println(Integer.toBinaryString(combinationList.get(i)));
//		}
		
	}
}

//class Point {
//	long x, y;
//	
//	public Point(long x, long y) {
//		this.x = x;
//		this.y = y;
//	}
//}
