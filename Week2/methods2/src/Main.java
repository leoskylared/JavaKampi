public class Main {
    public static void main(String[] args) {

        String message = "Bugün hava çok güzel.";
        String newMessage = message.substring(0,2);
        System.out.println(newMessage);
        String newMessage2 = getCity();
        int numbers = sum(10,20);
        System.out.println("TOPLAM: " + numbers);
        int toplam = sum2(10,7,7,7);
        System.out.println(toplam);

    }
    public static void add(){
        System.out.println("Eklendi.");
    }
    public static void delete(){
        System.out.println("Silindi.");
    }
    public static void update(){
        System.out.println("Güncellendi.");
    }

    public static int sum(int number1, int number2){
        return number1 + number2;
    }
    public static String getCity(){
        return "Amasya";
    }

    public static int sum2(int... numbers) {
        int toplam = 0;
        for (int number : numbers) {
            toplam += number;
        }
        return toplam;
    }
}