import java.util.Scanner;

public class MinNum {
    
     public static int LargestNum(int Matrix[][]){
        int minimum = Integer.MAX_VALUE;

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                if(minimum>Matrix[i][j]){
                    minimum = Matrix[i][j];
                }
            }
        }

        return minimum;
    }

     public static void main(String args[]){

        int Matrix[][]= new int[3][3];
        int n =Matrix.length , m=Matrix[0].length;
       

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Is");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();

        }

        int large = LargestNum(Matrix);
        System.out.println("Min Number is " + large);
        

    }
}
