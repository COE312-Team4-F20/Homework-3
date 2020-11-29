
public class Waiting implements State {

	@Override
	public void prev(Context context) {
		System.out.println("This is the core state");
	}

	@Override
	public void next(Context context) {
		 context.setState(new Fighting());
		
	}

	@Override
	public void printStatus() {
		System.out.println(this + " is waiting");
		
	}
	
}
