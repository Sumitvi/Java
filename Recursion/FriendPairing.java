public class FriendPairing {

    public static int Friendpair(int n){
        if(n==1 || n==2){
            return n;
        }

        int fnm1 = Friendpair(n-1);

        int fnm2 = Friendpair(n-2);
        int pairways = (n-1)*fnm2;

        int totalWays = fnm1 + pairways;

        return totalWays;
    }

    public static void main(String[] args) {
       System.out.println(Friendpair(3));
        
    }
    
}
