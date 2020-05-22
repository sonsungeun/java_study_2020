import java.util.Scanner;

public class Sungjuk {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Person[] arr = new Person[5]; 
	for (int i = 0; i < arr.length; i++) {
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("국어성적 >> ");
		int kor = sc.nextInt();
		System.out.print("영어성적 >> ");
		int eng = sc.nextInt();
		System.out.print("수학성적 >> ");
		int math = sc.nextInt();
		
		Person test = new Person(name, kor, eng, math);
		test.s_avg();
		test.s_hak();
		arr[i]=test;
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[i].getSum()<arr[j].getSum()) {
				arr[i].setRank(arr[i].getRank()+1);
			}
		}
	}
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i].getRank()>arr[j].getRank()) {
				Person tmp = new Person("",0,0,0);
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
	}
	System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i].getName()+"\t"+arr[i].getSum()+"\t"+arr[i].getAvg()+"\t"+arr[i].getHak()+"\t"+arr[i].getRank());
	}
}
}
