import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
public class Farmer {
	//initialize all the basic character and set there value to zero
	public static int wolf = 0;
	public static int cabbage = 0;
	public static int goat = 0;
	public static int ship = 0;
	public static int restart_Count = 0;
	public static int valid_Move = 0;
	
	//manually checking all the possible outcome
	//you can improve this graphic for sure
	public static void checker(int wolf, int cabbage, int goat, int ship)
	{
		if(wolf == 0 && cabbage == 1 &&ship == 1 && goat == 0)
		{
			System.out.println("You poor goat got eaten by the wolf");
			System.out.println(":(");
			System.out.println("[wolf]:Full~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[goat]:Dead~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~[Cabbage]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[Boat]");
			restart_Count++;
			return;
		}
		if(wolf == 0 && cabbage == 1 &&ship == 0 && goat == 0)
		{
			System.out.println(":)");
			System.out.println("[wolf]:~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[goat]:~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~[Cabbage]");
			System.out.println("[Boat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		if(wolf == 1 && cabbage == 0 && ship == 1 && goat == 0)
		{
			System.out.println("You poor cabbage got eaten by the goat");
			System.out.println(":(");
			System.out.println("[goat]:Full~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[cabbage]:Dead~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[wolf]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[Boat]");
			restart_Count++;
			return;
		}
		if(wolf == 0 && cabbage == 0 && ship == 1 && goat == 1)
		{
			System.out.println(":)");
			System.out.println("[wolf]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[cabbage]~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[goat]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[Boat]");
		}
		if(wolf == 0 && cabbage == 0 && ship == 0 && goat == 1)
		{
			System.out.println(":)");
			System.out.println("[wolf]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[cabbage]~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[goat]");
			System.out.println("[Boat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		if(wolf == 0 && cabbage == 0 && ship == 0 && goat == 0)
		{
			System.out.println(":)");
			System.out.println("[wolf]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[cabbage]~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[goat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[Boat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		if(wolf == 0 && cabbage == 0 && ship == 1 && goat == 0)
		{
			System.out.println(":)");
			System.out.println("[wolf]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[cabbage]~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[goat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[Boat]");
		}
		
		if(wolf == 0 && cabbage == 1 && ship == 1 && goat == 1)
		{;
			System.out.println(":)");
			System.out.println("[wolf]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~[cabbage]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[goat]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[Boat]");
		}
		if(wolf == 0 && cabbage == 1 && ship == 0 && goat == 1)
		{
			System.out.println("You poor cabbage got eaten by the goat");
			System.out.println(":(");
			System.out.println("[wolf]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~[cabbage]:Dead");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~[goat]:Full");
			System.out.println("[Boat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			restart_Count++;
			return;
		}
		if(wolf == 1 && cabbage == 0 && ship == 1 && goat == 1)
		{
			System.out.println(":)");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[wolf]");
			System.out.println("[cabbage]~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[goat]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[Boat]");
		}
		if(wolf == 1 && cabbage == 0 && ship == 0 && goat == 1)
		{
			System.out.println("You poor goat got eaten by the wolf");
			System.out.println(":(");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~[wolf]:Full");
			System.out.println("[cabbage]~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~[goat]:Dead");
			System.out.println("[Boat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			restart_Count++;
			return;
		}
		if(wolf == 1 && cabbage == 0 && ship == 0 && goat == 0)
		{
			System.out.println(":)");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[wolf]");
			System.out.println("[cabbage]~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[goat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[Boat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		if(wolf == 1 && cabbage == 1 && ship == 1 && goat == 0)
		{
			System.out.println(":)");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[wolf]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~[cabbage]");
			System.out.println("[goat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[Boat]");
		}
		if(wolf == 1 && cabbage == 1 && ship == 0 && goat == 0)
		{
			System.out.println(":)");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[wolf]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~[cabbage]");
			System.out.println("[goat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[Boat]~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		if(wolf == 1 && cabbage == 1 && ship == 1 && goat == 1)
		{
			System.out.println(":)");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[wolf]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~[cabbage]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[goat]");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~[Boat]");
			
			//showing that you win and ask you for feedbacks
			System.out.println("harray! You complete the task!");
			System.out.println("Please rate this game [good:1] [okay:2] [bad:3]");
			Scanner  sc = new Scanner(System.in);
			String content = sc.nextLine();
			String[] array = new String[]
					{
						"1","2","3","good","okay","bad"
					};
			if(Arrays.asList(array).contains(content))
			{
				switch(content){
				
				case "1":
				content = "good";
				break;
				
				case "2":
				content = "okay";
				break;
				
				case "3":
				content = "bad";
				break;
				}
			
				//using try blocks to catch any errors
			String fileName = "feedback.txt";
			try {
				FileWriter outputStream = new FileWriter(fileName,true);
				BufferedWriter out = new BufferedWriter(outputStream);
				out.write("(" + content + ")" +  new java.util.Date()+"\n");
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				System.out.println("Thank you for your feed back!");
				System.exit(10);
			}
			
		}
	}	
	
	public static void main(String[] args)
	{
		//initialize scanner object
		Scanner  sc = new Scanner(System.in);
		while(true)
		{
		if(restart_Count == 1)
		{
			System.out.println("You lose, Enter R to restart");
			String restart = sc.nextLine();
			restart_Count = 0;
			wolf = 0;
			cabbage = 0;
			goat = 0;
			ship = 0;
			if(restart.equals("r") == false)
			{
				System.out.println("Game over");
				System.exit(10);
			}	
		}
	
		while(restart_Count == 0)
		{
			
		//reset valid move to zero
		valid_Move = 0;
		System.out.println("Who do u want to take to the other side of the river");
		System.out.println("wolf, goat, cabbage or nothing? [nothing indicates u ride the boat urself]" );
			
		String select = sc.nextLine();
		String[] array1 = new String[]
				{
					"wolf","goat","cabbage","nothing"
				};
		if(Arrays.asList(array1).contains(select) == false)
		{
			System.out.println("Please enter the following key (wolf), (goat), (cabbage) or (nothing) [nothing indicates u ride the boat urself]");
			System.out.println("Who do u want to take to the other side of the river");
			System.out.println("wolf, goat, cabbage or nothing?");
				
			select = sc.nextLine();
			if(Arrays.asList(array1).contains(select) == false)
			{
				System.out.println("Last chance");
				System.out.println("Who do u want to take to the other side of the river");
				System.out.println("wolf, goat, cabbage or nothing?");
					
				select = sc.nextLine();
			}
			if(Arrays.asList(array1).contains(select) == false)
			{
				System.out.println("Game over follow the rule");	
				restart_Count++;
			}
			
		}
		String test = select;
		if(test.equals("wolf") && ship != wolf)
		{
			System.out.println("invalid move!");
			valid_Move++;
			
		}
		if(test.equals("cabbage") && ship != cabbage)
		{
			System.out.println("invalid move!");
			valid_Move++;
		}
		if(test.equals("goat")&& ship != goat)
		{
			System.out.println("invalid move!");
			valid_Move++;
		}
		if(restart_Count == 0 && valid_Move == 0)
		{
		//ship automatically go to the other side of the river
		ship = ship == 0 ? 1 : 0;
		switch(select) {
		case "wolf":
			wolf = wolf == 0 ? 1 : 0;
			System.out.println("You took the wolf to the other side");
			break;
		case "cabbage":
			cabbage = cabbage == 0 ? 1 : 0;			
			System.out.println("You took the cabbage to the other side");
			break;
		case "goat":
			goat = goat == 0 ? 1 : 0;	
			System.out.println("You took the goat to the other side");
			break;
		case "nothing":

			System.out.println("You went to the other side of the river yourself");
			break; 
		}
		checker(wolf, cabbage, goat, ship);
		}
		}
		
		
	// determine whether one specifiic move of true game is valid (legal)
		}
	}
}
