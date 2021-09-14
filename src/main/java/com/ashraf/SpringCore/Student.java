package com.ashraf.SpringCore;

public class Student {
	 private String name;
	private double marks;
    private	int roll_no;
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", roll_no=" + roll_no + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

}
