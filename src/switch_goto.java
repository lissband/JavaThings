public class switch_goto {
    public static void main(String[] args){
        boolean t = true;

        first:{
        second:{
            third:{
                System.out.println("Before the time passes.");
                if(t) break second;
                System.out.println("Chuw chuw mothefucker.");

            }
        }
        System.out.println("This will be executed.");
        }
    }

}
