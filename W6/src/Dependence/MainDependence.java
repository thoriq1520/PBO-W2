package Dependence;

public class MainDependence {
public static void main(String[] args) {
        Customer pelanggan1 = new Customer();
        Customer pelanggan2 = new Customer();
        pelanggan1.setCustomerId(1);
        pelanggan1.setCustomerName("Thoriq");
        pelanggan2.setCustomerId(2);
        pelanggan2.setCustomerName("Fadhillah");
        
        Order print1 = new Order(pelanggan1);
        Order print2 = new Order(pelanggan2);
    }
}
