
public class Expelliarmus extends Spell {

	Expelliarmus() {
		super("Expelliarmus");
		// TODO Auto-generated constructor stub
	}

	@Override
	void fight() {
		System.out.println("Harry: Experlliarmus!"); try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} System.out.println("Enemy's weapon is disarmed");
		
	}

}
