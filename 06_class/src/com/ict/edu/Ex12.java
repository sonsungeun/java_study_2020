package com.ict.edu;

public class Ex12 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank;

	public Ex12(String name, int sum, double avg, String hak, int rank) {
		this.name = name;
		this.sum = sum;
		this.avg = avg;
		this.hak = hak;
		this.rank = rank;
	}
	public Ex12() {	}

//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

//합계구하기
	public int s_sum(int kor, int eng, int math) {
		return kor + eng + math;
	}

//평균구하기
	public double s_avg() {
		return (int) (sum / 3.0 * 10) / 10;
	}

//학점구하기
	public String s_hak() {
		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70) {
			hak = "C";
		} else {
			hak = "F";
		}
		return hak;
	}

}
