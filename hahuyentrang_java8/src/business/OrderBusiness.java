package business;

import entity.Customer;
import entity.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderBusiness implements IOrderBusiness {
    private static List<Order> orders = new ArrayList<>();
    private static List<Customer> customers;

    public OrderBusiness(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void addOrder(Scanner scanner) {
        System.out.println(" Thêm đơn hàng ");
        if (customers.isEmpty()) {
            System.out.println("Chưa có khách hàng");
            return;
        }
        System.out.print("Chọn ID khách hàng: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        Customer customer = customers.stream().filter(c -> c.getId() == customerId).findFirst().orElse(null);
        if (customer == null) {
            System.out.println("Không tìm thấy ");
            return;
        }
        System.out.print("Nhập tổng tiền đơn hàng: ");
        double total = scanner.nextDouble();
        orders.add(new Order(customer, LocalDate.now(), total));
    }

    @Override
    public void displayOrders() {
        System.out.println(" Danh sách đơn hàng ");
        orders.forEach(System.out::println);
    }

    @Override
    public void updateOrderStatus(Scanner scanner) {
        System.out.print(" ID đơn hàng cần cập nhật: ");
        int orderId = scanner.nextInt();
        orders.stream().filter(o -> o.getId() == orderId).findFirst().ifPresent(Order::updateStatus);
    }

}
