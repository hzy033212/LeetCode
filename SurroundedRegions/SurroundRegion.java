import java.util.*;

public class SurroundRegion{

	public static void enqueue(int x, int y, int row, int col, char[][] board, Queue<Integer> queue){
		if(x >= 0 && y >= 0 && x < row && y < col && board[x][y] == 'O'){
			queue.offer(x*col + y);
		}
	}

	public static void main(String args[]){
	
		//Test Case
		char[][] board = {{'O','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		int row = board.length;
		int col = board[0].length;
		for(int i = 0; i < row; i++ ){
			for(int j = 0; j < col; j++ ){
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		//Main Algorithm
		if(board == null || row == 0 || col == 0){
			System.out.println("Null board!");
		}
		Queue<Integer> alive = new LinkedList<Integer>();
		
		for(int i = 0; i < row; i++){
			enqueue(i, 0, row, col, board, alive);
			enqueue(i, col-1, row, col, board, alive);
		}
		for(int j = 1; j < col-1; j++){
			enqueue(0, j, row, col, board, alive);
			enqueue(row-1, j, row, col, board, alive);
		}
		
		int cur = 0;
		while(!alive.isEmpty()){
			cur = alive.poll();
			int x = cur/col;
			int y = cur%col;
			
			if(board[x][y] == 'O'){
				board[x][y] = 'A';
			}
			
			enqueue(x-1, y, row, col, board, alive);
			enqueue(x, y-1, row, col, board, alive);
			enqueue(x+1, y, row, col, board, alive);
			enqueue(x, y+1, row, col, board, alive);
		}
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(board[i][j] == 'A'){
					board[i][j] = 'O';
				}else{
					board[i][j] = 'X';
				}
			}
		}
		
		
		//Dispaly Result
		for(int i = 0; i < row; i++ ){
			for(int j = 0; j < col; j++ ){
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
	}
}