package xstring;

public class MethodsOfMutableString {
	public static void main(String[] args) {
		
		// formula for doubling the size
		// ( default memory + 1 ) * 2
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.capacity()); // 16
		System.out.println(sb.length()); // 0
		
		StringBuilder sb1 = new StringBuilder(234);
		
		System.out.println(sb1.capacity()); // 234
		System.out.println(sb1.length()); // 0
		
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb2.capacity()); // 20
		System.out.println(sb2.length()); // 0
		
		
		StringBuilder sb3 = new StringBuilder();
		
		sb3.append("12345678901234kjhkfgh89656");
		
		System.out.println(sb3.capacity()); // 20
		System.out.println(sb3.length()); // 0
		
		System.out.println("\n\n***************************");
		
		// ---------------------------------------------------------
		
		// insert method
		
		StringBuffer sbz = new StringBuffer("abcd");
		
		System.out.println(sbz.capacity());
		
		sbz.insert(3, 'z');
		
		System.out.println(sbz); // abczd
		
		sbz.insert(sbz.length(), "xxx");
		
		System.out.println(sbz);
		
		System.out.println(sbz.capacity());
		System.out.println(sbz.length());
		
		sbz.insert(sbz.length(), "aksfhlaksdsdsdsddsdfhsdjdhfkejlkjkhgffksdkvbmxb");
		System.out.println(sbz);
		
		System.out.println(sbz.capacity());
		System.out.println(sbz.length());
		
		
	}
}
