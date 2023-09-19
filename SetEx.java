package com.lti.collections;

import java.util.TreeSet;

//LIST
//duplicates are notallowed 
//insertion order is not followed 

public class SetEx {

	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<String>();
		names.add("suresh");
		names.add("naresh");
		names.add("rajesh");
		names.add("somesh");
		names.add("hitesh");
		names.add("suresh");
		System.out.println(names);

	}

}
