public class Ex22 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,11,13};
        int b = rank(4,a);
        System.out.println("元素所处位置: "+b);

    }
    //折半查找算法，并且查找的过程中，打印出深度，lo和hi的值
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length,1);

    }
    public static int rank(int key,int[] a, int lo,int hi,int depth ){

        System.out.println("depth: "+depth);
        System.out.println("lo: "+lo+" ----- hi: "+hi);

        if(lo > hi) return -1;
        int mid  = lo + (hi - lo) / 2;
        if (key > a[mid]) return rank(key, a, mid + 1, hi, ++depth);
        else if (key < a[mid]) return rank(key,a,lo,mid-1, ++depth);
        else return mid;
    }
}
