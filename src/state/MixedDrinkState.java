package state;

public class MixedDrinkState {

	public static void main(String[] args) {
		MixedDrink mixedDrink = new MixedDrink(23.0);
		
		System.out.println(mixedDrink);
		
		mixedDrink.makeChilled();
		mixedDrink.makeWarm();
		mixedDrink.makeCold();
		mixedDrink.makeHot();
		System.out.println(mixedDrink);
		
		mixedDrink = new MixedDrink(-1);
		
		System.out.println(mixedDrink);
		mixedDrink.makeHot();
		
		
		mixedDrink = new MixedDrink(50);
		
		System.out.println(mixedDrink);
		mixedDrink.makeCold();
		System.out.println(mixedDrink);
	}

}
