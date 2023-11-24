package abstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		WorkBillFactory workBill = new WorkBillFactory();
		BillManager billManager = new BillManager(workBill);
		
		billManager.processBill("vat");

	}

}
