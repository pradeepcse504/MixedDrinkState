package state;

public class ChilledState implements State {
	MixedDrink mixedDrink;
	public ChilledState( MixedDrink mixedDrink) {
		
		this.mixedDrink = mixedDrink;
	}

	@Override
	public void makeCold() {
		
		System.out.println("Drink is cold");
		mixedDrink.setState(mixedDrink.getColdState());
	}

	@Override
	public void makeChilled() {
		
		System.out.println("Drink is already chilled");
	}

	@Override
	public void makeHot() {
		
		System.out.println("Drink is hot");
		mixedDrink.setState(mixedDrink.getHotState());
	}

	@Override
	public void makeWarm() {
		
		System.out.println("Drink is warm");
		mixedDrink.setState(mixedDrink.getWarmState());

	}
	public String toString() {
		return " chilled";
	}
}
