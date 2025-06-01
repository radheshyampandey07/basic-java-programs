package factoryDesignPattern;

public class GenerateBill {

	public static void main(String[] args) {

		FactoryDesign design = new FactoryDesign();
		ElectricityPlans domestic = design.getPlan("domestic");
		domestic.getRate();
		domestic.calculateBill(30);
	}
}
