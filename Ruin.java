
public class Ruin { 
    
    public static void main(String[] args){
        double startAmount = 10;
        double winChance = 0.49;
        double winLimit = 15;
        double bank = 500;
        for (int index = 1; index <= 20; index++) {
            startAmount = 10;
            while (startAmount > 0 && startAmount < winLimit) {
                if (winChance > Math.random()) {
                    startAmount++;    
                    if (startAmount == winLimit) {
                        bank = bank + 5;
                    }
                } else {
                    startAmount--;
                    if (startAmount == 0) {
                        bank = bank - 10;
                    }
                    }
                }
                 System.out.println("After day " + index + ", your bank total is " + bank);
            }
        }

}
