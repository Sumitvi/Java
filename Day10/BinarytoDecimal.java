public class BinarytoDecimal {

    public static void binToDec(int binnum) {
        int pow = 0;
        int dec = 0;

        while (binnum > 0) {
            int lastDigit = binnum % 10;
            dec = dec + (lastDigit * (int) Mathfunc.pow(2, pow));
            pow++;
            binnum = binnum / 10;
        }

        System.out.println("Decimal Number of " + binnum +" is " + dec);
    }


   

    public static void main(String[] args) {

        binToDec(101);

    }

}
