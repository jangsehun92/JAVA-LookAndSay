package main;

import java.util.Scanner;

public class LookAndSaySequence {

	public static void main(String[] args) {
		//값을 받아오기 위한 스캐너 선언
		Scanner scanner = new Scanner(System.in);
		
		String str = "1"; //초기값 
		int n = 0; //개미수열을 반복시킬 횟수
		
		System.out.print("몇 번째 개미수열 값을 확인하시겠습니까?(입력) : ");
		n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			str = start(str);
		}
		
		System.out.println(str);
		
	}
	
	public static String start(String str) {
		char number = str.charAt(0);
		int count = 1;
		String result = "";
		
		for(int i = 1; i < str.length(); i ++) {
			if(number == str.charAt(i)) {
				count++;
			}else {
				result += number;
				result += count;
				number = str.charAt(i);
				count = 1;
			}
		}
		result += number;
		result += count;
		return result;
	}

}
