package com.lti.collections;
//similar,dis-similar data allowed

//lots of predefined method
//not fixed in size

import java.util.ArrayList;

//LIST
//duplicates are allowed 
//insertion order is followed 

public class ListEx {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("suresh");
		names.add("naresh");
		names.add("rajesh");
		names.add("somesh");
		names.add("hitesh");
		names.add("suresh");
		System.out.println(names);

	}

}
