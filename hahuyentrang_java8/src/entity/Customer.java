package entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp {
    private int idCustomer =1;
    private int id;
    private String name;
    private Optional<String>  email;

    public Customer(String s, String string){}
    public Customer(int id, String name, String email) {
        this.id = idCustomer++;
        this.name = name;
        this.email = Optional.ofNullable(email);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return Optional.of(email.get()).orElse("email null");
    }
    public void setEmail(String email) {
        this.email = Optional.of(email);
    }

    @Override
    public void  inputData(Scanner scanner){
        System.out.print("nhập tên: ");
        name = scanner.next();
        System.out.print("nhập email: ");
        email = Optional.of(scanner.next());
    }

    @Override
    public String toString() {
        return "khách hàng : id=" + id + ", tên=" + name + ", email=" + email;
    }

}
