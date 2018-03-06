
public class Ex15 {
    public static void main(String[] args){
        int[] a = {1,2,4,0,1,3,2};
        int[] b = histogram(a,5);
        for (int i = 0;i<b.length;i++)
        System.out.println(b[i]);
    }
    // 接受一个整形数组a，和一个整数M
    // 返回一个数组，数组中的第i个元素的值为i在数组a中出现的次数

    public static int[] histogram(int[] a,int M){
        int[] result = new int[M];
        for (int i = 0;i < a.length;i++) {
            result[a[i]]++;
        }
        return result;
    }

}
