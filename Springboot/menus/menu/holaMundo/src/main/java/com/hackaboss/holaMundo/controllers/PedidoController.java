package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.models.Pedido;
import com.hackaboss.holaMundo.models.Plato;
import com.hackaboss.holaMundo.utils.MenuUtils;
import com.hackaboss.holaMundo.utils.PedidoUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    MenuUtils menuUtils = new MenuUtils();
    PedidoUtils pedidoUtils = new PedidoUtils();

    //http://localhost:8080/pedidos
    @GetMapping({"/", ""})
    public List<Pedido> obtenerPedidos(){
        return pedidoUtils.findAll();
    }
    //http://localhost:8080/pedidos/nuevo?cliente=Rosa&menu=5&menu=3
    @GetMapping("/nuevo")
    public Pedido crearPedido(@RequestParam String cliente, @RequestParam List<Long> menu){
        List<Plato> seleccionMenu = menuUtils.findByIds(menu);
        return pedidoUtils.newPedido(cliente,seleccionMenu);
    }

    //http://localhost:8080/pedidos/agregar
    @PostMapping("/agregar")
    public ResponseEntity crearPedidoPost(@RequestBody Pedido pedido){
        return pedidoUtils.create(pedido);
    }

    //http://localhost:8080/pedidos/1
    @GetMapping("/{id}")
    public Pedido buscarPedido(@PathVariable Long id){
        return pedidoUtils.findOne(id);
    }
}
