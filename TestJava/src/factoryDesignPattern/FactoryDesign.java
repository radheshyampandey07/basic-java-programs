package factoryDesignPattern;

public class FactoryDesign {

	public ElectricityPlans getPlan(String str) {
		if (str == null)
			return null;

		if (str.equals("domestic"))
			return new Domestic();

		else if (str.equals("comercial"))
			return new CommercialPlan();

		else if (str.equals("institutional"))
			return new InstitutionalPlan();

		return null;
	}

}
