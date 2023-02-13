package Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
//		File f = new File("D://class12//test789123.text");
//		try {
//			if(!f.exists()) {
//				System.out.println("file is created successfully");
//			
//			f.createNewFile();
//			}
//			System.out.println("file is already created ");
//		} catch (IOException e) {
//			System.out.println("file creation is failed");
//		}
		File f = new File("D://class12//test789123.text");
		if(f.exists()) {
		f.delete();
		System.out.println("file is deleted successfullu");
		}
		System.out.println("file is already deleted");
		System.out.println("file work is done");
		
	}

}
