package com.hackaboss.holaMundo.utils;

import com.hackaboss.holaMundo.models.Plato;
import com.hackaboss.holaMundo.responses.RespuestaMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MenuUtils {
    private List<Plato> menu;

    public MenuUtils() {
        this.menu = new ArrayList<>();
        menu.add ( new Plato(1L,"Vegetariano","Cous cous"));
        menu.add ( new Plato(2L,"Vegetariano","Ensalada con huevo"));
        menu.add ( new Plato(3L,"Vegano","hummus con verduras"));
        menu.add ( new Plato(4L,"Vegano","lentejas"));
        menu.add ( new Plato(5L,"Alergico gluten","pollo con patatas"));
        menu.add ( new Plato(6L,"Alergico gluten","ensaladilla"));
        menu.add ( new Plato(7L,"Carnivoro","paella"));
        menu.add ( new Plato(8L,"Carnivoro","bistec"));
    }
    // el menu completo
    public List<Plato> findAll(){
        return this.menu;
    }


    //el menu filtrado añadiendo tb el menu
    public List<Plato> findByType(String tipoMenu){
        //le ofrezco las dos opciones paar ver menu completo o menu,filtrado
        if(tipoMenu == null || tipoMenu.isEmpty()){
            return menu;
        }
        return menu.stream()
                .filter(plato -> plato.getTipoMenu().equalsIgnoreCase(tipoMenu))
                .collect(Collectors.toList());
    }

    //para poder crear pedidos necesitare encontrar los platos que se seleccionen, lo hare por id
    public Plato findOne(Long id) {
        return this.menu.stream()
                .filter(plato -> plato.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    //tambien necesitare poder crear un lista de platos por ids
    public List<Plato> findByIds(List<Long> ids) {
        return ids.stream()
                .map(this::findOne)  // Utiliza findById para buscar el plato por id
                .collect(Collectors.toList());
    }

    //para poder crear nuevos platos con post
    public RespuestaMenu create(Plato plato) {
        try{
            //le meto el id como en newPlato para que se añadan automaticamente
            plato.setId(this.menu.size() + 1L);
            this.menu.add(plato);

            return new RespuestaMenu("Plato creado con exito", 200, "POST- ok");
        } catch (Exception e) {
            return new RespuestaMenu(e.getMessage(), 500, "POST- error");
        }
    }
}
