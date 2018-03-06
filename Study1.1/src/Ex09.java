public class Ex09 {
    public static void main(String[] args){
        System.out.println(myToBinaryString(8));

    }
    public static String myToBinaryString(int N){
        String s = "";
        for (int n = N; n > 0; n = n/2)
            s = (n % 2 )+ s;
        return s;
    }
}
