
public class Fighting implements State
{

	//DeathEater deatheater;
	//Fighting(DeathEater d)
	//{
	//	this.deatheater = d;
	//}
	@Override
	public void prev(Context context) {
		context.setState(new Waiting());
	}

	@Override
	public void next(Context context) {
		context.setState(new Defeated());	
	}

	@Override
	public void printStatus() {
		System.out.println(" is in combat with you! Cast a spell!");
	}

}
