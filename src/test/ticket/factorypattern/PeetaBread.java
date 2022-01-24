package test.ticket.factorypattern;

import test.ticket.singletonpattern.BreadsMaster;

public class PeetaBread extends BreadType {

	@Override
	public float getRate(int numberOfBreads) {
		BreadsMaster.getInstance().addPeetaBread(numberOfBreads);
		return 30 * numberOfBreads;
	}

}
