package org.example.pattern;

public class Half {

    public static void main(String[] args) {

//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
        pattern4(5);

    }


    public static void pattern4(int n){
        for(int row = 1; row<=n; row++){
            for (int col = 1; col <=row; col++) {
                System.out.print(col + " ");

            }
            System.out.println();
        }
    }


    public static void pattern3(int n){

        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void pattern1(int n){

        for(int row = 1;row<=n;row++){
            for(int col = 1; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();

        }




    }
}

