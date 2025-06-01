package stringEx;

class SB {
	StringBuilder sb = new StringBuilder();

	public SB(StringBuilder sb) {
		this.sb = sb;
	}
	
	public void sayHello() {
		StringBuilder sb = new StringBuilder("hELLO world!!!");
		System.out.println(sb);
		
		// change any character in string builder
		sb.setCharAt(0, 'H');
		System.out.println(sb);
		
		// append any string to original string
		sb.append('b');
		sb.append("hhhhrr.....");
		System.out.println(sb);
		System.out.println("reverse print  -> "+sb.reverse());
	}
}

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("hello");
		SB sb = new SB(s);
		sb.sayHello();
		System.out.println(true && false);
	}

}
