package d3003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution_01 {
	
	static List<String> sentenceList = new ArrayList<>();
	static List<String> wordList = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int numofSentence = scan.nextInt();
			scan.nextLine();
			
			String sentence = scan.nextLine();
			
			System.out.print("#" + test_case + " ");
			
			splitSentence(sentence);
			for(int i=0; i<numofSentence; i++){
				splitWord(sentenceList.get(i));
				System.out.print(countName(wordList) + " ");
				wordList.clear();
			}
			sentenceList.clear();
			
			System.out.println("");
		}
		
		scan.close();
	}
	
	static void splitSentence (String input) {
		
		int start = 0;
		int i=0;
		
		while(i < input.length()) {
			if(input.charAt(i) == '.' || input.charAt(i) == '?' || input.charAt(i) == '!') {
				if(input.charAt(start) == ' ') {
					start++;
				}
				sentenceList.add(input.substring(start, i));
				i++;
				start = i;
			}
			i++;
		}
		
	}
	
	static void splitWord (String input) {
		wordList.addAll(Arrays.asList(input.split(" ")));
	}
	
	static int countName (List<String> wordList) {
		
		int name = 0;
		
		outer : for(String word : wordList) {
			
			//첫 글자가 대문자가 아니라면 pass
			if(!(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
				continue outer;
			}
			
			//나머지가 모두 문자인지 확인.
			for(int i=1; i<word.length(); i++) {
				//소문자가 아니라면.
				if(!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
					continue outer;
				}
			}
			name++;
		}
		
		return name;
	}
}
