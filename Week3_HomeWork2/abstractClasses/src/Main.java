public class Main {
    public static void main(String[] args) {

        FemaleGameCalculator femaleGameCalculator = new FemaleGameCalculator();
        femaleGameCalculator.gameOver();


        GameCalculator gameCalculator = new OlderGameCalculator();
        gameCalculator.calculate();


    }
}