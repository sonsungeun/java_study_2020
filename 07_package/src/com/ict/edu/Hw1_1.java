package com.ict.edu;

import java.util.Random;
import java.util.Scanner;

//1-1)카드게임 : 1~13의수 
//1~6 낮음, 7비김,8~13높음
public class Hw1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String res = "";
		int com = (int) (ran.nextDouble() * 14);
		if (com>=1&&com<=6) {
			res = "낮음";
		}else if (com==7) {
			res = "비김";
		}else if (com>=8&&com<=13) {
			res = "높음";
		}
		
		
	}
}
