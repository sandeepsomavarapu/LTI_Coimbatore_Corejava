package com.lti.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileOut = new FileInputStream("emps_info.txt");

		ObjectInputStream out = new ObjectInputStream(fileOut);

		Employee emp = (Employee) out.readObject();
		System.out.println(emp);
		out.close();
		fileOut.close();
	}
}
