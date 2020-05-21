package com.ict.edu01;

public class Ex04 {
//이름(),총점(),평균(),학점(), 순위는 모두1
	private String name = "";
	private int sum = 0;
	private double avg = 0;
	private String hak = "";
	private int rank =1;
	public void name(String name) {
		this.name = name;
	}
	//합계
	public void sum(int kor, int eng, int math) {
		this.sum = kor+eng+math;
	}
	//평균
	public void avg() {
		this.avg = (int)(sum/3.0*10)/10.0;
	}
	//학점
	public void hak() {
		if (avg>=90) {
			hak = "A학점";
		}else if (avg>=80) {
			hak = "B학점";
		}else if (avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}
	//getter/setter
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
	
}
