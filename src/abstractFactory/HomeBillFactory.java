package abstractFactory;

import simpleFactory.Bill;

public class HomeBillFactory extends BillFactory{

	@Override
	public Bill createBill(String type) {
		if(type.equals("kindergarten"))
			return new KindergartenBill();
		if(type.equals("housecleaning"))
			return new HousecleaningBill();
		else
			return null;
	}

}
