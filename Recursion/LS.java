public class LS {


    public static int LastOccurs(int arr[],int key , int i){
        if(i==0){
            return 0;
        }
        if(arr[i]==key){
            return i;
        }

        return LastOccurs(arr, key, i-1);

    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(LastOccurs(arr, 5, 8));
    }
    
}
