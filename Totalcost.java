import java.util.*;

public class Totalcost {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rate of pen pensil and eraser");
        float Pen = sc.nextFloat();
        float Pensil = sc.nextFloat();
        float Eraser = sc.nextFloat();

        float sum = (Pen + Pensil + Eraser);
        System.out.println("Total Payble Amount" + " "+ sum);

        float gstAmt = (Pen + Pensil + Eraser)*0.18f;
        System.out.println("18% GST Amount"+ " "+ gstAmt);

        float total = sum + gstAmt;
        System.out.println("Total Payble Amout after GST " + " " + total);

        sc.close();

        
    
    }
    
}
