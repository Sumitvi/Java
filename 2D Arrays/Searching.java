import java.util.Scanner;

public class Searching {

    public static boolean Search(int Matrix[][] , int key){

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                if(Matrix[i][j]==key){
                    System.out.println("Key Found at index " +  i+" "+j );
                    return true;

                }
            }

        }

        return false;

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

         Search(Matrix,5);

    }
    
    
    
}
