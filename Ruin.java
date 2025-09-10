
public class Ruin { 
    
    public static void main(String[] args){
        double startAmount = 10;
        double winChance = 0.4;
        double winLimit = 13;
        
        while (startAmount > 0 && startAmount < winLimit) {
            if (winChance > Math.random()) {
                startAmount++;
                System.out.println("You won a dollar! Total = " + startAmount);
                if (startAmount == 13) {
                    System.out.println("It's your lucky day, you hit your win limit");
                }                
            } else {
                startAmount--;
                System.out.println("You lost a dollar! Total = " + startAmount);
                if (startAmount == 0) {
                    System.out.println("Go home you cause you're broke now");
                }
            }
        }

}
    
}
