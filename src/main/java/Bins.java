import java.util.ArrayList;

public class Bins extends ArrayList {
    int [] bin;
//    Dice dice = new Dice();

//    public Bins (Integer tossAndSum){
//        for (int i = 0; i <= dice.tossAndSum(); i++){
//            bin[i] = tossAndSum;
//        }
//    }
    public Bins(Integer numOfDice){
        createBinWithDice(numOfDice);
    }

    private void createBinWithDice(Integer numOfDice) {
        bin = new int [(numOfDice * 6) +1];
    }

    public int[] getBin(){
        return bin;
    }

//    public Integer incrementBin(Integer numToCheck){
//        Integer counter = 0;
//        for (int i = 0; i < dice.tossAndSum(); i++){
//            if ( bin[i] == numToCheck);
//            counter++;
//        }
//        return counter;
//    }
}
