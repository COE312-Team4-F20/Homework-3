import java.util.Scanner;

public class Main  {
		
	public static void main(String[] args) {
		
	
		System.out.println("“Messers Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to\n" + "magical Mischief-Makers are proud to present THE MARAUDER'S MAP”\n" + "\nSay the magic phrase to reveal the map.");
		
	    Scanner sc = new Scanner(System.in);
	    String phrase = sc.nextLine();

	    while (!phrase.equals("I solemnly swear that I am up for no good")){
	            System.out.println("Sorry... Please try again!");
	            phrase = sc.nextLine();
	    }
			
			System.out.println("\nThe Enterance\n\nYou arrive at the doors of Hogwarts. The door on the north wall leads to the dining hall, the door to the east leads to the Potions class, and the door to the west leads to the Library.");
			String command = "";
			Watch watch = new Watch(false);
			Flag fl = new Flag(false);
			Flag time = new Flag(false);
			Location loca = new Location("entrance");
			Harry harry = new Harry(loca,fl, watch);
			Location lib = new Location("library");
			PotionsRoom p = new PotionsRoom(harry);
			Hermoine hermione = new Hermoine(harry, lib,fl, time,p);
			Library l = new Library(harry);
			Dininghall d = new Dininghall(harry);
			watch.registerObserver(harry);
				
			while(!command.equals("mischeief managed"))
			{
				command = sc.nextLine();
				String[] elements = command.split(" ");
				if (elements[0].equals("walk"))
				{
					
					loca.walk(elements[1]);
					
				}
			
				else if (command.equals("look around"))
				{
					if (loca.location.equals("dining")) d.description();
					else if (loca.location.equals("potions")) p.description();
					else if (loca.location.equals("library")) l.description();
				
				}
				else if (elements[0].equals("talk"))
				{
					if (loca.location.equals("dining")) d.talk(elements[2]);
					else if (loca.location.equals("potions")) p.talk(elements[2]);
					else if (loca.location.equals("library")) l.talk(elements[2]);
				}
				else if (elements[0].equals("use"))
				{
					if (loca.location.equals("dining")) d.use(elements[1]);
					else if (loca.location.equals("potions")) p.use(elements[1]);
					else if (loca.location.equals("library")) l.use(elements[1]);
				}
				else if(elements[0].equals("make"))
				{
					if(loca.location.equals("potions")) p.potion(elements[1]);
				}
				else if(elements[0].equals("exit"))
				{
						System.out.println("Leaving the room... Enter a new direction");
				}
				else if (!command.equals("mischeief managed"))
				{
					System.out.println("Invalid comand! Please try again later with a valid command!");
				}
			
			}
			System.out.println("Hiding map contents... end");
		
			watch.f.flag = true;
			time.flag = true;
			System.exit(0);
			
	}



}

