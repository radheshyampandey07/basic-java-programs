package serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveStudents {

	public static void main(String[] args) throws IOException, Exception {

		Students s = new Students(1, "Radhe", 30);

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
		objectOutputStream.writeObject(s);
		objectOutputStream.flush();

		objectOutputStream.close();

		System.out.println("object is successfully serialized");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"));
		Students s1 = (Students) in.readObject();

		System.out.println(s1.id + " " + s1.name + " " + s1.age);
		in.close();
	}

}
