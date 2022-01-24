package test.ticket.factorypattern;

import test.ticket.singletonpattern.BreadsMaster;

public class NaanBread extends BreadType {

	@Override
	public float getRate(int numberOfBreads) {
		BreadsMaster.getInstance().addNaanBread(numberOfBreads);
		return 20*numberOfBreads;
	}

}
