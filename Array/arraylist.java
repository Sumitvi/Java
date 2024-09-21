import java.util.*;

public class arraylist {


  public static void main(String args[]){

    // Creating ArrayList
      ArrayList<Integer> list = new ArrayList<Integer>();

    //   Adding a new Value in ArrayList

    list.add(0);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list);


    // get in arraylist

    int el = list.get(2);
    System.out.println(el);


    // adding elements between 0 and 1

    list.add(1,1);
    System.out.println(list);


    // modify element

    list.set(4,5);
    System.out.println(list);


    // delete element 
    list.remove(4);
    list.remove(1);
    System.out.println(list);


    // Size of arraylist
    int size = list.size();
    System.out.println(size);


    // itrating the arraylist

    for(int i=0;i<list.size();i++){
        // System.out.println(list.get(i));
    }
   

  }
    
}
