import java.util.Scanner;

public class Strings{


    public static void PrintStr(String str ){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String args[]){

        // Initializing Strings
        char arr[]={'a','b','c','d'};
        String str = "abcd";
        String str1 = new String("xyz");
        // System.out.println(arr + " " + str + " " + str1);


        // taking Input And Output from String

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println(name.length());

        // String fullname = "Sumit Vishwakarma";
        // System.out.println(fullname.length());


        // Concatinatioon in Java

        String Name = "Sumit";
        String Surname = "Vishwakarma";
        String fullName = Name + " " + Surname;
        // System.out.println(fullName.charAt(4));
        PrintStr(fullName);

    }
}