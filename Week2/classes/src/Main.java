public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();



        // VALUE TYPE
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);

        // REFERENCE TYPE
        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2;
        numbers2 = numbers1;
        numbers1[0]=25;
        System.out.println(numbers2[0]);

    }
}

