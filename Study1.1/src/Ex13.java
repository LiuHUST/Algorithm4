
public class Ex13 {

	public static void main(String[] args) {
		// 转置一个二维矩阵
		int[][] nums = new int[3][3];
		for(int i = 0 ; i < nums.length; i++){
			for(int j = 0; j<nums[0].length; j++){
				nums[i][j] = i +2*j;
			}
		}
		matrix2Print(nums);
		matrix2Print(trans2Matrix(nums));

		
	}
	public static int[][] trans2Matrix(int[][] a){
		int m = a.length ;
		int n = a[0].length;
		int[][] trans = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m ; j++){
				trans[i][j] = a[j][i];
			}
		}
		return trans;
		
	}
	public static void matrix2Print(int nums[][]){
		
		for(int i = 0 ; i < nums.length; i++){
			for(int j = 0; j<nums[0].length; j++){
				System.out.print(nums[i][j]+" ");
			}
			System.out.println("");
		}

		
	}

	public static void matrix2Print(double nums[][]){

		for(int i = 0 ; i < nums.length; i++){
			for(int j = 0; j<nums[0].length; j++){
				System.out.print(nums[i][j]+" ");
			}
			System.out.println("");
		}


	}

}
