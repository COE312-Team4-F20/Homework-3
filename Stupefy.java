
public class Stupefy extends Spell {

	Stupefy() {
		super("Stupefy");
		// TODO Auto-generated constructor stub
	}

	@Override
	void fight() {
		// TODO Auto-generated method stub
		System.out.println("Harry: Stupefy!"); try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} System.out.println("Your opponent is stunned");
		
	
		
	}

}
