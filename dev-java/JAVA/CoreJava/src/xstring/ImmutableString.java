package xstring;

public class ImmutableString {
	public static void main(String[] args) {
		
		// string literals are always immutable
		String s1 = "Infosys";
		s1.concat(" Limited");
		
		System.out.println(s1);
		
		
		String s2 = new String("infosys");
		s2.concat(" limited");
		
		System.out.println(s2);
		
		
	}
}
