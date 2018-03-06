public class Ex05 {
    public static void main(String[] args) {
       System.out.println(Ranging01(0.5,0.2));

    }
    //如果x,y都在0到1范围内输出true，否则输出false
    public static boolean Ranging01(double x,double y){
        if( (x > 0 && x < 1) && (y > 0 && y < 1))
            return true;
        else return false;
    }
}
