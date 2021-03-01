//Evan White
import java.util.Scanner;
import java.util.Random;
public class BinarySearchMagicNumberEW {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		int magic = num.nextInt(50) + 1;
		int counter = 0;
		int guess = -1;
  do {
	  System.out.println("Enter an integer between 1 - 50 : ");
	  
	  guess = input.nextInt();
	   
	 if(guess > magic)
	  System.out.println("Your Number was too High!");
	 
	 if(guess < magic)
	  System.out.println("Your Number was too Low!");
	 
	 if(guess == magic)
	  System.out.println("Your Number was Correct!");
	 
	 counter++;
	 
  }while(magic != guess);
		System.out.println("You had " + counter + " attempts!");
		
	}

}

/*
Enter an integer between 1 - 50 : 
30
Your Number was too High!
Enter an integer between 1 - 50 : 
15
Your Number was too High!
Enter an integer between 1 - 50 : 
7
Your Number was too High!
Enter an integer between 1 - 50 : 
3
Your Number was too Low!
Enter an integer between 1 - 50 : 
5
Your Number was Correct!
You had 5 attempts!
*/
