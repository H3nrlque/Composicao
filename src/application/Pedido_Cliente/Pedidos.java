package application.Pedido_Cliente;

import application.Pedido_Cliente.entities.Client;
import application.Pedido_Cliente.entities.Order;
import application.Pedido_Cliente.entities.OrderItem;
import application.Pedido_Cliente.entities.Product;
import application.Pedido_Cliente.entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Pedidos {
    public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String nameClient = tc.nextLine();
        System.out.print("Email: ");
        String emailClient = tc.nextLine();
        System.out.print("CPF: ");
        String cpfClient = tc.next();
        Client client = new Client(nameClient, emailClient, cpfClient);
        System.out.println("Enter order data: ");
        Order order = new Order(new Date(), client);
        System.out.print("How many items to this order: ");
        int n = tc.nextInt();
        for (int i = 0; i < n; i++) {
            tc.nextLine();
            System.out.println("Enter #"+(i+1)+" item data: ");
            System.out.print("Product name: ");
            String productName = tc.nextLine();
            System.out.print("Product price: ");
            double productPrice = tc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = tc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(productQuantity, productPrice, product);
            order.addItem(item);
            System.out.println();
        }
        System.out.println(order);

    }

}
