public class BubbleSort {

    public static void bblSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }


    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }
    public static void main(String args[]){

        int arr[] = {5,4,2,3,1};
        bblSort(arr);
        PrintArr(arr);
        

    }
    
}