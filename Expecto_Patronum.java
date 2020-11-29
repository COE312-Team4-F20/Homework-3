
public class Expecto_Patronum extends Spell {

	Expecto_Patronum() {
		super("Expecto Patronum");
	}

	@Override
	void fight() {
		System.out.println("Harry: Expecto Patronum!"); try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} System.out.println("You're now protected against dark magic");
		
	}

}
