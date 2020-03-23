import java.util.Scanner;

public class GameInteraction extends Board{
	// main function definition

	public static void main(String ss[])

	{

		char done; char c;

		// Assigns true to continue

		boolean CONTINUE = true;

		// Creates an object of the class TicTacToe3x3

		Game tt = new Game();

		Scanner sc = new Scanner(System.in);

		// Loops till CONTINUE value is true

		while (CONTINUE)

		{

			System.out.printf("Computer vs. Human Tic Tac Toe. \n");

			System.out.printf("Computer will be playing against the Human as 'O' \n");

			done = ' ';

			// Calls the function to create board for playing

			createBoard();

			// Loops till user choice to continue

			do

			{

				// Calls the function to display the board

				showBoard();

				System.out.printf("\n");

				// Calls the function for player move

				tt.playerMove();

				// Calls the function to check winner

				done = tt.check();

				// Checks if winner found

				if(done != ' ')

					break;

				// Calls the function for Computer Two move

				tt.computerMove();

				// Calls the function to check winner

				done = tt.check();

				// Checks if winner found

				if(done!= ' ')

					break;

				// Calls the function to check the board whether there is any vacant space is available or not to move

				if (tt.finished(gameBoard))

				{

					// Calls the function to display current status of the board

					showBoard();

					System.out.printf("\n");

					if(done != 'X' && done != 'O')

						System.out.printf("Game Draw\n");

					break;

				}// End of if condition

				// Reset the board for next game

				tt.reset();

			} while(done == ' ');

			// Checks if done value is 'X' Computer one won

			if(done=='X')

				System.out.printf("Player Won!\n");

			// Otherwise Computer two won the game

			else if(done == 'O')

				System.out.printf("Computer Won \n");

			// Calls the function to display final board values

			showBoard();

			// Accepts user choice to whether continue or not

			System.out.printf("Play again? Y/N \n");

			c = sc.next().charAt(0);

			// If user choice is 'N or 'n'

			if ( c=='N' || c=='n')

				// Set the CONTINUE to false to stop the game

				CONTINUE = false;

			// Calls the function to reset the board for next game

			tt.reset();

		}// End of while loop

		sc.close();
	}
}
