package org.example.Arrays;

public class StringDemo {

    public static void main(String args[]){


//        String

//        Jab Mai New KeyWord ka Use karunga to 1 refrence Heap me Banega Aur Ek SCP me
        String name = "Sumit";
        String n = "Sumit";
        System.out.println(name==n);
        String name1 = new String("Sumit");

//        Refrence Compare Karega
        System.out.println(name==name1);

//        Content Compare Karega
        System.out.println(name.equals(name1));


//        String Buffer

        StringBuffer sb = new StringBuffer("Rahul Mukharjee");
        System.out.println(sb);
        sb.append(" Hello");
        sb.indexOf("H");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.delete(3, 4);
        sb.reverse();
        System.out.println(sb);

//        convert String Buffer to String
        String raj = sb.toString();
        System.out.println(raj);

//        String Builder
        StringBuffer res = new StringBuffer("Helloo Mummy");
        res.append("Yes");
        System.out.println(res);
        res.reverse();
        System.out.println(res);
        res.insert(5,"DJ");
        System.out.println(res);
        res.reverse();
        System.out.println(res);

    }
}
