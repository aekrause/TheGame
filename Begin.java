package TheGame;
import java.util.Scanner;
public class TheGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
		boolean cont = true;
		
		while(cont) {
			System.out.println("Welcome Tim, to your scavenger hunt, I am your helper on this tour to find your treasure");
			System.out.println("How exciting! I wonder what it could be....");
			System.out.println("ps. i wouldnt bother asking my creator for help, i didnt tell her where i hid it :");
			System.out.println("  ");
			
			System.out.println("Would you like to play? 1:Yes 2:No");
			int choice = input.nextInt();
			if(choice == 1) {
			System.out.println("Good choice! I didnt do all this hard work for nothing.....");
				
			}else if(choice == 2){
				System.out.println("Screw you were still gonna play, i put too much work into this to not play it");
			}
			System.out.println("Now i think someone may have given you your first clue, its kindve meaningless, unless you crack the code O_O");
			System.out.println("");
			System.out.println("I cant just give yoyu the cipher key...i could but i dont want to lol");
			System.out.println("  ");
			
			
			System.out.println("First you have to answer a couple of questions to be able to continue:)");
			System.out.println("  ");
			
			System.out.println("WHAT is your quest?");
			System.out.println("1: To seek the holy grail");
			System.out.println("2: To jerk off");
			System.out.println("3: To find the treasure!");
						
			boolean con = true;
			
			while(con) {
			int option1 = input.nextInt();
				if(option1 == 1 ) {
				System.out.println("This isnt monty python tim smh, try again");
			}else if(option1 == 2 )  {
				System.out.println("Lets maybe do this first ok? try again");
			}else if(option1 == 3 ) {
				System.out.println("Yay! Thats right!!");
				con = false;
			}
			}
			
			
			System.out.println("  ");
			System.out.println("WHAT is your favorite color?");
			System.out.println("1: Blue");
			System.out.println("2: Red");
			System.out.println("3: Yellow");
			
			boolean con2 = true;
			
			while(con2) {
			int option2 = input.nextInt();
				if(option2 == 1) {
				System.out.println("Yep! (Wow youre so smart you know your own favorite color)");
				con2 = false;
			}else if(option2 == 2) {
				System.out.println("Uhh no thats Anns favorite color, try again");
			}else if(option2 == 3) {
				System.out.println("Ew no one likes yellow, try again");
				
			}
			}
			
			System.out.println("Yay you passed the test! now i can be your key for the rest of the scavenger hunt, Good luck!!");
			System.out.println("Now turn on the lamp");
			
			cont = true;
			while(cont) {
				System.out.println("Enter the code to be deciphered");
				System.out.println("-------enter 0 to exit-------");
				int codes = input.nextInt();
				
				if(codes == 0) {
					cont = false;
				}else {
					decode(codes);
				}
				
				
				
				
			}
			
			
		}
			
			
			
			
			
			
			
	
	}
	
	
	public static void decode(int code) {
		if (code > 127) {
            System.out.println("Enter a valid input silly!");
        } else {
            //convert the integer value to character
            char asciiChar = (char) code;

            System.out.println( asciiChar);
            
        }
	}

}
