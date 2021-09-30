package state;

public class ColdState implements State {
	MixedDrink mixedDrink;
	public ColdState( MixedDrink mixedDrink) {
		this.mixedDrink = mixedDrink;
	}

	@Override
	public void makeCold() {
		System.out.println("Drink is already cold");
		
	}

	@Override
	public void makeChilled() {
		System.out.println("Drink is chilled");
		mixedDrink.setState(mixedDrink.getChilledState());

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
		return " cold";
	}
}
