package dia1InventarioComercio;
import dia1InventarioComercio.entities.Product;
import dia1InventarioComercio.exceptions.InvalidNameException;
import dia1InventarioComercio.exceptions.InvalidPriceException;
import dia1InventarioComercio.exceptions.InvalidQuantityException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Product> store = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Name: ");
                String name = scanner.nextLine();

                System.out.println("Prize: ");
                Double prize = Double.parseDouble(scanner.nextLine());

                System.out.println("Quantity: ");
                Integer quantity = Integer.parseInt(scanner.nextLine());

                // validar el producto
                Product.addProduct(name, prize, quantity);
                Product product = new Product(name,prize,quantity);
                store.add(product);
                System.out.println("Just add new product: "+ product);
            }catch (InvalidNameException | InvalidPriceException | InvalidQuantityException e){
                System.out.println("Error adding product" + e.getMessage());
            }
            System.out.print("¿Do you need to add more products? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            } else if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Invalid response. Please enter 'yes' to add more products or 'no' to finish.");
            }
        }
        System.out.println("FINAL STORE:");
        for (Product product : store) {
            System.out.println(product);
        }
    }
}
