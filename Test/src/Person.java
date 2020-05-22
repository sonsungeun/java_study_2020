
public class Person {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1;

	public String getName() {
		return name;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public String getHak() {
		return hak;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public Person(String name, int kor, int eng, int math) {
		this.name = name;
		this.sum = kor + eng + math;
	}

	public void s_avg() {
		this.avg = (int) (sum / 3.0 *10) / 10.0;
	}

	public void s_hak() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}

}
