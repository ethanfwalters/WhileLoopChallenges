import java.util.Scanner;
import java.util.Random;

public class WhileLoopChallenges
	{
		public static void main(String[] args)
			{
				
				//challenge one
				
				int i = 5;
				while( i > 0){
					System.out.println(i);
					
					i = i - 1;
					
				}
				
				//challenge two
				
				boolean thierLetterB = true;
				
				do{
					Scanner userInput = new Scanner(System.in);
					System.out.println("Enter your favorite letter");
					String thierLetter = userInput.nextLine();
					
					if(thierLetter.equals("q")){
						thierLetterB = false;
					}
					
				}
				while(thierLetterB);
				
				System.out.println("q is your new favorite letter! \n");
				
				
				// challenge three
				boolean lit = true;
				
				Random rad = new Random();
				
				int randomNumber = rad.nextInt(10) + 1;
				
				do{
					Scanner favLetter = new Scanner(System.in);
					System.out.println("Guess my favorite number!");
					
					int letter = favLetter.nextInt();
					
					
					if(letter == randomNumber){
						lit = false;
					}
					
				}
				while(lit);
				
				System.out.println("\nYou have guessed my favorite number!");
				

			}
	}
