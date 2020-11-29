
public class PolyJuicePotion extends Potion {

	PolyJuicePotion() {
		super("PolyJuice Potion");
		// TODO Auto-generated constructor stub
	}

	@Override
	void add() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Adding fluxweek and lacewings in cauldron"); Thread.sleep(2000);
	}

	@Override
	void stir() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Stirring 4 times clockwise"); Thread.sleep(2000);
		
	}
	protected boolean wavingRequired() {
		return true;
	}
	

}
