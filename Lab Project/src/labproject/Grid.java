package labproject;


public class Grid {
	public static  int positionX;
 	public static int positionY;
 	public static final  int gCol = 50;
	public static final int gRow = 50;
	public  char[][] the_Grid =new char[gCol][gRow];
 	
public void clearGrid(){
    	    char d = '.';
			for ( int i = 0; i < gRow; i++)
			{
				for (int j = 0; j < gCol; j++)
				{
					
					the_Grid[i][j] = d;
				}
			}
			
	}
		
		public void displayGrid(){
		
		
	    for ( int j = 0; j < gCol + 1; j++)
		{
			System.out.print('_');
		}
			
	        System.out.println();

		for ( int i = 0; i < gRow; i++)
		{
			
			System.out.println('|');
			
			for ( int j = 0; j < gCol; j++)
			{
				
			System.out.print(the_Grid[i][j]);
				
			}
			
			System.out.println('|');
		}

		for (int j = 0; j < gCol + 1; j++)
			
		{
			System.out.print('_');
		}
		System.out.println('\n');
		
		
	}
		
		
		public void addAnimal(int animal_row_pos, int animal_col_pos, char animal_letter){
			assert(animal_row_pos >= 0);
			assert(animal_row_pos < gRow);
			assert(animal_col_pos >= 0);
			assert(animal_col_pos < gCol);
			the_Grid[animal_row_pos][animal_col_pos] = animal_letter;
	}
		
		
		
		
		static boolean isValidPositionForGrid(int row_pos1, int col_pos1){
			
			return (row_pos1 >= 0) && (col_pos1 >= 0) &&
			       (row_pos1 < gRow) && (col_pos1 < gCol);
			
	}
	

		static boolean isValidRideForGrid( int row_pos1, int col_pos1, 
						     int row_size1, int col_size1){
			
			return (row_pos1 >= 0) && (col_pos1 >= 0) &&
			       (row_size1 >= 0) && (col_size1 >= 0) &&
			       (row_pos1 + row_size1 - 1 < gRow) &&
			       (col_pos1 + col_size1 - 1 < gCol);
	}
		public void setPos(int a , int b, char w)
		{
			
		}
		

}
