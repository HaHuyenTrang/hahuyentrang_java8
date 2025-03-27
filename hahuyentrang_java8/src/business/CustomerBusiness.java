package business;

import entity.Customer;
import entity.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerBusiness {
    private static List<Customer> customers = new ArrayList<>();

    public static void addCustomer(Scanner scanner) {
        System.out.println("== Thêm khách hàng ==");
        Customer customer = new Customer("","");
        customer.inputData(scanner);
        customers.add(customer);
    }

    public static void displayCustomers() {
        System.out.println("== Danh sách khách hàng ==");
        customers.forEach(System.out::println);
    }
}
