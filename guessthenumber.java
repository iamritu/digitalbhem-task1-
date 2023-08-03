import java.util.*;

  public class guessthenumber{

	
	public static void guessingNumberGame()
	{
		
		Scanner sc = new Scanner(System.in);

		
		int number = 1 + (int)(100* Math.random());

	
		int K = 6;

		int i, guess;

		System.out.println(
			"Welcome! You can choose the number betwween 1to 100....");

	
		for (i = 0; i < K; i++) {

			System.out.println(
				"Guess the number:");

			
			guess = sc.nextInt();

			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println(
				"You have completed your K trials");

			System.out.println(
				"The number was " + number);
		}
	}

	
	public static void
	main(String arg[])
	{

		
		guessingNumberGame();
	}
}
