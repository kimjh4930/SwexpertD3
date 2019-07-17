package d3037;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static List<Integer> primeList = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		//primeNumber
		getPrimeNumber();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int D = scan.nextInt();
			int A = scan.nextInt();
			int B = scan.nextInt();
			int num=0;
			int temp = 0;
			int remain = 0;
			
			next : for(Integer number : primeList) {
				if (number >= A && number <= B) {
					temp = number;
					while(temp != 0) {
						remain = temp % 10;
						if(remain % 10 == D) {
							num++;
							continue next;
						}
						temp /= 10;
					}
				}
			}
			
			System.out.println("#" + test_case + " " + num);
			
		}
		
		scan.close();
	}
	
	public static void getPrimeNumber () {
		int size = 1000000;
		int[] numbers = new int[size+1];
		
		for(int i=2; i<=size; i++) {
			numbers[i] = i;
		}
		
		for(int i=2; i<=size; i++) {
			if(numbers[i] == 0) {
				continue;
			}
			
			for(int j=i+i; j<=size; j+=i) {
				numbers[j] = 0;
			}
		}
		
		for(int i=2; i<size; i++) {
			if(numbers[i] != 0) {
				primeList.add(i);
			}
		}
	}
}
