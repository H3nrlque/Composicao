package application.Pedido_Cliente.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double SubTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return product
               +", Quantity: "
               +quantity
               +", Subtotal: $"
               +String.format("%.2f\n",SubTotal());
    }
}
