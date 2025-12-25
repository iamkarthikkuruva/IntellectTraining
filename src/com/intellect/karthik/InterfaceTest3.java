package com.intellect.karthik;

interface Vehicles {
	public abstract void twoWheller();

	public abstract void fourWheller();

	public abstract void runOnWater();

	public abstract void runOnTracks();

	public abstract void runOnAir();

	default void engine() {
		System.out.println("Engine started");
	}

	default void run() {
		System.out.println("running");
	}

}

abstract class RunsOnWater implements Vehicles {
	@Override
	public void fourWheller() {

	}

	@Override
	public void runOnAir() {

	}

	@Override
	public void runOnTracks() {

	}

	@Override
	public void runOnWater() {

	}

	@Override
	public void twoWheller() {

	}
}

abstract class TwoWheller implements Vehicles {

	@Override
	public void fourWheller() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runOnWater() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runOnTracks() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runOnAir() {
		// TODO Auto-generated method stub

	}

}

abstract class FourWheller implements Vehicles {
	@Override
	public void runOnAir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runOnTracks() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runOnWater() {
		// TODO Auto-generated method stub

	}

	@Override
	public void twoWheller() {
		// TODO Auto-generated method stub

	}
}

abstract class RunOnTracks implements Vehicles {
	@Override
	public void fourWheller() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runOnAir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runOnWater() {
		// TODO Auto-generated method stub

	}

	@Override
	public void twoWheller() {
		// TODO Auto-generated method stub

	}
}

abstract class RunsOnAir implements Vehicles {
	@Override
	public void fourWheller() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runOnTracks() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runOnWater() {
		// TODO Auto-generated method stub

	}

	@Override
	public void twoWheller() {
		// TODO Auto-generated method stub

	}
}

class Ship extends RunsOnWater {
	public void runOnWater() {
		System.out.println("Ship is always runs on Water");
	}

}

class Bike extends TwoWheller {
	@Override
	public void twoWheller() {
		System.out.println("Bike Always runs on Road");
	}

}

class Bus extends FourWheller {
	@Override
	public void fourWheller() {
		System.out.println("Bus Always runs on Road");
	}
}

class Train extends RunOnTracks {
	@Override
	public void runOnTracks() {
		System.out.println("Train Always runs on Tracks");
	}
}

class Airplain extends RunsOnAir {
	@Override
	public void runOnAir() {
		System.out.println("Airplain Always runs on air");
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.engine();
		b.run();
		b.twoWheller();
	}

}
