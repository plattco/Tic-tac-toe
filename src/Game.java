import java.util.Scanner;

public class Game extends Board

{

	// To store row, column and diagonal values

	int row, column, diagonal;

	// Function to check winning possibility for computer move
	
	public int getBestMove(String board) {
		return computerMove();
		
	}

	boolean winnableCondition(char mat[][])

	{

		char a, b, c, d, e, f, g, h, i;

		// Stores the symbol at 0 row index and 0 column index position in a

		a = mat[0][0];

		// Stores the symbol at 0 row index and 1 column index position in b

		b = mat[0][1];

		// Stores the symbol at 0 row index and 2 column index position in c

		c = mat[0][2];

		// Stores the symbol at 1 row index and 0 column index position in d

		d = mat[1][0];

		// Stores the symbol at 1 row index and 1 column index position in e

		e = mat[1][1];

		// Stores the symbol at 1 row index and 2 column index position in f

		f = mat[1][2];

		// Stores the symbol at 2 row index and 0 column index position in f

		g = mat[2][0];

		// Stores the symbol at 2 row index and 1 column index position in h

		h = mat[2][1];

		// Stores the symbol at 2 row index and 2 column index position in i

		i = mat[2][2];

		// Computer selection row for move

		// Checks if symbol 'O' is present in 00 and 01 index position and symbol 'X' is not present in 02 index position

		// or symbol 'O' is present in 01 and 02 index position and symbol 'X' is not present in 00 index position

		// or symbol 'O' is present in 01 and 02 index position and symbol 'X' is not present in 01 index position

		if ( (a=='O' && b=='O' && c!='X') || (b=='O' && c=='O' && a!='X') || (a=='O' && c=='O' && b!='X') )

		{

			// Computer selection row for move is one

			row = 1;

			// return true

			return true;

		}// End of if

		if ( (d=='O' && e=='O' && f!='X') || (e=='O' && f=='O' && d!='X') || (d=='O' && f=='O' && e!='X') )

		{

			// Computer selection row for move is two

			row = 2;

			return true;

		}// End of if

		if ( (g=='O' && h=='O' && i!='X') || (h=='O' && i=='O' && g!='X') || (g=='O' && i=='O' && h!='X') )

		{

			// Computer selection row for move is three

			row = 3;

			return true;

		}// End of if

		// Computer selection column for move

		// Checks if symbol 'O' is present in 00 and 10 index position and symbol 'X' is not present in 20 index position

		// or symbol 'O' is present in 10 and 20 index position and symbol 'X' is not present in 00 index position

		// or symbol 'O' is present in 00 and 20 index position and symbol 'X' is not present in 10 index position

		if ( (a=='O' && d=='O' && g!='X') || (d=='O' && g=='O' && a!='X') || (a=='O' && g=='O' && d!='X') )

		{

			// Computer selection column for move is one

			column = 1;

			return true;

		}// End of if

		if ( (b=='O' && e=='O' && h!='X') || (e=='O' && h=='O' && b!='X') || (b=='O' && h=='O' && e!='X') )

		{

			// Computer selection column for move is two

			column = 2;

			return true;

		}// End of if

		if ( (c=='O' && f=='O' && i!='X') || (f=='O' && i=='O' && c!='X') || (c=='O' && i=='O' && f!='X') )

		{

			// Computer selection column for move is three

			column = 3;

			return true;

		}// End of if

		// Computer selection diagonal for move

		if ( (a=='O' && e=='O' && i!='X') || (e=='O' && i=='O' && a!='X') || (a=='O' && i=='O' && e!='X') )

		{

			diagonal = 1;

			return true;

		}// End of if

		if ( (g=='O' && e=='O' && c!='X') || (e=='O' && c=='O' && g!='X') || (g=='O' && c=='O' && e!='X') )

		{

			diagonal = 2;

			return true;

		}// End of if

		return false;

	}// End of function

	// Function to check the empty column for a given row as a parameter

	int emptyColumn(int ro)

