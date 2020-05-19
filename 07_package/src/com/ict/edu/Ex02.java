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
		System.out.println("길이는 " + k1 + "입니다.");
		System.out.println("10=====================");
		// 10.
		// replace(char oldChar, char newChar), replace(String oldstr, String newstr) :
		// String
		// 새로운 문자나 문자열을 받아서 치환하기
		String str12 = "대한민국";
		String str13 = str12.replace("대한민국", "KOREA");
		System.out.println(str12);
		System.out.println(str13);
		str12 = str12.replace("한", "한 ♥ ");
		System.out.println(str12);
		System.out.println("11=====================");
		// 11.
		// contains(String s) : boolean, 인자 char 는 오류, 대소문자 구분
		// 인자로 들어온 문자열이 해당 문자열에 존재하면 true, 존재하지 않으면 false
		String str14 = "KOREA @ 대한민국";
		boolean b1 = str14.contains("@");
		System.out.println(b1);

		b1 = str14.contains("대한");
		System.out.println(b1);

		b1 = str14.contains("$");
		System.out.println(b1);

		b1 = str14.contains("KOR");
		System.out.println(b1);

		b1 = str14.contains("kor");
		System.out.println(b1);
		System.out.println("12=====================");
		// 12.
		// isEmpty() : boolean
		// 해당문자열이 비어있으면 true, 내용이 있으면 false
		String str15 = "";
		b1 = str15.isEmpty();
		System.out.println(b1);
		str15 = "대한민국";
		b1 = str15.isEmpty();
		System.out.println(b1);
		System.out.println("13=====================");
		// 13.
		// split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// String regex :구분자(나눌 기준), int limit => 나눌 배열의 크기
		String str16 = "사과,딸기,망고 오렌지,파인애플,두리안";
		String[] arr = str16.split(",");
		for (String k : arr) {
			System.out.println(k);
		}
		System.out.println("+++++++++++++++++++++++");
		arr = str16.split(" ");
		for (String k : arr) {
			System.out.println(k);
		}
		System.out.println("+++++++++++++++++++++++");
		arr = str16.split(",", 3);
		for (String k : arr) {
			System.out.println(k);
		}
		System.out.println("+++++++++++++++++++++++");
		arr = str16.split(",", 7);
		for (String k : arr) {
			System.out.println(k);
		}
		System.out.println("14=====================");
		// 14.
		// substring(int beginindex) : String
		// 시작위치부터 끝까지 문자열 추출
		// substring(int beginindex, int endindex) : String
		// 시작위치부터 끝위치 전까지 문자열 추출
		// 파이선이나 빅데이터에선 슬라이싱이라고 부름;
		String str17 = "010-7777-9999";
		String msg = str17.substring(4);
		System.out.println(msg);

		msg = str17.substring(4, 8);
		System.out.println(msg);

		msg = str17.substring(0, 3);
		System.out.println(msg);

		String str18 = "770707-1";
		msg = str18.substring(7, 8);
		System.out.println(msg);
		msg = str18.substring(str.indexOf("-") + 1, str.indexOf("-") + 2);
		System.out.println(msg);

		// QUIZ : 010-7777-9999 => 010-7777-XXXX

		System.out.println("15,16=====================");
		// 15.
		// toLowerCase() : String
		// 모든 대문자를 소문자로 변경시킨다.
		// 16.
		// toUpperCase() : String
		// 모든 소문자를 대문자로 변경시킨다.
		String str19 = "대한 kOREa 19 ";
		msg = str19.toLowerCase();
		System.out.println(msg);
		msg = str19.toUpperCase();
		System.out.println(msg);

		System.out.println("17=====================");
		// 17.
		// toString() : String
		// Object의 toString() : 모든 객체에 사용가능, 객체가 가지고있는 정보나 값들을
		// 문자열로 만들어 리턴하는 메소드( 오버라이딩할때 배운다.)
		// String의 toString() : 문자열 자체를 반환
		String str20 = "java 8 자바 8";
		msg = str20.toString();
		System.out.println(msg);
		System.out.println(str20);
		System.out.println(str20.toString());
		System.out.println("18=====================");
		// 18.
		// trim() : String
		// 해당문자열의 앞, 뒤 공백 제거, 중간의 공백은 제거하지 못한다.
		String str21 = "     java   자바     JAVA  ";
		msg = str21.trim();
		System.out.println(str21);
		System.out.println(str21.length());
		System.out.println(msg);
		System.out.println(msg.length());
		System.out.println("19=====================");
		// 19.
		// valueOf(자료형) : static String
		// 어떤자료형이든 String으로 변경시킨다.
		boolean bo1 = true;
		char ch1 = 'A';
		int num1 = 34;
		long num2 = 58L;
		float num3 = 3.14f;
		double num4 = 342.12;
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println("+++++++++++++++++++++++++");
		// 자료형 + 1
		// System.out.println(bo1+1); //boolean형은 +를 할 수 없다.
		System.out.println(ch1 + 1);
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num3 + 1);
		System.out.println(num4 + 1);
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(ch1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(bo1 + "1");
		System.out.println(ch1 + "1");
		System.out.println(num1 + "1");
		System.out.println(num2 + "1");
		System.out.println(num3 + "1");
		System.out.println(num4 + "1");
		System.out.println("=======20 String을 각종 자료형으로 되돌리기(Wrapper class)========");
		// 20.
		//	- rapper class : 각종 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경시키는 클래스들
		//	- 원래 의미는 기본 자료형을 객체로 만들때 사용하는 클래스(이제는 자동으로 만들어짐)
		
		// 20-1. 
		// 문자열을 boolean형으로 변경 : Boolean.parseBoolean()
		// "true"와 "false"만 사용가능
		String message = "false";
		boolean m1 = Boolean.parseBoolean(message);
		if (m1) {
			System.out.println("변경성공");
		}else {
			System.out.println("변경실패");
		}
		// 20-2.
		// 문자열을 int형으로 변경: Integer.parseInt()
		message = "1234";
		int m2 = Integer.parseInt(message);
		System.out.println(message+10);
		System.out.println(m2+10);
		
		// 20-3.
		// 문자열을 long형으로 변경 : Long.parseLong()
		// "숫자" => O , "숫자L" => X
		//message = "241L"; //오류발생
		message = "241";
		long m3 = Long.parseLong(message);
		System.out.println(message+10);
		System.out.println(m3+10);
		// 20-4.
		// 문자열을 float형으로 변경 : Float.parseFloat()
		message = "3.14";
		float m4 = Float.parseFloat(message);
		System.out.println(message+10);
		System.out.println(m4+10);

		// 20-5.
		// 문자열을 double형으로 변경 : Double.parseDouble()
		message = "3.14";
		double m5 = Double.parseDouble(message);
		System.out.println(message+10);
		System.out.println(m5+10);
		
		// 20-6.
		// 문자열을 char형으로 변경 : 없다
		// 							  String.charAt() 사용
		message = "A";
		char m6 = message.charAt(0);
		System.out.println(m6);
		System.out.println(m6+10);
		System.out.println(message+10);
		
		System.out.println("21=========================");
		// 21.
		// toCharArray() : char[]
		// - 해당문자열을 char[]로 만들어줌
		// - 모든 문자 사용 가능(getBytes()는 영어와 숫자만 가능)
		message = "java 자바 JAVA 大韓民國 2020";
		byte[] m7 = message.getBytes();	// 숫자로 변경(영어와 숫자만 가능)
		for (byte k : m7) {
			System.out.println(k);
		}
		System.out.println("+++++++++++++++++++++++++");
		char[] m8 = message.toCharArray();
		for (char k : m8) {
			System.out.println(k);
		}
	}
}
