public class Stock {

    public static int Maxprofit(int stocks[]){

       int buyprice = Integer.MAX_VALUE;
       int Maxprofit = 0;

       for(int i=0;i<stocks.length;i++){
        if(buyprice<stocks[i]){
            int profit = stocks[i] - buyprice;
            Maxprofit = Math.max(Maxprofit, profit);
        }else{
            buyprice = stocks[i];
        }
       }


       return Maxprofit;

       
    }

    public static void main(String[] args) {

        int stocks [] = {7,1,5,3,6,4};

        int Value = Maxprofit(stocks);
        System.out.println(Value);
        
    }
    
}
