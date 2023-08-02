package tiendapp.Product;

import java.util.Objects;

public class Product {

    private String productName;
    private Integer amount;
    private Double price;
    private Boolean exist;

    public Product() {
        this.amount = 0;
        this.exist = false;
    }

    public Product(String productName) {
        this.productName = productName.toUpperCase();
        this.amount = 0;
        this.price = 0.0;
        this.exist = false;
    }

    public Product(String productName, Integer amount, Double price) {
        this.productName = productName.toUpperCase();
        this.amount = amount;
        this.price = price;
        if (amount!=0) {
            this.exist = true;
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String mensaje = "";
        if (exist) {
            mensaje = "-" + "Producto: " + productName + "  $" + price + " stock:" + amount + ".-";
        }
        return mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.productName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        return true;
    }
    

}
