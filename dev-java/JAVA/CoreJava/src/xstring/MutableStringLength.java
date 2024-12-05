package xstring;

public class MutableStringLength {
	public static void main(String[] args) {
		
		// 1 way -> setLength() = when u know the length
		// 2 way -> trimToSize() = if length will not change
		// 3 way -> ensureCapacity() = used to increase the capacity to the specific limit
		
		StringBuffer sb = new StringBuffer(1000);
		
		System.out.println(sb.capacity());
		
		sb.append("Java Full Stack");
		sb.trimToSize();
		
		System.out.println(sb.capacity());
		
		
		sb.ensureCapacity(100000000);
		System.out.println(sb.capacity());
		
		sb.trimToSize();
		System.out.println(sb.capacity());
		
	}
}
