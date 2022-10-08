public class CustomerManager {

    private Customer _customer;
    public CustomerManager(Customer customer){
        _customer = customer;
    }
    public void Save(){
        System.out.println("Müşteri kaydedildi : " + _customer.id);
    }

    public void Delete(){
        System.out.println("Müşteri silindi : " + _customer.id);
    }
}
