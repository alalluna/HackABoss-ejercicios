package miercoles18inventario;

import miercoles18inventario.Entities.Producto;

import java.util.ArrayList;

public class Main {
    ArrayList<Producto> inventario = new ArrayList<>();

    Producto telf = new Producto(1,"Teléfono","Sony","Samsung",100.00F,65.20F, 50);
    Producto laptop = new Producto(2,"Laptop","IBM","Gamer",1200.05F,745.00f, 10);

    inventario.add(telf);
    inventario.add(laptop);

    Producto productoEliminado = inventario.remove(2);

    System.out.println(" ");

    for (Producto p: inventario){
        System.out.println(p);
    }

}
