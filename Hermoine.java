
public class Hermoine extends Student implements Runnable {
	Harry harry;
	Flag foundhermione;
	Flag flag;

	PotionsRoom p;
	Library libr;
	Hermoine(Harry harry, Location lib, Flag fh, Flag flg, PotionsRoom p)
	{
		
		super(lib,"hermoine", "female");
		this.harry = harry;
		this.p =p;
		this.foundhermione = fh;
		this.flag = flg;
		Thread t = new Thread(this);
		t.start();
		
	}

	@Override
	public void run() 
	{	

		while(true) {
			if( harry.getLocation().location.equals("library") && (p.flasks==2))
			{
				 
					System.out.println("Hermione: I am here!");
					foundhermione.flag = true;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("You found Hermione. Quickly hide the map before someone catches you!");

					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(this.flag.flag == false) {

						System.out.println("You've been caught! the Marauders map has been confiscated");
						System.exit(0);
					}
					else {
						System.exit(0);
						break;
					}

				//}
			}
		}
	}
}