package com.ict.edu10;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class VO implements Externalizable {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int kor;
	private int eng;
	private int math;
	
	public VO() {
		// TODO Auto-generated constructor stub
	}

	public VO(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = (int) (sum / 3.0 * 10) / 10.0;
		if (this.avg >= 90) {
			this.hak = "A학점";
		} else if (this.avg >= 80) {
			this.hak = "B학점";
		} else if (this.avg >= 70) {
			this.hak = "C학점";
		} else {
			this.hak = "F학점";
		}

	}
	//역직렬화
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		sum = (int)in.readObject();
		avg = (double)in.readObject();
		hak = (String)in.readObject();
	
	
	}
	//직렬화
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(kor);
		out.writeObject(eng);
		out.writeObject(math);
		out.writeObject(sum);
		out.writeObject(avg);
		out.writeObject(hak);
	}

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
	
}
