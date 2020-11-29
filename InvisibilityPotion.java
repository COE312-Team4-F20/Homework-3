
public class InvisibilityPotion extends Potion
{
	
	InvisibilityPotion() {
		super("Invisibility Potion");
		// TODO Auto-generated constructor stub
	}

	@Override
	void add() throws InterruptedException {
		System.out.println("Add cherries and spiders in cauldron"); Thread.sleep(2000);
	}

	@Override
	void stir() throws InterruptedException {
		System.out.println("Stirring 3 times anticlockwise"); Thread.sleep(2000);
	}
}