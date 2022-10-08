public class Main {
    public static void main(String[] args) {

        int[] number1 = new int[] {1,2,3};
        int[] number2 = new int[] {10,20,30};

        number1 = number2;

        number2[0] = 1000;

        System.out.println(number1[0]);

    }
}