package java8;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		Predicate<Integer> prd = x -> x > 100000;
		System.out.println(prd.test(100));
		System.out.println(prd.test(3000000));
		
		int salary = 10000;
		if(prd.test(salary)) {
			System.out.println("greater than manager's salary");
		}
		else
			System.out.println("less than manager's salary");
		
		Predicate<String> predi = x-> x.toLowerCase().charAt(0) == 'r';
		Predicate<String> predic = x-> x.toLowerCase().charAt(x.length()-1) == 'e';

		System.out.println(predi.test("Radhe"));
		System.out.println(predic.test("radhe"));
		
		// AND in predicate
		Predicate<String> and = predi.and(predic);
		System.out.println(and.test("Radhe"));
		
		// or in predicate
		Predicate<String> or = predi.or(predic);
		System.out.println(or.test("RadheShyam"));
		
		// negate in predicate
		
	}
	
	

}
