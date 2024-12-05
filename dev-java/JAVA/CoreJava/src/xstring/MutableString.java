package xstring;

public class MutableString {
	public static void main(String[] args) {
		
		// string buffer and string builder is mutable
		
		StringBuffer sbf = new StringBuffer("Infosys");
		sbf.append(" Limited");
		System.out.println(sbf);
		
		
		StringBuilder sbl = new StringBuilder("infosys");
		sbl.append(" limited");
		System.out.println(sbl);
		
	}
}
