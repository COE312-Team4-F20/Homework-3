
public class Location {
	String location;
	Location(String loc)
	{
		location = loc;
	}
	public void walk(String dir)
	{
		if (dir.contains("north") == true)
		{
			System.out.println("You have entered the dinning room!");
			//System.out.println("The dining hall is the biggest open area inside Hogwarts. Dumbledore is in the hall to welcome new students.");
			location = "dining";
		}
		else if (dir.contains("east") == true) {
			System.out.println("You have entered your Potions class");
			//System.out.println("Potions is one of the core subjects that first year students are required to study. Professor Snake is currently the one teaching the class");
			location = "potions";
		}
		else if (dir.contains("west") == true) {
			System.out.println("You have entered the Library");
			//System.out.println("Once the academic year starts, students spend a lot of time in the library. Hermoine is here.");
			location = "library";
		}
		else {
			System.out.println("Invalid Direction");
		}
	}
}
