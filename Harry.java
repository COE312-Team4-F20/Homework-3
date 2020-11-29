import java.util.Scanner;

public class Harry extends Student implements Runnable, Observer {
	Flag foundhermione;
	Watch w;
	Subject sub;
	Harry(Location location, Flag fh, Subject sub)
	{
		super(location,"Harry", "male");
		this.sub = sub;
		w = (Watch) sub;
		w.registerObserver(this);
		this.foundhermione = fh;
		Thread t = new Thread(this);
		t.start();
	}
	synchronized void setLocation(Location loc)
	{
		this.studentlocation = loc;
	}
	synchronized Location getLocation()
	{
		return this.studentlocation;
	}
	@Override
	public void run() {

		while(true)
		{
			synchronized(this.foundhermione) {
				if (this.foundhermione.flag == true) {
					System.out.println("Harry: Found Hermione!");
					break;
				}
			}
		}


	}
	@Override
	public void update(int t) {
		
		 if (t == 1 ) {
			
			System.out.println(t + " minute has passed");
		}
		 
		 else if (t == 5) {
			System.out.println( t + " minutes have passed! Quickly hide contents before you're caught!");
		}
		 else {
			 System.out.println(t + " minutes have passed");
			 }
		
	}

	void attack()
	{
		Scanner sc = new Scanner(System.in);
		String spell = sc.nextLine();
		if(spell.equals("Expelliarmus"))
		{
			Expelliarmus ex = new Expelliarmus();
			ex.fight();
		}
		else if(spell.equals("Stupefy"))
		{
			Stupefy st = new Stupefy();
			st.fight();
		}
		else if(spell.equals("Protego"))
		{
			Protego pr = new Protego();
			pr.fight();
		}
		else if (spell.equals("Expecto Patronum"))
		{
			Expecto_Patronum ep = new Expecto_Patronum();
			ep.fight();
		}
		else
		{
			System.out.println("Harry has not learned this spell yet!");
		}
		
	}


}
