package com.lti.collections;

import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> emps = new TreeMap<>();
		emps.put(5, "mahesh");
		emps.put(2, "naresh");
		emps.put(45, "somesh");
		emps.put(9, "hitesh");
		emps.put(5, "rajesh");
		System.out.println(emps);
	}

}
