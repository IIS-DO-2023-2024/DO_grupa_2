package observer3;

public class TestObserver3 {
	public static void main(String[] args) {
		CryptoCurrencyPrice cp = new CryptoCurrencyPrice(); // support - observable
		CryptoCurrencyUpdateSMS cSMS = new CryptoCurrencyUpdateSMS(); // listener - observer
		
		cp.addListener(cSMS);
		
		cp.setBitcoinPrice(150000);
		cp.setEtherPrice(50000);
	}
	

}
