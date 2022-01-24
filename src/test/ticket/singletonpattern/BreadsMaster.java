package test.ticket.singletonpattern;

public class BreadsMaster {
	
	private static BreadsMaster object;
	private int totalPizzas = 0;
	private int totalPeetaBread = 0;
	private int totalNaan = 0;
	
	private BreadsMaster() {
		
	}
	public static BreadsMaster getInstance() {
		if(object == null ) {
			object = new BreadsMaster();
		}
		return object;
	}
	
	public void addPizza(int tickets) {
		totalPizzas = totalPizzas + tickets;
	}
	
	public void addPeetaBread(int tickets) {
		totalPeetaBread = totalPeetaBread + tickets;
	}
	
	public void addNaanBread(int tickets) {
		totalNaan = totalNaan + tickets;
	}
	public int getTotalPizzas() {
		return totalPizzas;
	}
	public int getTotalPeetaBreads() {
		return totalPeetaBread;
	}
	public int getTotalNaans() {
		return totalNaan;
	}
	
	public int getTotalBreadsSold() {
		return totalPizzas + totalPeetaBread + totalNaan;
	}

}
