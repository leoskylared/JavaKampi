public class Main {
    public static void main(String[] args) {

       /* EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("Log message");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.Log("Log message");

        BaseLogger[] loggers = new BaseLogger[]{

                new FileLogger(),
                new EmailLogger(),
                new DatabaseLogger(),
                new ConsoleLogger()

        };

        for(BaseLogger logger : loggers){
            logger.Log("Log Message");
        }

        */

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}