
public class Test {
public static void main(String[] args) {
	int number = (int) (Math.random()*(1000000));
	String mynum = "";
	if (number<100000) {
		mynum = "0"+String.valueOf(number);
	}else {
		mynum = String.valueOf(number);
	}
	System.out.println(mynum);
}
}
