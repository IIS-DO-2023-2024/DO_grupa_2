package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//DatabaseConnection connection1 = new DatabaseConnection();
		//DatabaseConnection connection2 = new DatabaseConnection();
		
		DatabaseConnection connection1 = DatabaseConnection.getInstance();
		DatabaseConnection connection2 = DatabaseConnection.getInstance();
		
		System.out.println(Integer.toHexString(connection1.hashCode()));
		
		System.out.println(connection1);
		System.out.println(connection2);
		
		DatabaseConnectionLazy connection1_lazy = DatabaseConnectionLazy.getInstance();
		DatabaseConnectionLazy connection2_lazy = DatabaseConnectionLazy.getInstance();

		System.out.println(connection1_lazy);
		System.out.println(connection2_lazy);
		
	}

}
