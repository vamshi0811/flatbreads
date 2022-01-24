package test.ticket.factorypattern;

import test.ticket.singletonpattern.BreadsMaster;

public class Pizza extends BreadType {

	@Override
	public float getRate(int numberOfBreads) {
		BreadsMaster.getInstance().addPizza(numberOfBreads);
		return 300 * numberOfBreads;
	}

}
