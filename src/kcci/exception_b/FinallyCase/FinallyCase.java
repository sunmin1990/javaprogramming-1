package kcci.exception_b.FinallyCase;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class FinallyCase {
	public static void main(String[]args) {
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('Z');
		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		finally {
//			if(writer != null) {
//				writer.close();
//			}
// close의 호출문에서 IOException예외가 발생할 수 있다. 
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
		// finally 내에서도 try~catch문을 작성할 수 있다.
			try {
				if(writer != null)
					writer.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}