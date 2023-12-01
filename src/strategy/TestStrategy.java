package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentShoppingCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart pensionersShoppingCart = new ShoppingCart(new PensionersDiscount());
		
		double amount = 100;
		System.out.println("Regularna cena je: " + amount + " RSD");
		
		double studentPrice = studentShoppingCart.calculateTotal(amount);
		System.out.println("Cena za studente je: " + studentPrice + " RSD");
		
		double pensionersPrice = pensionersShoppingCart.calculateTotal(amount);
		System.out.println("Cena za penzionere je: " + pensionersPrice + " RSD");

		// BufferedWriter - klasa u Javi koja omogućava pisanja podataka u tok podataka (stream) - upis u tekstualnu datoteku (.txt)
		// ObjectOutputStrema - klasa u Javi koja omogućava pisanja objekata u tok podataka (stream) - kreiranje crteža (.bin)
	}

}
