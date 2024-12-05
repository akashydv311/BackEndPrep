package xstring;

public class BufferAndBuilder {
	public static void main(String[] args) {
		
		// StringBuffer => 1.0 V
//						   All the methods present are synchronized
//		At the time on StringBuffer object only one thread can operate
//		Since only one thread can operate it is "thread safety"
//		Performance is low
		
		
		
		
		// StringBuilder => 1.5 V
//							All the methods present are not synchronized
		
//		At the time on StringBuilder object many thread can operate
//		so it is not "thread safety"
//		Performance is high
		
		
		
		
		
	}
}
