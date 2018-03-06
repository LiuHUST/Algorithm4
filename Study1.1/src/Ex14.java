
public class Ex14 {

	public static void main(String[] args) {
		// 输出一个不大于log2N的整数
		System.out.println(lg(67));
		
	}
	public static int lg(int N)
	{
		int i = 1;
		int k = 0;
		while(i <= N)
		{
			i = 2*i;
			k++;
		}
		return k-1;

	}

}
