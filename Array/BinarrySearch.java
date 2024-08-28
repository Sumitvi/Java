public class BinarrySearch {


    public static int binSearch(int arr[],int start ,int end,int key){

       
       while(start<=end){

        int mid = (start+end)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]<key){
            start = mid+1;
        }else if(arr[mid]>key){
            end = mid-1;
        }

       }


        return -1;
        
    }


    public static void main(String[] args) {

        int arr[] = {2,4,6,8,12,14};
        int key = 14;
        int n = arr.length;


        int index = binSearch(arr, 0, n-1, key);

        if(index==-1){
            System.out.println("NOT FOUND");
        }else{

            System.out.println("THe Element is in index " + index);
        }
        
    }
    
}
