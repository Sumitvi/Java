public class arraywithFunc {


    public static void UpdatedMarks(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]){
        int marks[] = {23,45,28,4,2};



        UpdatedMarks(marks);
        
        System.out.println("Updated Marks is " );

        for(int i =0;i<marks.length;i++){
            System.out.println("Marks is " + marks[i]);

        }
       

        
    }
    
}
