package com.hackaboss.holaMundo.utils;

import com.hackaboss.holaMundo.models.Pedido;
import com.hackaboss.holaMundo.models.Plato;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;

public class PedidoUtils {
    private List<Pedido> pedidos;

    public PedidoUtils() {
        this.pedidos = new ArrayList<>();
        //necesitare una lista como segundo parametro del objeto
        List<Plato> platoJuan = new ArrayList<>();
        platoJuan.add(new Plato(1L,"Vegetariano","Cous cous"));
        platoJuan.add(new Plato(2L,"Vegetariano","Ensalada con huevo"));
        pedidos.add(new Pedido(1L,"Juan",platoJuan));
    }

    public List<Pedido> findAll(){
        return this.pedidos;
    }

    public Pedido findOne(Long id) {
        return this.pedidos.stream()
                .filter(pedido -> pedido.getId().equals(id))
                .findFirst()
                .get();
    }

    //el nuevo pedido para la ruta get
    public Pedido newPedido(String cliente,List<Plato> menu){
        Pedido nuevoPedido = new Pedido(this.pedidos.size()+1L,cliente,menu);
        this.pedidos.add(nuevoPedido);
        return nuevoPedido;
    }

    //la respuesta no la personalizo por variar con respecto a menu, este metodo es para el post
    public ResponseEntity create(Pedido pedido) {
        pedido.setId(this.pedidos.size() + 1L);

        MenuUtils menuUtils= new MenuUtils();
        List<Plato> platosPedidos = pedido.getMenu().stream()
                .map(plato ->  menuUtils.findOne(plato.getId())).toList();

        pedido.setMenu(platosPedidos);
        this.pedidos.add(pedido);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(pedido);
    }
}
