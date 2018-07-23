public class MultiArr {
    public static void main(String args[]){
        int twoDimensionalArr[][] = new int[4][5];
        int i,j,k = 0;
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                twoDimensionalArr[i][j] = k;
                k++;
            }

        }
         for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.println(twoDimensionalArr[i][j]+" ");

            }
            System.out.println();
        }

    }

}
