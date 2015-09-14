public class SetMatrixZeroes{
	public static void main(String args[]){
		//Test set
		int[][] matrix = new int[2][3];
		matrix[0][0] = 1;
		matrix[0][1] = 1;
		matrix[0][2] = 1;
		matrix[1][1] = 0;
		matrix[1][0] = 1;
		matrix[1][2] = 1;
		
		//Main algorithm
		int[] flagRow = new int[matrix.length];
		int[] flagCol = new int[matrix[0].length];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					flagRow[i] = 1;
					flagCol[j] = 1;
				}
			}
		}
		for(int i = 0; i < matrix.length; i++){
			if(flagRow[i] == 1){
				for(int j = 0; j < matrix[0].length; j++){
					matrix[i][j] = 0;
				}
			}
		}
		for(int i = 0; i < matrix[0].length; i++){
			if(flagCol[i] == 1){
				for(int j = 0; j < matrix.length; j++){
					matrix[j][i] = 0;
				}
			}
		}
		
		//Output result
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}