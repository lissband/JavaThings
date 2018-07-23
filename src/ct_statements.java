public class ct_statements {
    public static void main(String args[]){
        // || ====> This is or
        // && ====> This is and
        for(int i=0;i < 7 ; i++){
            switch(i){
                case 0:
                case 1:
                case 2:
                    System.out.println("i equals to 0,1 or 2");
                    break;

                case 3:
                case 4:
                case 5:
                    System.out.println("i equals to 3,4 or 5");
                    break;
                default:
                    System.out.println("you will never see that.");
            }
        }
    }
}
