package factoryDesignPattern;

public class Domestic extends ElectricityPlans {

	@Override
	void getRate() {
		rate = 3.50;
	}
}

class CommercialPlan extends ElectricityPlans {

	@Override
	void getRate() {
		rate = 7.50;
	}
}

class InstitutionalPlan extends ElectricityPlans {

	// @override
	public void getRate() {
		rate = 5.50;
	}
}