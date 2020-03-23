import java.util.Scanner;
public class Board {
	// Declares board of 3 x 3 matrix

	static char gameBoard[][] = new char[3][3];

	static void createBoard(){

		for(int ro = 0; ro < 3; ro++)

			for(int co = 0; co < 3; co++)

				gameBoard[ro][co] = '-';
	}

	static void showBoard() {

		for(int cc = 0; cc < 3; cc++)
		{
			System.out.printf("%2c | %2c | %2c", gameBoard[cc][0], gameBoard[cc][1], gameBoard[cc][2]);

			if(cc != 2)

				System.out.printf("\n---|----|---\n");
		}

		System.out.printf("\n");
	}
}
