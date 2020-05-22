
public class Main {
	public static void main(String[] args) {
		int su = 23;
		String res = "";
		res = su % 2 == 0 ? res.replace("", "짝수입니다.") : res.replace("", "홀수입니다.");
		System.out.println(res);
	}
}