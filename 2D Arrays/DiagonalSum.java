public class DiagonalSum {


    public static int SumofDiagonal(int arr[][]){
        int sum =0;
        int n= arr.length;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }else if(i+j==n-1){
        //             sum+=arr[i][j];

        //         }
        //     }

        // }


        // Optimize Code

        for(int i=0;i<n;i++){

            // primary diagonal
            sum+=arr[i][i];

            if(i!=n-1-i){
                sum+=arr[i][n-1-i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(SumofDiagonal(arr));

    }

}
