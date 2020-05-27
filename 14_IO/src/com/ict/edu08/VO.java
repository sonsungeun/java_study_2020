package com.ict.edu08;

import java.io.Serializable;

public class VO implements Serializable {

	private String name ;
	private int sum;
	private double avg;
	private String hak;
	
	
	public VO() {}
	public VO(String name, int kor, int eng, int math) {
		this.sum = kor+eng+math;
		this.name = name;
		this.avg = (int)(sum/3.0*10)/10.0;
		if (this.avg>=90) {
			this.hak = "A학점";
		}else if (this.avg>=80) {
			this.hak ="B학점";
		}else if (this.avg>=70) {
			this.hak = "C학점";
		}else {
			this.hak = "F학점";
		}
	}
	
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
	

}
