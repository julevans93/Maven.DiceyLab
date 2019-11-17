import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    //Dice dice = new Dice(2);
    //Bins bin;
    Integer numberOfDice;
    static Integer numberOfTosses;

//    public Simulation() {
//        this.numberOfDice = numberOfDice;
//        this.numberOfTosses = numberOfTosses;
//    }

    public int[] diceSimulator (){
        Bins bin = new Bins(numberOfDice);
        int[] array = bin.getBin();

        for (int i = 0; i < numberOfTosses; i++){
            Integer total = 0;
            for (int j = 0; j < numberOfDice; j++){
                new Dice();
                total += Dice.dieToss();
            }
            array[total]++;
        }
        return array;
    }

    public void dieRoll(){
        int[] rollData = diceSimulator();

        for (int i = numberOfDice; i < rollData.length; i++){
            float decimal = (float)rollData[i]/numberOfTosses;
            Double percent = Math.floor(decimal*100);
            System.out.printf("%2s :%9s:%5.2f " + printStars(percent) + "\n", i, rollData[i], decimal);
        }
    }

    public String printStars(Double numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            sb.append("*");
        } return sb.toString();
    }

    public void getUserInput(){
        System.out.println("Number of Dice to Roll");
        Scanner scanner = new Scanner(System.in);
        numberOfDice = scanner.nextInt();
        System.out.println("How many rolls?");
        numberOfTosses = scanner.nextInt();
    }

    public void runSimulation(){
        getUserInput();
        dieRoll();

    }
//    public String runSimulation(){
//        Integer counter = 0;
//
//        for (int i = 0; i < numberOfDice; i++){
//            counter = dice.dieRoll();
//            bins.incrementBin()
//        }
//
//        return null;
//    }

}
