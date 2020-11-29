
public class Protego extends Spell{

	Protego() {
		super("Protego");
		// TODO Auto-generated constructor stub
	}

	@Override
	void fight() {
		// TODO Auto-generated method stub
		System.out.println("Harry: Protego!"); try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} System.out.println("You're now surrounded by an invisibility shield");
		
	}
		
	}


