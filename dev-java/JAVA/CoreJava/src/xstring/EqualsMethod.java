package xstring;

public class EqualsMethod {
	public static void main(String[] args) {
		
		// for String() class equals methods is present
		// for StringBuffer() & StringBuilder equals methods is not available it comes from Object class that compare reference not an the data
		
		String str1 = "sachin";
		String str2 = "sachin";
		System.out.println( str1 == str2 );
		System.out.println( str1.equals(str2) );
		
		System.out.println("***************");
		
		
		
		String s1 = new String("Acer Laptop");
		String s2 = new String("Acer Laptop");
		
		System.out.println( s1 == s2 );
		System.out.println(s1.equals(s2));
		
		System.out.println("*************");
		
		
		
		
		StringBuilder sb1 = new StringBuilder("Dell Laptop");
		StringBuilder sb2 = new StringBuilder("Dell Laptop");
		System.out.println(sb1.equals(sb2));
		System.out.println( sb1 == sb2 );
		
		System.out.println("*************");
		
		
		
		StringBuffer sbx1 = new StringBuffer("HP Laptop");
		StringBuffer sbx2 = new StringBuffer("HP Laptop");
		System.out.println(sbx1 == sbx2);
		System.out.println( sbx1.equals(sbx2) );
		
		
	}
}






