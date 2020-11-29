import java.util.Scanner;

public class PotionsRoom extends Room {

	Potion potion1;
	Potion potion2;
	SeverusSnape snape;
	Scanner sc;
	Harry harry;

	int flasks;
	
	PotionsRoom(Harry h)
	{
		snape = new SeverusSnape();
		flasks = 0;
		sc = new Scanner(System.in);
		harry = h;
	}

	public void use(String obj) {
		if (obj.equals("cauldron")) {

			System.out.println("A cauldron is an object used to brew different potions in Professor Snape's class. Potions are drinks that cast magical spells. You look inside and find a foul smelling potion being brewed.");
		}


		else if (obj.equals("potion"))
		{
			System.out.println("You are able to brew only two types of potions. One is polyjuice which was the ability to change your appearance. The other is an invisiblity potion.\n When you make one of them, you need to make two different batches, one for you and one for Hermoine");

		}




		else { System.out.println(obj + " is not located in the potions classroom!"); }
	}


	public void potion(String potion)
	{

		
			//potion = sc.nextLine();
			if(potion.equals("polyjuice"))
			{
				if(flasks == 0) 
				{
					potion1 = new PolyJuicePotion();
					flasks++;

					try {

						potion1.brew();


					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				else if (flasks == 1)
				{
					potion2 = new PolyJuicePotion();
					flasks++;
					try {
						potion2.brew();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				else
					System.out.print("You've run out of ingrediants to make another potion!\nGo to Hermione before Voldemort finds you!");
	
				System.out.println("You now have " + flasks + " potions of Polyjuice");
				if (flasks == 2)
					System.out.println("You can now go to Hermione and give her a potion. Quickly before Voldemort finds you!");

			}
			else if(potion.equals("invisibility"))
			{
				if(flasks == 0) 
				{
					potion1 = new InvisibilityPotion();
					flasks++;
					try {
						potion1.brew();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if (flasks == 1)
				{
					potion2 = new InvisibilityPotion();
					flasks++;
					try {
						potion2.brew();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					System.out.println("You've run out of ingrediants to make annother potion!");
				}
				System.out.println("You now have " + flasks + " potions of invisibility");
				if (flasks == 2)
					System.out.println("You can now go to Hermione and give her a potion. Quickly before Voldemort finds you!");
			}
			
			else {
				System.out.println("Invalid potion!");
			}

		
	}


	public void description() {
		System.out.println("Potions is one of the core subjects that first year students are required to study.\nProfessor Snape is currently the one teaching the class.");
		System.out.println("\n");
		snape.attack();
		harry.attack();
		snape.defeated();
		System.out.println("You saved yourself…now you can now use the cauldron and ingredients to make the Polyjuice potion or the invisibility potion to proceed without anyone recognizing you…");
	}

	
	
	public void talk(String chr) {
		if (chr.equals("Snape"))
		{
			System.out.println("What do you want child? Either go to your cauldron or better yet drink that potion but stop wasting my precious time");
		}
		else
		{
			System.out.println(chr+ " is not in this room... Try again!");
		}

	}

}
