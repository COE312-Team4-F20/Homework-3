
public class Defeated implements State{

	@Override
	public void prev(Context context) {
		context.setState(new Fighting());
		
	}

	@Override
	public void next(Context context) {
		System.out.println("No next state.");
	}

	@Override
	public void printStatus() {
		System.out.println( " has been defeated");
		
	}

}
