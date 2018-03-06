
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
		trans2Matrix(nums);
		matrix2Print(nums);

		
	}
	public static void trans2Matrix(int[][] a){
		int temp = a[0][0];
		for(int i = 1; i < a.length; i++){
			for(int j = 0; j<a[0].length; j++){
				temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		
	}
	public static void matrix2Print(int nums[][]){
		
		for(int i = 0 ; i < nums.length; i++){
			for(int j = 0; j<nums[0].length; j++){
				System.out.print(nums[i][j]);
			}
			System.out.println("");
		}

		
	}

}
