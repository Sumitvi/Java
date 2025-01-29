import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

 

public class ArrList{


    public static void swap(ArrayList<Integer> list , int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);


    }
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        list1.add("Sumit");   //O(1)
        list1.add("Vishwakarma");
        list1.add("Rahul");
        list1.add("Rohit");

        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        System.out.println(list1);



        // Adding Element 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // // Getting Element
        // int res = list.get(3);  //O(1)
        // System.out.println(res);

        // // Remove Element
        // int res1 = list.remove(2); //O(n)
        // System.out.println(res1);
        // System.out.println(list);


        // // Set Operation

        // int val = list.set(2, 10);  //O(n)
        // System.out.println(val);
        // System.out.println(list);

        // System.out.println(list.contains(10));   //O(n)
        // System.out.println(list.contains(0));

        // System.out.println("<<<-------------Size of ArrayList--------->>>");
        // System.out.println(list.size());
        // System.out.println(list1.size());


        // // int start = 0 ;
        // // int end = list.size()-1;

        // // while(start<end){
        // //     int temp = list.get(start);
        // //     list.get(start) = list.get(end);
        // //     list.get(end) = temp;
        // // }


        // for(int i=list.size()-1; i>=0;i--){
        //     System.out.print(list.get(i) + " ");
        // }
        //     //  dry run
        //     // i=3  arr[3] = 5
        //     // i=2 arr[2] = 10
        //     // i=3 arr[3] = 2;
        //     // i=4 arr[4] = 1;


            System.out.println(list);


            int max = Integer.MIN_VALUE;

            for(int i=0;i<list.size();i++){
                if(max<list.get(i)){
                    max = list.get(i);
                }
            }

            System.out.println("Maximum Value is " + max);

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(2);
            arr.add(3);
            arr.add(5);
            arr.add(9);
            arr.add(6);


            int idx1 = 1; 
            int idx2 = 3;

            System.out.println(arr);
            swap(arr, idx1, idx2);
            System.out.println(arr);
            Collections.sort(arr);

            System.out.println(arr);
            Collections.sort(arr , Collections.reverseOrder());
            System.out.println(arr);

           
    }
}