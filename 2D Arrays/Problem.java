public class Problem {



    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;


        

        while(startCol<=endCol && startRow<=endRow){

            // Top
            for(int j=startCol;j<=endCol;j++){
                System.out.println(matrix[startRow][j] + " ");
            
            }

            // Right

            for(int i=startRow+1;i<=endRow;i++){
                System.out.println(matrix[i][endCol]);
            }

            // bottom 

            for(int i=endCol-1;i<=startCol;i--){
                System.out.println(matrix[endRow][i]);

            }

                // left

                for(int j=endRow-1;j>=startRow+1;j--){
                    System.out.println(matrix[startCol][j]+"");
                }

                startRow++;
                endRow++;
                startCol--;
                endCol--;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

                printSpiral(matrix);
    }

}
