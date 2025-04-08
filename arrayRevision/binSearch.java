public class binSearch {


    public static int BinarySearch(int numbers[],int key){
        int start=0, end = numbers.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }else if(numbers[mid]<key){
                start = mid+1;
            }else if(numbers[mid]>key){
                end = mid-1;
            }


            
        }

        return -1;

    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,18};
        int key = 10; 

        int index = BinarySearch(numbers, key);
        if(index==-1){
            System.out.println("Number Not Found");
        }else{
            System.out.println("Number is at index " + index);
        }

    }
    
}
