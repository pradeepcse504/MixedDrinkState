package state;

public class WarmState implements State {
	MixedDrink mixedDrink;
	public WarmState(MixedDrink mixedDrink) {
		// TODO Auto-generated constructor stub
		this.mixedDrink = mixedDrink;
	}

	@Override
	public void makeCold() {
		// TODO Auto-generated method stub
		System.out.println("Drink made cold");
		mixedDrink.setState(mixedDrink.getColdState());
	}

	@Override
	public void makeChilled() {
		
		System.out.println("Drink chilled");
		mixedDrink.setState(mixedDrink.getChilledState());
	}

	@Override
	public void makeHot() {
		// TODO Auto-generated method stub
		System.out.println("Drink is hot");
		mixedDrink.setState(mixedDrink.getHotState());
	}

	@Override
	public void makeWarm() {
		// TODO Auto-generated method stub
		System.out.println("Drink is already warm");
	}
	public String toString() {
		return " warm";
	}

}
