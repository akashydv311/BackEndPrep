package xstring;

public class FinalMutableString {
	public static void main(String[] args) {
		
		// final say data should not change
		final StringBuffer sb = new StringBuffer("Hello ");
		
		// we made sb reference as final so we can't data because string in mutable
		
		sb.append("java focks!");
		System.out.println(sb);

//		sb = new StringBuffer("Hi"); // The final local variable sb cannot be assigned.
//		System.out.println(sb); 
		
	}
}
