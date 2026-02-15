public class ex10{
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            int val = (i%2==0) ? 0 : 1;
            for(int j=0;j<i;j++){
                System.out.print(val + " ");
                val=1-val;
            }
            System.out.println();
        }
    }
}