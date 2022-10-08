public class Main {
    public static void main(String[] args) {

    CreditManager creditManager = new CreditManager();
        creditManager.Calculate();

        Customer customer = new Customer();
        customer.id = 1;
        customer.City = "İstanbul";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Save();
        customerManager.Save();
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.taxNumber = "10000";
        company.companyName = "Arçelik";
        company.id = 100;


        CustomerManager customerManager2 = new CustomerManager(new Person());

        Person person = new Person();
        person.nationalIdentity = "123456";

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();








    }
}

