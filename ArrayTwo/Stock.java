public class Stock {

    public static int Maxprofit(int stocks[]){

        int MaxProfit = 0;

        for(int i =0;i<stocks.length;i++){
            MaxProfit = stocks[i+1]-stocks[i];
        }

        if(MaxProfit>0){
            return MaxProfit;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {

        int stocks [] = {7,1,5,3,6,4};

        int Value = Maxprofit(stocks);
        System.out.println(Value);
        
    }
    
}
