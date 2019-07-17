package d3013;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	static List<String> boughtLottoList = new ArrayList<>();
	static List<Lotto> correctLottoList = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			//N : 당첨번호, 당첨금의 액수
			//M : 주혁이가 구매한 복권.
			int N = scan.nextInt();
			int M = scan.nextInt();
			scan.nextLine();
			
			for(int i=0; i<N; i++) {
				String str = scan.nextLine();
				String correct = str.split(" ")[0];
				int money = Integer.parseInt(str.split(" ")[1]);
				
				correctLottoList.add(new Lotto(correct, money));
			}
			
			for(int i=0; i<M; i++) {
				String boughtLotto = scan.nextLine();
				boughtLottoList.add(boughtLotto);
			}
			
			System.out.println("#" + test_case + " " + confirmLotto());
			
			boughtLottoList.clear();
			correctLottoList.clear();
		}
		scan.close();
	}
	
	static int confirmLotto () {
		int total = 0;
		boolean confirmed = false;
		
		for(String boughtLotto : boughtLottoList) {
			lotto : for(Lotto lotto : correctLottoList) {
				for(int i=0; i<8; i++) {
					if(lotto.matchedNumber.charAt(i) == '*' || boughtLotto.charAt(i) == lotto.matchedNumber.charAt(i)) {
						confirmed = true;
					}else {
						confirmed = false;
						continue lotto;
					}
				}
				
				if(confirmed) {
					total += lotto.money;
				}
			}
		}
		
		return total;
	}
}

class Lotto {
	String matchedNumber;
	int money;
	
	public Lotto (String matchedNumber, int money) {
		this.matchedNumber = matchedNumber;
		this.money = money;
	}
}
