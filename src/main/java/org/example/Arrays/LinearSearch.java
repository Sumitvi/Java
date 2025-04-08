package org.example.Arrays;

public class LinearSearch {

    public static int llSearch(int[] marks, int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] marks = {1,2,3,5,10,12,15,18};
        int key = 10;
       int index =  llSearch(marks,key);

       if(index==-1){
           System.out.println("Key is not found");
       }else{
           System.out.println("Key at Index "+ index);
       }


//       time complexity of linear Search is -->> O(n)




    }

}
