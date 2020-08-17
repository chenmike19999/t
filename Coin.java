
public enum Coin {
 
    penny("PENNY"), nickel("NICKEL"), dime("DIME"), quarter("QUARTER"); 
    
    private String value;
    
    Coin(String value){
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
    
    public static void main(String[] args){
        Coin coin = Coin.nickel;
        System.out.println(coin.getValue());
    }
}