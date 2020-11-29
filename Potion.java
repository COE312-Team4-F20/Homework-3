
public abstract class Potion {

	String name;
	Potion(String n)
	{
		this.name = n;
	}
	final void brew() throws InterruptedException
	{
		add();
		stir();
		heat();
		if (wavingRequired()){
			
			wavewand();
		}
	}
	
	abstract void add() throws InterruptedException;
	abstract void  stir() throws InterruptedException;
	
	void heat() throws InterruptedException
	{
		System.out.println("Appling heat!"); Thread.sleep(2000);
	}
	protected boolean wavingRequired() {
		return false;
	}
	
	void wavewand()
	{
		System.out.println("Waving wand to complete the brewing process");
	}
}
