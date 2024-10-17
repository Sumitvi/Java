public class Substring {
    
    public static String getSubstr(String str , int si , int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }

        return substr;

    }
    public static void main(String[] args) {
        String str = "Sumit Vishwakarma";
        System.out.println(getSubstr(str, 0, 7));

        // Inbuild Method 
        System.out.println(str.substring(0, 7));
        
    }
}
