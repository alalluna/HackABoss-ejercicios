package dia1InventarioComercio.entities;

import dia1Exceptions.exceptions.InvalidSalaryException;
import dia1InventarioComercio.exceptions.InvalidNameException;
import dia1InventarioComercio.exceptions.InvalidPriceException;
import dia1InventarioComercio.exceptions.InvalidQuantityException;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;


//constructor

    public Product() {
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //metodo para las excepciones
    public static void addProduct(String name, Double prize, Integer quantity)throws Exception {
        if (name == null || name.isEmpty()|| name.isBlank()) {
            throw new InvalidNameException("Please, enter a valid name, write only letters ");
        }
        if(prize == null || prize <= 0.00){
            throw new InvalidPriceException("Please, enter a valid prize, type only numers with decimals");
        }
        if(quantity == null || quantity <= 0){
            throw new InvalidQuantityException("Please, enter a valid quantity, type only integer numbers");
        }
    }
    //tostring

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}