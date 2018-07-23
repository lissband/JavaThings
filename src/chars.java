public class chars {
    public static void main(String args[]){
        double nums[] = {11.1,22.2,12.3,14.4,15.5};
        double result = 0;
        int i;
        for(i = 0;i<5;i++){
            result = result+nums[i];

        }
        System.out.println("Average is"+result / 5 );

    }
}
