package test.ticket;

import test.ticket.factorypattern.BreadType;
import test.ticket.factorypattern.BreadFactory;
import test.ticket.singletonpattern.BreadsMaster;

public class FlatBreadMain {
	
	public static void main(String args[]) {
		
		BreadType pizza = BreadFactory.getFlatBreadType("Pizza");
		BreadType naan = BreadFactory.getFlatBreadType("Naan");
		BreadType peetaBread = BreadFactory.getFlatBreadType("PeetaBread");
		
		float pizzasRate = pizza.getRate(4);
		System.out.println("Pizza rate for 4 quantity = " + pizzasRate);
		float naanRate = naan.getRate(2);
		System.out.println("Naan rate for 2 quantity = " + naanRate);
		float peetaBreadRate = peetaBread.getRate(3);
		System.out.println("Peeta Bread rate for 3 quantity = " + peetaBreadRate);
		
		BreadsMaster ticketsObj = BreadsMaster.getInstance();
		System.out.println("Pizzas count = " + ticketsObj.getTotalPizzas());
		System.out.println("Naan count = " + ticketsObj.getTotalNaans());
		System.out.println("Peeta Bread count = " + ticketsObj.getTotalPeetaBreads());
		System.out.println("Total Flat Breads count = " + ticketsObj.getTotalBreadsSold());
		
		
	}

}
