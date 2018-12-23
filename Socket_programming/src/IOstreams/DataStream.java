package IOstreams;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) throws IOException {

		//DataInputStream - cita java primitive
		//DataOutputStream - upisuje java primitive
		
		File file = new File("primer3.txt");
		
		if(file.exists()) {
			System.out.println("Fajl vec postoji " + file.getAbsolutePath());
		}
		else {
			file.createNewFile();
			System.out.println("Fajl je kreiran! " + file.getAbsolutePath());
		}
		
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		
		dos.writeInt(72);
		dos.writeDouble(22.12);
		dos.writeFloat(123.43f);
		
		int var = dis.readInt();
		double var2 = dis.readDouble();
		float var3 = dis.readFloat();
		
		System.out.println("Integer value: " + var + ";\n double value: " + var2 + ";\n float value: " + var3);
		
		dos.close();
		dis.close();
		
	}

}
