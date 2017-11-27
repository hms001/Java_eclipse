//Creating 2D 3x3 array

public class Ques7 {
	
	static int n=1;
	
	public static void main (String[] args) {
		
		int board[][] = new int[3][3];
				
		for(int i=0; i < board.length; i++) {	//columns
			for(int j=0; j < board[i].length; j++) {	//rows
				board[i][j]=n;						//insert values
				System.out.print(board[i][j]+"\t");				
				n++;			
			}
			
			System.out.println();
		}
		
	}
	

}