	{

		int res = 0;

		// Loops 3 times for each column of given row

		for (int co = 0; co < 3; ++co)

		{

			// Checks if the specified row as parameter and c index position is empty or not

			if (gameBoard[ro][co] == ' ')

				// If null return the row index

				res = co;

		}// End of for loop

		return res;

	}// End of function

	// Function to check the empty row for a given column as a parameter

	int emptyRow(int co)

	{

		int res = 0;

		// Loops 3 times for each row of a given column

		for (int ro = 0; ro < 3; ++ro)

		{

			// Checks if the specified column as parameter c and r index position is empty or not

			if (gameBoard[ro][co] == ' ')

				// If null return the row index

				res = ro;

		}// End of for loop

		return res;

	}// End of function

	// Function to check board values for winning

	boolean vulnerableCondition(char mat[][])

	{

		char a, b, c, d, e, f, g, h, i;

		// Stores the matrix symbol in variables

		a = mat[0][0]; b = mat[0][1]; c = mat[0][2];

		d = mat[1][0]; e = mat[1][1]; f = mat[1][2];

		g = mat[2][0]; h = mat[2][1]; i = mat[2][2];

		// Selects the row number

		if ( (a=='X' && b=='X' && c!='O') || (b=='X' && c=='X' && a!='O') || (a=='X' && c=='X' && b!='O') )

		{

			row = 1;

			return true;

		}// End of if

		if ( (d=='X' && e=='X' && f!='O') || (e=='X' && f=='X' && d!='O') || (d=='X' && f=='X' && e!='O') )

		{

			row = 2;

			return true;

		}// End of if

		if ( (g=='X' && h=='X' && i!='O') || (h=='X' && i=='X' && g!='O') || (g=='X' && i=='X' && h!='O') )

		{

			row = 3;

			return true;

		}// End of if

		if ( (a=='X' && d=='X' && g!='O') || (d=='X' && g=='X' && a!='O') || (a=='X' && g=='X' && d!='O') )

		{

			column = 1;

			return true;

		}// End of if

		if ( (b=='X' && e=='X' && h!='O') || (e=='X' && h=='X' && b!='O') || (b=='X' && h=='X' && e!='O') )

		{

			column = 2;

			return true;

		}// End of if

		if ( (c=='X' && f=='X' && i!='O') || (f=='X' && i=='X' && c!='O') || (c=='X' && i=='X' && f!='O') )

		{

			column = 3;

			return true;

		}// End of if

		if ( (a=='X' && e=='X' && i!='O') || (e=='X' && i=='X' && a!='O') || (a=='X' && i=='X' && e!='O') )

		{

			diagonal = 1;

			return true;

		}// End of if

		if ( (g=='X' && e=='X' && c!='O') || (e=='X' && c=='X' && g!='O') || (g=='X' && c=='X' && e!='O') )

		{

			diagonal = 2;

			return true;

		}// End of if

		return false;

	}// End of function

	// Function for computer two move

	void computerMove()

