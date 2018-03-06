public class Ex11 {
    public static void main(String[] args){
        boolean[][] a = {{true,true,true},{true,true,false},{true,true,false}};
       String syb ;
        for(int i = 0;i < a.length;i++){
            for (int j = 0;j < a[0].length;j++){
                if(a[i][j])
                    syb = "*";
                else syb = " ";
                System.out.print(syb+"H"+i+"L"+j);
            }
            System.out.println("");
        }

    }
}
