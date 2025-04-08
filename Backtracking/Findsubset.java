public class Findsubset {

    public static void stringSubSet(String str , String ans , int i){
        // Base Case

        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        // Recursion
        // For Yes
        stringSubSet(str, ans+str.charAt(i), i+1);

        // For No
        stringSubSet(str, ans , i+1);

    }


    public static void main(String args[]){
        String str = "abc";
        stringSubSet(str, "", 0);
    }
    
}
