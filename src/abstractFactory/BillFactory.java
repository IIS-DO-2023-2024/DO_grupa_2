package abstractFactory;

import simpleFactory.Bill;

public abstract class BillFactory {
	
	// ovo mora da ima svaki abstract factory
	public abstract Bill createBill(String type);
}
