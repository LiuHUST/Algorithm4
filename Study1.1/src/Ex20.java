public class Ex20 {
    public static void main(String[] args){
        double b =logNjie(4);
        System.out.println(b);

    }
    // 计算ln(N!)的值
    public static double logNjie(int N){
        if (N == 1) return Math.log(1);
        return logNjie(N-1)+Math.log(N);

    }
}