	{

		char temp;

		char testBoard[][] = new char[3][3], temporaryBoard[][] = new char[3][3];

		// Loops 3 times for row

		for (int rr = 0; rr < 3; ++rr)

			// Loops 3 times for column

			for (int cc = 0; cc < 3; ++cc)

			{

				// Stores the current row and column index position symbol in a test and temporary matrix

				testBoard[rr][cc] = gameBoard[rr][cc];

				temporaryBoard[rr][cc] = gameBoard[rr][cc];

			}// End of for loop

		int ro = 0, co = 0;

		// Loops 3 times for row

		for (ro = 0; ro < 3; ro++)

		{

			// Loops 3 times for column

			for (co = 0; co < 3; co++)

				// Checks if the current index position of the row and column is empty

				if (gameBoard[ro][co] == ' ')

				{

					// Stores the current position symbol in temp

					temp = gameBoard[ro][co];

					// Calls the function to get the position for computer's move

					if (winnableCondition(testBoard))

					{

						// Checks for row value set by the winnableCondition function

						if (row > 0)

						{

							// Decides where to put the 'O' symbol for row

							if (gameBoard[row-1][emptyColumn(row-1)] != 'X')

								gameBoard[row-1][emptyColumn(row-1)] = 'O';

							return;

						}// End of inner if condition

						// Checks for column value set by the winnableCondition function

						if (column > 0)

						{

							// Decides where to put the 'O' symbol for column

							if (gameBoard[emptyRow(column-1)][column-1] != 'X')

								gameBoard[emptyRow(column-1)][column-1] = 'O';

							return;

						}// End of inner if condition

						// Checks the diagonal value set by the winnableCondition function

						if (diagonal == 1)

						{

							if ( gameBoard[0][0] !='X' && gameBoard[1][1] != 'X' && gameBoard[2][2] != 'X')

							{

								gameBoard[0][0] = 'O';

								gameBoard[1][1] = 'O';

								gameBoard[2][2] = 'O';

							}// End of inner if condition

							return;

						}// End of outer if condition

						else

						{

							if (gameBoard[0][2] != 'X' && gameBoard[1][1] != 'X' && gameBoard[2][0] != 'X')

							{

								gameBoard[0][2] = 'O';

								gameBoard[1][1] = 'O';

								gameBoard[2][0] = 'O';

							}// End of inner if condition

							return;

						}// End of else

						//return;

					}// End of inner if condition

					// Stores the symbol in temp in test matrix ro and co index position

					testBoard[ro][co] = temp;

				}// End of outer most if condition

			// Checks the current index position of the board is null

			if (gameBoard[ro][--co]==' ')

			{

				temp = gameBoard[ro][co];

				if (winnableCondition(testBoard))

				{

					if (row > 0)

					{

						if (gameBoard[row-1][emptyColumn(row-1)] != 'X')

							gameBoard[row-1][emptyColumn(row-1)] = 'O';

						return;

					}// End of inner if condition

					if (column > 0)

					{

						if (gameBoard[emptyRow(column-1)][column-1] != 'X')

							gameBoard[emptyRow(column-1)][column-1] = 'O';

						return;

					}// End of inner if condition

					if (diagonal == 1)

					{

						if ( gameBoard[0][0] !='X' && gameBoard[1][1] != 'X' && gameBoard[2][2] != 'X')

						{

							gameBoard[0][0] = 'O';

							gameBoard[1][1] = 'O';

							gameBoard[2][2] = 'O';

						}// End of inner if condition

						return;

					}// End of outer if condition

					else

					{

						if (gameBoard[0][2] != 'X' && gameBoard[1][1] != 'X' && gameBoard[2][0] != 'X')

						{

							gameBoard[0][2] = 'O';

							gameBoard[1][1] = 'O';

							gameBoard[2][0] = 'O';

						}// End of inner if condition

						return;

					}// End of else

					//return;

				}// End of outer if condition

				testBoard[ro][co] = temp;

			}// End of outer most if condition

		}// End of for loop

		// Loops 3 times for row

		for (ro = 0; ro < 3; ro++)

		{

			// Loops 3 times for column

			for (co = 0; co < 3; co++)

				if (gameBoard[ro][co]==' ')

				{

					temp = gameBoard[ro][co];

					testBoard[ro][co] = 'O';

					if (!vulnerableCondition(testBoard))

						break;

					testBoard[ro][co] = temp;

				}// End of if condition

			// Checks if the column value is 3 then subtract one

			if(co == 3)

				co--;

			// Checks if the current index position of the matrix is null

			if (gameBoard[ro][co]==' ')

			{

				temp = gameBoard[ro][co];

				testBoard[ro][co] = 'O';

				if (!vulnerableCondition(testBoard))

					break;

				testBoard[ro][co] = temp;

			}// End of if condition

		}// End of for loop

		// Checks if the column is greater than zero

		if (column > 0)

		{

			// Decides where to put the 'O' symbol for column

			if (gameBoard[emptyRow(column-1)][column-1] !='X')

				gameBoard[emptyRow(column-1)][column-1] = 'O';

			return;

		}// End of for loop

		if (row > 0)

		{

			if (gameBoard[row-1][emptyColumn(row-1)] !='X')

				gameBoard[row-1][emptyColumn(row-1)] = 'O';

			return;

		}// End of for loop

		// Checks if diagonal is one for left diagonal

		if (diagonal == 1 )

		{

			// Checks if the left diagonal symbol is not 'X' then set it to 'O'

			if (gameBoard[0][0] != 'X')

				gameBoard[0][0] = 'O';

			if (gameBoard[1][1] != 'X')

				gameBoard[1][1] = 'O';

			if (gameBoard[2][2] != 'X')

				gameBoard[2][2] = 'O';

			return;

		}// End of for loop

		// Checks if diagonal is two for right diagonal

		if (diagonal == 2 )

		{

			// Checks if the right diagonal symbol is not 'X' then set it to 'O'

			if (gameBoard[0][2] != 'X')

				gameBoard[0][2] = 'O';

			if (gameBoard[1][1] != 'X')

				gameBoard[1][1] = 'O';

			if (gameBoard[2][0] != 'X')

				gameBoard[2][0] = 'O';

			return;

		}// End of if condition

		// Checks if the row is 3 then subtract one

		if(ro == 3)

			ro--;

		if (gameBoard[ro][co] != 'X')

			gameBoard[ro][co] = 'O';

	}// End of function

