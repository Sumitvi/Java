public class Equals {

    public static void main(String[] args) {
        String s1 = "Sumit";
        String s2 = "Sumit";
        String s3 = new String("Sumit");

        String name = s1.substring(0,4);
        System.out.println(name);

        if(s1==s2){
            System.out.println("both are same");
        }else{
            System.out.println("Both Are Not Same");
        }


        // if(s1==s3){
        //     System.out.println("both are same");
        // }else{
        //     System.out.println("Both Are Not Same");
        // }


        if(s1.equals(s3)){
            System.out.println("both are same");   
        }else{
            System.out.println("Both Are Not Same");

        }
    }
    
}
