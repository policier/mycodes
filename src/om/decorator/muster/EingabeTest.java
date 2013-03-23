package om.decorator.muster;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EingabeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		try {
		InputStream in= new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));
			while ((c=in.read())>0) {
				System.out.println((char)c);				
			}
		in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
