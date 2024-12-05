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
		
		
		
		// For Memory Management
		
//		String s = "Infosys";
		
//		This string is created in string pool area and s is in stack area pointing to SCP
		
//		STRING CONSTANT POOL is also a part of HEAP AREA only
		
//		Garbage collection of the String Constant Pool may or may not occur, depending on the JVM implementation and memory pressure.
		
		
		
	}
}
