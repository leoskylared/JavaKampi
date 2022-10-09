public class Main {
    public static void main(String[] args) {

      BaseCreditManager[] creditManagers = new BaseCreditManager[]{
        new TeacherManager(),
        new AgricultureManager(),
        new StudentManager()
      };

      for(BaseCreditManager creditManager : creditManagers){
          System.out.println(creditManager.calculate(1000));
      }


    }
}