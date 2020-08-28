package com.ict.edu5;

// VO(Value Object) : 관계 데이터 베이스의 레코드(행)에 대응되는 자바 클래스이다.
//					  관계 데이터 베이스의 컬럼명과 같은 이름의 변수를 만들어서 사용
public class VO {
	private String idx, m_id, m_pw, m_name, m_age, m_reg;
	public VO() {}
	public VO(String idx, String m_id, String m_pw, String m_name, String m_age, String m_reg) {
		super();
		this.idx = idx;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_age = m_age;
		this.m_reg = m_reg;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_age() {
		return m_age;
	}
	public void setM_age(String m_age) {
		this.m_age = m_age;
	}
	public String getM_reg() {
		return m_reg;
	}
	public void setM_reg(String m_reg) {
		this.m_reg = m_reg;
	}
	
}
