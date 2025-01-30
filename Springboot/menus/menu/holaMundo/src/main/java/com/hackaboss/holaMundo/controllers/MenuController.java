package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.models.Plato;
import com.hackaboss.holaMundo.responses.RespuestaMenu;
import com.hackaboss.holaMundo.utils.MenuUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    MenuUtils menuUtils = new MenuUtils();

    //http://localhost:8080/menu
//    @GetMapping("")
//    public List<Plato> obtenerMenu(){
//        return menuUtils.findAll();
//    }

    //http://localhost:8080/menu?tipoMenu=vegetariano
    @GetMapping({"/",""})
    //@RequestParam(value = "i", required=false) Integer i
    //https://stackoverflow.com/questions/12296642/is-it-possible-to-have-empty-requestparam-values-use-the-defaultvalue
    public List<Plato> obtenerMenu(@RequestParam (value = "tipoMenu", required = false) String tipoMenu ){
        return menuUtils.findByType(tipoMenu);
    }

    //http://localhost:8080/menu/nuevo
    @PostMapping("/nuevo")
    public RespuestaMenu crearPlato(@RequestBody Plato plato){
        return menuUtils.create(plato);
    }

}
