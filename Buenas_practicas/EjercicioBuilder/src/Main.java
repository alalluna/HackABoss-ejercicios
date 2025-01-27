import entities.Producto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Productos!");

        Producto producto = new Producto.ConstruirProducto()
                .consNombre("Tomates")
                .consDescripcion("tomates rojos cherry")
                .consPrecio(1.00)
                .consCategoria("frutas")
                .consMarca("Los Palacios")
                .construir();


        Producto productoTwo = new Producto.ConstruirProducto()
                .consNombre("Laptop")
                .consDescripcion("Laptop de alto rendimiento")
                .consPrecio(1200.00)
                .consCategoria("Electrónica")
                .consMarca("MarcaX")
                .construir();

        Producto productoThree = new Producto.ConstruirProducto()
                .consNombre("Mouse")
                .consDescripcion("Mouse inalámbrico")
                .consPrecio( 25.00)
                .consCategoria("Accesorios")
                .consMarca("MarcaY")
                .construir();

   /*     Producto producto1 = new Producto("Laptop", "Laptop de alto rendimiento", 1200.00, "Electrónica", "MarcaX");
        System.out.println(producto1);

        Producto producto2 = new Producto("Mouse", "Mouse inalámbrico", 25.00, "Accesorios", "MarcaY");
        System.out.println(producto2);
*/

        System.out.println(producto );
        System.out.println(productoTwo);
        System.out.println(productoThree);
    }
}