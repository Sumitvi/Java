public class DectoBin {

    public static void binaryConvert(int decNum){
        int originalNum = decNum;
        int bin =0;
        int pow =0;
        while(decNum>0){
            
            int rem = decNum%2;
            bin = bin + (rem* (int)Mathfunc.pow(10,pow));
            pow++;

            decNum = decNum/2;
        }

        // System.out.println("binary of " + decNum + "=", bin);
        System.out.println( originalNum+" binary is " + bin);
    }

    public static void main(String[] args) {


        binaryConvert(5);
        
        
    }
    
}
