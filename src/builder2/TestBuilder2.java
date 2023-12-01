package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("integralna");
		
		builder.meat("pečenica").spread("urnebes").spread("majonez").spread("pavlaka").salad("zelena").meat("kulen").salad("paradjz");
		
		Sandwich sandwich = builder.build();
		System.out.println(sandwich);
		
		//--- kraći zapis
		Sandwich.Builder builder2 = new Sandwich.Builder("Bela kifla");
		Sandwich sandwich2 = builder2.meat("kulen").salad("krastavci").build();
		System.out.println(sandwich2);
	}

}
