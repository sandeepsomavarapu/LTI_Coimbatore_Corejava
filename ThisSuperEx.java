package com.lti.oops;

class ParentEx1 {
	int result = 123;// result

	public ParentEx1() {
		// super()
		this("LTI");
		System.out.println("am from default constructor of parentex1");
	}

	public ParentEx1(String name) {
		System.out.println("am from param constructor of parentex1 :" + name);
	}

	public void m1() {
		System.out.println("am from method m1 of ParentEx1");
	}
}

public class ThisSuperEx extends ParentEx1 {
	int result = 234;// result

	@Override
	public String toString() {
		return "LTI";
	}

	public ThisSuperEx() {
		// super() by default
		this(222);
		System.out.println("am from default constructor");

	}

	public ThisSuperEx(int result) {
		System.out.println("am from param constructor  " + result + " " + this.result + " " + super.result);
		System.out.println(this);
		this.m1();
		super.m1();
	}

	@Override
	public void m1() {
		System.out.println("am from method m1 of ThisSuperEx");
	}

	public static void m2() {
		System.out.println("am from method m1 of ThisSuperEx");
	}

	public static void main(String[] args) {
		ThisSuperEx obj = new ThisSuperEx();
		System.out.println(obj);
		System.out.println(obj.toString());

	}
}