	// Function to identifying winner

	char check()

	{

		// Check rows

		for(int ro = 0; ro < 3; ro++)

			if(gameBoard[ro][0] == gameBoard[ro][1] && gameBoard[ro][0] == gameBoard[ro][2])

				return gameBoard[ro][0];

		// Check columns

		for(int ro = 0; ro < 3; ro++)

			if(gameBoard[0][ro] == gameBoard[1][ro] && gameBoard[0][ro] == gameBoard[2][ro])

				return gameBoard[0][ro];

		// Check left diagonals

		if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2])

			return gameBoard[0][0];

		// Check right diagonals

		if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0])

			return gameBoard[0][2];

		return ' ';

	}// End of function

	// Function to return if still some vacant places are there in the board to move

	boolean finished(char Board[][])

	{

		// Loops 3 times for row

		for (int ro = 0; ro < 3; ++ro)

		{

			// Loops 3 times for column

			for (int co = 0; co < 3; ++co)

			{

				// Checks if the current row and column index contains null value then return true

				if (Board[ro][co] == ' ')

					return false;

			}// End of inner for loop

		}// End of outer for loop

		// Otherwise return true for game to continue

		return true;

	}// End of function

	// Reset the row, column and diagonal values for next game

	void reset()

	{

		row = 0;

		column = 0;

		diagonal = 0;

	}// End of function

	// Returns if valid position otherwise returns false

	boolean validMove(int row, int col)

	{

		// Initial status is false

		boolean status = false;

		// Checks if row is between 0 - 2 and column is between 0 - 2

		if((row >= 0 && row <= 2) && (col >= 0 && col <= 2))

		{

			// Checks if the current row and column index position of the board is not empty

			if (gameBoard[row][col] == ' ')

				// Set the status to true for valid position

				status = true;

		}// End of if condition

		// Otherwise set the status to false for invalid move

		else

			status = false;

		// Returns the status

		return status;

	}// End of function

	// Function for players move

	void playerMove()

	{

		// Creates an object of the Scanner class

		Scanner sc = new Scanner(System.in);

		int rr = 0, cc = 0;

		// Loops till valid index position entered by the user

		do

		{

			// Accepts row and column number for player

			System.out.print("\n Enter the row and column index position: ");

			rr = sc.nextInt();

			cc = sc.nextInt();

			// Calls the function to check valid position

			// If valid come out of the loop

			if(validMove(rr, cc))

				break;

			// Otherwise display error message and continue

			else

				System.out.print("\n Invalid move! Try again.");

		}while(true);// End of do - while loop

		// Assigns the symbol at rr and cc index position of the board

		gameBoard[rr][cc] = 'X';
	}
}