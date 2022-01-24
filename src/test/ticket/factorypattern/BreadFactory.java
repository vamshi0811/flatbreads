package test.ticket.factorypattern;

public class BreadFactory {
	
	public static BreadType getFlatBreadType(String name) {
		switch(name) {
			case "Pizza":
				return new Pizza();
			case "PeetaBread":
				return new PeetaBread();
			case "Naan":
				return new NaanBread();
			default:
				return null;
		}
	}

}
