public class HollowRact{

    public static void hollow_ractangle(int totrows, int totcols){

        // outer loop
        for(int i=1;i<=totrows;i++){
            // Inner loop

            for(int j=1;j<=totcols;j++){
                if(i==1|| i == totrows || j==1 || j==totcols){
                    System.out.print("*");
                }else{

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]){


        hollow_ractangle(10,5);
       

    }
}