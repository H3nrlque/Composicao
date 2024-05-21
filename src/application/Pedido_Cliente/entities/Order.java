package application.Pedido_Cliente.entities;

import application.Pedido_Cliente.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, Client client) {
        this.moment = moment;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(String nome) {
        for (OrderItem i : items) {
            if (i.getProduct().getNome().equals(nome)) {
                items.remove(i);
            }
        }
    }

    public double Total() {
        double soma = 0.0;
        for (OrderItem i : items) {
            soma += i.SubTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)+"\n");
        sb.append("Order status: ");
        sb.append(OrderStatus.PROCESSING+"\n");
        sb.append("Client: \n");
        sb.append(client+"\n");
        sb.append("Order items: \n");
        for (OrderItem i : items) {
            sb.append(i+"\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f\n",Total()));
        return sb.toString();
    }
}
