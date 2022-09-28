public class Main {
    public static void main(String[] args) {

    Product product = new Product(
            1,
            "Laptop",
            "Asus",
            17500,
            5,
            "Siyah"
    );
    Product product1 = new Product();
    product1.setId(2);







    ProductManager productManager = new ProductManager();
    productManager.Add(product);

    System.out.println(product.getCode());


    }
}