
public abstract class DeathEater extends Context {
	String name;
	Context c;
	DeathEater(String n)
	{
		name = n;
		c = new Context();
	}
	
	void attack()
	{
		c.nextState();
		System.out.print(this.name); c.printStatus();
		
	}


	
	void defeated() 
	{
		c.nextState();
		System.out.print(this.name);c.printStatus();
	}

}
