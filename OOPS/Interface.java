public class Interface {
    public static void main(String[] args) {

        Queen q1 = new Queen();
        q1.moves();

        Rook r1 = new Rook();
        r1.moves();
        
    }
    
}

interface Chess {

    void moves();

}

class Queen implements Chess{
    public void moves(){
        System.out.println("Up , Down , Left , Right");
    }
}

class Rook implements Chess{
    public void moves(){
        System.out.println("Left , Right");
    }
}
