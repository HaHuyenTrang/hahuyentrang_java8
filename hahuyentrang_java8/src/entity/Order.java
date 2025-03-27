package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Order implements IApp {
    private static int idOrder = 1;
    private int id;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private boolean status;

    public Order(Customer customer, LocalDate now, double total) {}
    public Order(int id, Customer customer, LocalDate orderDate, double totalAmount, boolean status) {
        this.id = idOrder++;
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = false;
    }
    public void updateStatus() {
        this.status = true;
    }

    @Override
    public void inputData(Scanner scanner){
        String orderDate = scanner.nextLine();
        System.out.print("tổng tiền: ");
        double totalAmount = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "ID: " + id + "  khách hàng: " + customer.getName() + "  Ngày đặt: " + orderDate + "  Trạng thái: " + (status ? "Đã giao" : "Chưa giao");
    }
}
