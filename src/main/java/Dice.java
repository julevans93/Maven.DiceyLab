public class Dice {
//
//    Integer numOfDice;
//
//    public Dice(Integer numOfDice) {
//        this.numOfDice = numOfDice;
//    }
    public Dice (){

    }

    public static Integer dieToss(){

        return (int) (Math.random() * ((6 -1) +1)) +1;

    }

//    public Integer tossAndSum() {
//        int diceResult = 0;
//        for (int i = 1; i <= numOfDice; i++){
//            diceResult += dieToss();
//        }
//        return diceResult;
//    }

}



