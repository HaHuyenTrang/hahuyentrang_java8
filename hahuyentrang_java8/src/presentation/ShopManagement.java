package presentation;

import business.CustomerBusiness;
import business.OrderBusiness;
import java.util.Scanner;

public class ShopManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerBusiness customerBusiness = new CustomerBusiness();
        OrderBusiness orderBusiness = new OrderBusiness(CustomerBusiness.customers);



        while (true) {
            System.out.println("\n*************** SHOP MENU ***************");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý đơn hàng");
            System.out.println("3. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n******** CUSTOMER MENU ********");
                    System.out.println("1. Danh sách khách hàng");
                    System.out.println("2. Thêm khách hàng");
                    System.out.println("3. Thoát");
                    int numChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (numChoice == 1) customerBusiness.displayCustomers();
                    if (numChoice == 2) customerBusiness.addCustomer(scanner);
                }
                case 2 -> {
                    System.out.println("\n******** OD MENU ********");
                    System.out.println("1. Danh sách đơn hàng ");
                    System.out.println("2. Thêm mới đơn hàng  ");
                    System.out.println("3. Cập nhật trạng thái đơn hàng  ");
                    System.out.println("4. Danh sách đơn hàng quá hạn    ");
                    System.out.println("5. Thống kê số lượng đơn hàng đã giao (Trạng thái true)   ");
                    System.out.println("6. Tính tổng doanh thu các đơn hàng đã giao  ");
                    System.out.println("7. Thoát   ");
                    int numChoice = scanner.nextInt();
                    scanner.nextLine();

                }
                case 3 -> {
                    System.out.println("Thoát chương trình!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }


    }
}

