package com.tictoctoe;


import java.util.Scanner;

public class TicTocToe {

	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char CurrentPlayer = 'X';

	public static void PrintBoard() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			PrintBoard();
			System.out.println("enter the row : ");
			int row = sc.nextInt();
			System.out.println("enter the col : ");
			int col = sc.nextInt();
			if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
				System.out.println("invalid move !!! ");
				System.out.println("select again ");
				continue;
			}
			board[row][col] = CurrentPlayer;
			if (checkwin()) {
				PrintBoard();
				System.out.println(CurrentPlayer + " won the game !!!");
				break;
			}
			if (checkdraw()) {
				PrintBoard();
				System.out.println("draw  match !!!!");
				break;
			}
			CurrentPlayer = CurrentPlayer == 'X' ? 'O' : 'X';

		}
		sc.close();
	}

	public static boolean checkwin() {

		// for rows
		for (int i = 0; i <= 2; i++) {

			if (board[i][0] == CurrentPlayer && board[i][1] == CurrentPlayer && board[i][2] == CurrentPlayer) {
				return true;
			}
		}
		// for columns
		for (int i = 0; i <= 2; i++) {

			if (board[0][i] == CurrentPlayer && board[1][i] == CurrentPlayer && board[2][i] == CurrentPlayer) {
				return true;
			}
		}
		// for diagonals
		if (board[0][0] == CurrentPlayer && board[1][1] == CurrentPlayer && board[2][2] == CurrentPlayer) {
			return true;
		}
		if (board[0][2] == CurrentPlayer && board[1][1] == CurrentPlayer && board[2][0] == CurrentPlayer) {
			return true;
		}
		return false;
	}

	public static boolean checkdraw() {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;

	}
}