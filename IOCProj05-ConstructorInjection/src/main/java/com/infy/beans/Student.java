package com.infy.beans;

public class Student {
	private int sno;
	private String sname;
	private float avg;

	public Student(int sno, String sname, float avg) {
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
		System.out.println("Student():: 3-param constructor");
	}

	public void showDetails() {
		System.out.println("sno: " + sno + ", sname: " + sname + ", avg: " + avg);
	}

}
