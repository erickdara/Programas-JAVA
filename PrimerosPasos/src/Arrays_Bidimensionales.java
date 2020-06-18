
public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix= {
				{10,15,23,45,56},
				{43,21,23,65,89},
				{55,66,33,22,11},
				{74,36,24,23,35}
		};
		
		for(int[]fila:matrix) {
			
			System.out.println();
			
			for(int z:fila) {
				
				System.out.print(z + " ");
			}
		}

	}

}
