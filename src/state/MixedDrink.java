package state;

public class MixedDrink {
	State chilledState;
	State coldState;
	State hotState;
	State warmState;
	
	State state = warmState;
	
	double temparature = 23.0;
	
	public MixedDrink( double temparature ) {
		chilledState = new ChilledState(this);
		coldState = new ColdState(this);
		hotState = new HotState(this);
		warmState = new WarmState(this);
		
		this.temparature = temparature;
		if ( temparature < 23.0 && temparature > 0 ) {
			state = chilledState;
		}
		else if(temparature < 0 ) {
			state = coldState;
		}
		else if(temparature > 23 && temparature < 30 ) {
			state = warmState;
		}
		else {
			state = hotState;
		}
	}
	public void makeCold() {
		state.makeCold();
	}
	public void makeChilled() {
		state.makeChilled();
	}
	public void makeWarm() {
		state.makeWarm();
	}
	public void makeHot() {
		state.makeHot();
	}
	public void setState( State state ) {
		this.state = state;
	}
	public double getTemparature() {
		return temparature;
	}
	public State getState() {
		return state;
	}
	public State getColdState() {
		return coldState;
	}
	public State getHotState() {
		return hotState;
	}
	public State getChilledState() {
		return chilledState;
	}
	
	public State getWarmState() {
		return warmState;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nDonalds Mixed Drinks Store ");
		result.append("\nDrink is " + state + "\n");
		return result.toString();
	}
	
	
}
