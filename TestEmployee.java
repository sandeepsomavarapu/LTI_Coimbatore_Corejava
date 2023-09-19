package com.lti.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployee {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp = new Employee(123, "mahesh", 9000);

		FileOutputStream fileOut = new FileOutputStream("emps_info.txt");

		ObjectOutputStream out = new ObjectOutputStream(fileOut);

		out.writeObject(emp);
		out.close();
		fileOut.close();

	}
}
