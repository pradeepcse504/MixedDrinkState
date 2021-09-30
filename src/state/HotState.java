package state;

public class HotState implements State {
	MixedDrink mixedDrink;
	public HotState(MixedDrink mixedDrink) {
		
		this.mixedDrink = mixedDrink;
	}

	@Override
	public void makeCold() {
		
		System.out.println("Drink is cold");
		mixedDrink.setState(mixedDrink.getColdState());
	}

	@Override
	public void makeChilled() {
		
		System.out.println("Drink is chilled");
		mixedDrink.setState(mixedDrink.getChilledState());
	}

	@Override
	public void makeHot() {
		
		System.out.println("Drink already hot");

	}

	@Override
	public void makeWarm() {
		
		System.out.println("Drink is warm");
		mixedDrink.setState(mixedDrink.getWarmState());
	}
	public String toString() {
		return " hot";
	}
}
