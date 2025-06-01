package basicJava;

interface Engineer {
	public String getName();

	public Long getSalary();
}

interface SoftwareEngineer {
	public Long getExpeirence();
}

public class AnonymousInnerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer engineer = new Engineer() {

			public String getName() {
				return "Radhe";
			}

			public Long getSalary() {
				return 9000L;
			}

		};
		System.out.println(engineer.getName());
		
		System.out.println(engineer.getSalary());
		
		SoftwareEngineer engineer2 = () -> 5L;
		
		System.out.println(engineer2.getExpeirence());

	}

}
