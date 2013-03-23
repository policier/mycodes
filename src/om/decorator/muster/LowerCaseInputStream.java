package om.decorator.muster;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
	public LowerCaseInputStream( InputStream in) {
		// TODO Auto-generated constructor stub
		super(in);
	}
	
	public int read() throws IOException{
		int c=super.read();		
		return (c==-1?c:Character.toLowerCase((char)c));		
	}

}
