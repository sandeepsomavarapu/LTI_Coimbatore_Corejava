package com.ObjectStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileInOut {
	
	void read() throws Exception {
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\KHAN AHMED\\eclipse-workspace\\Mourya\\src\\com\\ObjectStream\\task.txt");
		Bean Be;
		ObjectInputStream ois = new ObjectInputStream(fis);
		while((Be =(Bean)ois.readObject())!=null) {
			System.out.println(Be);
		}
		}catch(Exception e) {
			System.out.println("End of FILE");
		}
		System.out.println("end of the file");
	}
}

