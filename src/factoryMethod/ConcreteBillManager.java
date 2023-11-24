package factoryMethod;

import simpleFactory.Bill;
import simpleFactory.ElectricityBill;
import simpleFactory.GasBill;
import simpleFactory.UtilityBill;

public class ConcreteBillManager extends BillManager{

	@Override
	public Bill createBill(String type) {
		if(type.equals("electricty"))
			return new ElectricityBill();
		if(type.equals("gas"))
			return new GasBill();
		if(type.equals("utility"))
			return new UtilityBill();
		return null;
	}

}
