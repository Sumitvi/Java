package org.example.Arrays;

public class ArrayasFuncArgs {

    public static void updateArray(int marks[]){

        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+ 1;
        }

    }

    public static void main(String[] args) {
        int marks[] = {34 , 44 , 54};
        updateArray(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }


    }
}
