public class Overload {

   public static int Sum(int a , int b){
      int res = (a+b);
      return res;
   }

   public static float Sum(float a , float b){

    float res = (a + b);
    return res;
   }
    public static void main(String[] args) {


        System.out.println(Sum(20, 7));
        System.out.println(Sum(12.4f, 6.2f));
        
    }
    
}
