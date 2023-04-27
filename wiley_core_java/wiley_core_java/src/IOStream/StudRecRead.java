package IOStream;

import java.io.*;
import java.util.*;

public class StudRecRead {

	DataInputStream dis;

	public StudRecRead(String inputFile) throws Exception {
		dis = new DataInputStream(new FileInputStream(inputFile));
	}

	public List<StudDet> readAll() throws Exception {
		List<StudDet> listStud = new ArrayList<>();
		while (true) {
			try {
				String name = dis.readLine();
				System.out.println("Name: " + name);
				String gender = dis.readLine();
				System.out.println("Name: " + gender);

				int age = dis.readInt();
				System.out.println("Name: " + age);

				String classname = dis.readLine();
				System.out.println("Name: " + classname + "\n");

				StudDet sd = new StudDet(name, gender, age, classname);
				listStud.add(sd);

				System.out.println("Added Successfully");
			} catch (Exception e) {
				System.out.println("Error: " + e);
				e.printStackTrace();
			}
			return listStud;
		}
	}

	public static void main(String[] args) throws Exception {

		String inputFile = "C:\\Users\\Admin\\Documents\\student.txt";

		try {
			StudRecRead srr = new StudRecRead(inputFile);
			List<StudDet> sd = srr.readAll();
			for (StudDet sdt : sd) {
				System.out.println(sdt.name + "\t");
				System.out.println(sdt.gender + "\t");
				System.out.println(sdt.age + "\t");
				System.out.println(sdt.className + "\t");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
