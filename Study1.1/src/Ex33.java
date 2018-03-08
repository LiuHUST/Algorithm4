public class Ex33 {
    public static void main(String[] args){
        double[] x = {1,3,4};
        double[] y = { 1.5,2,4.5};
        double[][] a = {{1,3,5},{9,5,3}};
        double[][] b = {{1,3,5},{9,5,3},{1,2,4}};
        //double[][] result1 = Matric.transpose(a);
        //double dd = Matric.dot(x,y);
        double[] ddd = Matric.mult(x,b);
        double[] dd2 = Matric.mult(b,x);
        Matric.szPrint(ddd);
        Matric.szPrint(dd2);
       // Ex13.matrix2Print(a);
       // Ex13.matrix2Print(result1);
       // System.out.println(result1);

    }
}
class Matric{
    public static double dot(double[] x,double[] y){
        double result = 0;
        for (int i = 0;i < x.length;i++){
            result = x[i]*y[i] + result;
        }
        return result;

    }
    public static double[][] mult(double[][] x,double[][] y){
        int m = x .length;
        int mm = x[0].length;
        int n = y[0].length;
        double[][] result = new double[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n;j++){
                for (int k = 0;k < mm;k++){
                    result[i][j] += x[i][k]*y[j][k];
                }

            }
        }
        return result;

    }
    public  static double[][] transpose(double[][] a){
        int m = a.length ;
        int n = a[0].length;
        double[][] trans = new double[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                trans[i][j] = a[j][i];
            }
        }
        return trans;
    }


    public static double[] mult(double[][] a,double[] x){
    int n = a.length;
    double[] result = new double[n];
    for (int i = 0;i < n;i++){
        for(int j = 0; j < a[0].length;j++){
            result[i] += a[j][i]*x[j];
        }

    }
    return result;
    }
    public static double[] mult(double[] y,double[][] a){

        int n = a[0].length;
        double[] result = new double[n];
        for (int i = 0;i < n;i++){
            for(int j = 0; j < a.length;j++){
                result[i] += a[j][i] * y[j];
            }

        }
        return result;
    }
    public static void szPrint(double[] x){
        for (int i = 0;i < x.length;i++)
            System.out.print(x[i]+" ");

    }
    }


