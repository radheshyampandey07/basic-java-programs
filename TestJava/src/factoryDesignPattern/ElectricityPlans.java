package factoryDesignPattern;

abstract class ElectricityPlans {

	protected double rate;

	abstract void getRate();

	public void calculateBill(int unit) {
		System.out.println("You have consumed " + unit + " units.");
		System.out.println("You have been charged " + rate * unit + "rs");
	}

}
