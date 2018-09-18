import java.util.Scanner;

public class Main {
	
	public static String nameReader() {
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter player's name: ");
		String name=reader.nextLine();
		return name;
	}
	
	public static int statsReader(String s) {
		Scanner reader= new Scanner(System.in); 
		System.out.println("Enter "+ s +": ");
		return reader.nextInt();
	}
	
	public static void printStats(String s, Logic p) {
		switch(s) {
		case "BA":
			System.out.println("BA is:"+ p.BA());
			System.out.println();
			break;
		case "SLG":
			System.out.println("SLG is:"+p.SLG());
			System.out.println();
			break;
		case "OBS":
			System.out.println("OBS is:"+p.OBS());
			System.out.println();
			break;
		case "OBP":
			System.out.println("OBP is:"+p.OBP());
			System.out.println();
			break;
		case "TB":
			System.out.println("TB is:"+p.TB());
			System.out.println();
			break;
		}
	}

	public static void main(String[] args) {
		String name=nameReader();
		int RAB = statsReader("AB");
		int RH = statsReader("H");
		int R2B = statsReader("2B");
		int R3B = statsReader("3B");
		int RHR = statsReader("HR");
		int RR =statsReader("R");
		int RBB = statsReader("BB");
		
		Logic player=new Logic(name, RAB, RH, R2B, R3B, RHR, RR, RBB);
		
		System.out.println();
		printStats("BA",player);
		printStats("SLG",player);
		printStats("OBS",player);
		printStats("OBP",player);
		printStats("TB",player);
		
		
		
	}

}
