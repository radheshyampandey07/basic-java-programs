package stringEx;

class StringEx {
	String name;

	public StringEx(String name) {
		this.name = name;
		String n = "abz";
		String n1 = "aba";
		// if two string are compared to then if one string is lexographically greater
		// than other string
		// then it will return > 0(basically difference between their ascii value)
		// otherwise ;
		System.out.println("compare two string  " + n.compareTo(n1));
		System.out.println("compare two string  " + n1.compareTo(n));
		
		
		System.out.println("my name is " + name);
		System.out.println("length of name is -> " + name.length());
		System.out.println("in name " + name + ", char at  " + name.charAt(4));
		System.out.println("index of h in name is " + name.indexOf("h"));
		System.out.println("check my name contains xx " + name.contains("xx"));
		System.out.println("substring after 4 " + name.substring(4));
		System.out.println("check my name starts with Rad --" + name.startsWith("Rad"));
		System.out.println("check my name ends with ey  --" + name.endsWith("ey"));
		System.out.println("convert my name into lower case   " + name.toLowerCase());
		System.out.println("convert my name into lower case   " + name.toUpperCase());
	}

	void print() {
		String s1 = "Radhe";
		String s2 = "Radhe";
		System.out.println(s1);
		String s3 = new String("Radhe");

		// == operator checks value stored at same address
		System.out.println(s1 == s2 ? "s1 and s2 are same" : "s1 and s2 are not same");
		// when you create a string using "new" then it create a separate string in heap memory
		System.out.println(s1 == s3 ? "s1 and s3 are same" : "s1 and s3 are not same");

		// equals method compare values only
		System.out.println(s1.equals(s2) ? "s1 and s2 have same values" : "s1 and s2 do not have same values");
		System.out.println(s1.equals(s3) ? "s1 and s3 have same values" : "s1 and s3 do not have same values");
	}
}

public class CompleteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringEx ex = new StringEx("Radxxh h b n b nnnn");
		ex.print();
//		System.out.println("hello");
	}
}
