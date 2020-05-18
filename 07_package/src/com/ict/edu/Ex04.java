package com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
public static void main(String[] args) {
	// 날짜 관련 클래스 : 현재 사용하고 있는 컴퓨터 기준
	//					  Date 클래스(deprecate => 언제든지 지원을 끊을 수 있다.) 
	//					  Calendar 클래스 => Date 클래스 대신 사용 중인 클래스
	
	Date date = new Date();
	System.out.println(date);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	System.out.println(sdf.format(date));

	SimpleDateFormat sdf2 = new SimpleDateFormat("yy. M. dd. hh:mm:ss");
	System.out.println(sdf2.format(date));

	System.out.println(date.getYear()+1900+" 년"); //2020-1900 = 120
	System.out.println(date.getMonth()+1+" 월");//0-11
	System.out.println(date.getDate()+" 일");
	System.out.println(date.getHours()+" 시");
	System.out.println(date.getMinutes()+" 분");
	System.out.println(date.getSeconds()+" 초");
	
	int k = date.getDay();//0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 =Thursday, 5 = Friday, 6 = Saturday
	switch (k) {
	case 0:System.out.println("일요일");break;
	case 1:System.out.println("월요일");break;
	case 2:System.out.println("화요일");break;
	case 3:System.out.println("수요일");break;
	case 4:System.out.println("목요일");break;
	case 5:System.out.println("금요일");break;
	case 6:System.out.println("토요일");break;
	}
	System.out.println("============================================");
	// Calendar 클래스 : new 예약어를 사용하지 않고 객체 생성을 한다.
	// 년, 월, 일, 시, 분 호출방법 : get(참조변수.필드 또는 Calendar.필드)
	
	// new 예약어를 사용하지 않고 객체 생성을 한다.
	Calendar now = Calendar.getInstance();
	System.out.println(now.get(Calendar.YEAR)+"년");
	System.out.println(now.get(Calendar.MONTH+1)+"월");//0-11
	System.out.println(now.get(Calendar.DATE)+"일");
	System.out.println(now.get(Calendar.DAY_OF_MONTH)+"일");
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println(now.get(Calendar.HOUR));//12시간제
	System.out.println(now.get(Calendar.HOUR_OF_DAY));//24시간제
	
	// AM => 0, PM =>1
	int res = now.get(Calendar.AM_PM);
	if (res ==0) {
		System.out.println("AM "+now.get(Calendar.HOUR)+"시");
	}else if (res==1) {
		System.out.println("PM "+now.get(Calendar.HOUR)+"시");
	}
	
	System.out.println(now.get(Calendar.MINUTE)+"분");
	System.out.println(now.get(Calendar.SECOND)+"초");
	
	// 요일 (1:일요일-7:토요일)
	res = now.get(Calendar.DAY_OF_WEEK);
	switch (res) {
	case 1:System.out.println("일요일");break;
	case 2:System.out.println("월요일");break;
	case 3:System.out.println("화요일");break;
	case 4:System.out.println("수요일");break;
	case 5:System.out.println("목요일");break;
	case 6:System.out.println("금요일");break;
	case 7:System.out.println("토요일");break;
	}
}
}
