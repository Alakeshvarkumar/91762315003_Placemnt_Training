class ex13{
    public static void main(String[] args) {
        int n=4;
        int sp = n+2;
        for(int i=1;i<=n;i++){
            //number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            //number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            sp-=2;
            System.out.println();
        }
    }
}