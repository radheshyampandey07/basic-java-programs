package stringEx;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s = "Radhe", m = "   ", l = "  pandey";
		String name = null;
		name = s.trim() + " " + m.trim() + " " + l.trim();
		System.out.println(name);
		System.out.println(name.length());

		name = name.replaceAll("\\s+", " ");
		System.out.println(name);
		System.out.println(name.length());

	}

}
