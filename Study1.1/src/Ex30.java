public class Ex30 {
    public static void main(String[] args) {
        boolean[][] a = new boolean[5][5];

        for (int i = 0; i<a.length; i++){
            for (int j = 0;j<a[0].length;j++)
            {
                if (euclid(i,j)==1)
                    a[i][j] = true;
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static int euclid(int p, int q) {
        if (p == 0||q ==0)
            return 0;
        if (p % q == 0) return q;
        else return euclid(q, p % q);

    }
}
