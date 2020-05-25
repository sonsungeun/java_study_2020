import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		String res = "";
		switch (now.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			 res = "일";
			break;
		case 2:
			 res = "월";
			break;
		case 3:
			 res = "화";
			break;
		case 4:
			 res = "수";
			break;
		case 5:
			 res = "목";
			break;
		case 6:
			 res = "금";
			break;
		case 7:
			 res = "토";
			break;
		}
		
		System.out.print(now.get(Calendar.YEAR) + "년 ");
		System.out.print((now.get(Calendar.MONTH) + 1) + "월 ");
		System.out.print(now.get(Calendar.DATE) + "일 ");
		System.out.println(res + "요일");
		System.out.print(now.get(Calendar.HOUR) + "시 ");
		System.out.print(now.get(Calendar.MINUTE) + "분 ");
		System.out.print(now.get(Calendar.SECOND) + "초 ");
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
	}
}