package com.ict.edu;

public class Ex02 {
//String 클래스 주요 메소드
	public static void main(String[] args) {
		String str = "ICT인재개발원 2강의장";
		System.out.println("1=====================");
		// 1.
		// charAt(int index) : char
		// 위치정보가 숫자로 들어오면 해당 위치의 글자를 반환한다.
		char c1 = str.charAt(5);
		System.out.println(c1);

		// 모두 대문자로 만들자 ( 대문자와 소문자의 차이는 32이다.)
		String str2 = "대한민국 I love You 123";
		for (int i = 0; i < str2.length(); i++) {
			char k = str2.charAt(i);
			// 소문자 찾기
			if (k >= 'a' && k <= 'z') {
				k = (char) (k - 32);
				System.out.print(k);
			} else {
				System.out.print(k);
			}
		}
		System.out.println();

		System.out.println("2=====================");
		// 2.
		// concat(String str) : String
		// 들어온 문자열을 현재문자열과 합친다.
		String str3 = "대한민국";
		String str4 = "KOREA";

		String result = str3.concat(str4);
		System.out.println(result);
		System.out.println(str3 + str4); // 메모리 소모상 제일 안좋아!~

		System.out.println("3=====================");
		// 3.
		// equals(Object anObject) : boolean
		// 들어온 문자열과 현재 문자열의 내용이 같은지 판별, 같으면 true, 다르면 false => 대소문자 구별O
		// equalsIgnoreCase(String anotherString) : boolean
		// 들어온 문자열과 현재 문자열의 내용이 같은지 판별, 같으면 true, 다르면 false => 대소문자 구별X
		String str5 = "Korea";
		String str6 = "KOREA";
		if (str5.equals(str6)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}

		System.out.println("4=====================");
		// 4.
		// equalsIgnoreCase(String anotherString) : boolean
		// 들어온 문자열과 현재 문자열의 내용이 같은지 판별, 같으면 true, 다르면 false => 대소문자 구별X
		if (str5.equalsIgnoreCase(str6)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}

		System.out.println("5=====================");
		// 5.
		// format(String format, Object... args)
		// 형식을 지정하고 형식에 맞춰 생성
		String str7 = "ICT 인재 개발원";
		String res = String.format("%s", str7);
		System.out.println(res);
		System.out.println("+++++++++++++++++++++");
		// 남은 자리는 비워둔다.
		res = String.format("%25s", str7);
		System.out.println(res);
		System.out.println("+++++++++++++++++++++");
		// 모자른 자리는 상관하지 않음
		res = String.format("%6s", str7);
		System.out.println(res);

		System.out.println("6=====================");
		// 6.
		// getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환시킨다.
		// 보통 입출력할때 사용한다.(대소문자, 숫자만 가능, 영어 이외의 글자는 안됨)
		String str8 = "java";
		byte[] b = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		// 반대로 해당 byte배열을 문자열로 만들어보자
		String str9 = new String(b);
		System.out.println(str9);

		System.out.println("7=====================");
		// 7.
		// indexOf(int ch), indexOf(String str) : int
		// char나 String이 들어오면 해당 문자열에 char나 String의 위치값을 알려준다.
		// 찾는 문자나 문자열이 없으면 -1
		String str10 = "BufferedReader";

		// 'r'의 위치값을 찾아라
		int k1 = str10.indexOf('r');
		System.out.println(k1);
		System.out.println("++++++++++++++++++++++");
		k1 = str10.indexOf('K');
		System.out.println(k1);
		System.out.println("++++++++++++++++++++++");
		k1 = str10.indexOf("er");
		System.out.println(k1);

		// 7.
		// indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		// 여기서 int fromIndex란 시작위치를 말한다.
		// 두번째, 세번째 문자나 글자를 찾기 위함이다.

		// 위에서 'r'의 위치값은 5이다 6부터 다시 'r'을 찾으면 두번째 'r'을 찾을 수 있다.
		k1 = str10.indexOf('r', str10.indexOf('r') + 1);
		System.out.println(k1);
		// 두번째 "er"찾기
		k1 = str10.indexOf("er", str10.indexOf("er") + 1);
		System.out.println(k1);

		System.out.println("8=====================");
		// 8.
		// lastIndexOf(int ch), lastIndexOf(String str) : int
		// 마지막 문자나 문자열을 찾을때 사용
		k1 = str10.lastIndexOf('d');
		System.out.println(k1);
		k1 = str10.lastIndexOf("ed");
		System.out.println(k1);
		
		System.out.println("9=====================");
		// 9.
		// length() : int => 1번부터(index가 아님)
		// 해당 문자열의 길이를 구해준다. (for문에 많이 사용된다.)
		String str11 = "abcABC123가나다";
		k1 = str11.length();
		System.out.println("길이는 "+k1+"입니다.");
		System.out.println("10=====================");
		// 10.
		// replace(char oldChar, char newChar), replace(String oldstr, String newstr) : String
		// 새로운 문자나 문자열을 받아서 치환하기
		String str12 = "대한민국";
		String str13 = str12.replace("대한민국", "KOREA");
		System.out.println(str12);
		System.out.println(str13);
		str12 = str12.replace("한", "한 ♥ ");
		System.out.println(str12);
		System.out.println("11=====================");
		// 11.
		//
		System.out.println("12=====================");
		// 12.
		//
		System.out.println("13=====================");
		// 13.
		//
		System.out.println("14=====================");
		// 14.
		//
		System.out.println("15=====================");
		// 15.
		//
		System.out.println("16=====================");
		// 16.
		//
		System.out.println("17=====================");
		// 17.
		//
		System.out.println("18=====================");
		// 18.
		//
		System.out.println("19=====================");
		// 19.
		//
		System.out.println("20=====================");
		// 20.
		//
		System.out.println("21=====================");

		System.out.println("22=====================");

		System.out.println("23=====================");

		System.out.println("24=====================");
	}
}
