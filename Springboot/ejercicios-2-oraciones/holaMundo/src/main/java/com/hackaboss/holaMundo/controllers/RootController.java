package com.hackaboss.holaMundo.controllers;

import com.hackaboss.holaMundo.entities.Dato;
import com.hackaboss.holaMundo.entities.Refran;
import com.hackaboss.holaMundo.models.CentimetrosAmetros;
import com.hackaboss.holaMundo.utils.ConverterCm;
import com.hackaboss.holaMundo.utils.MorseUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static com.hackaboss.holaMundo.utils.RandomNumbers.returnRandomNumber;
import static com.hackaboss.holaMundo.utils.Lists.listarDatos;
import static com.hackaboss.holaMundo.utils.Lists.listarRefranes;

@RestController
public class RootController {
    //localhost:8080/dato
    @GetMapping ("/dato")
    public Dato getDatoAleatorio() {
        List<Dato> listado = listarDatos();
        return returnRandomNumber(listado);
    }

    //localhost:8080/refran
    @GetMapping ("/refran")
    public Refran getRefranAleatorio() {
        List<Refran> listado = listarRefranes();
        return returnRandomNumber(listado);
    }

    //localhost:8080/conversor?num=25.55
    @GetMapping("/conversor")
    public CentimetrosAmetros conversor(@RequestParam("centimetros") int num) {
        CentimetrosAmetros res = new CentimetrosAmetros();
        res.setCm(num);
        res.setResult(ConverterCm.converter(num));
        res.setStatus("OK-200");

        System.err.println(res.getStatus());
        return res;
    }


    //localhost:8080/morse?text="mama nacio en 1984"
    //https://stackoverflow.com/questions/5649329/utf-8-encoding-problem-in-spring-mvc
    //produces = "text/plain; charset=UTF-8" ,produces = "text/plain"  ,
    @GetMapping(path ="/morse")

    public String convertToMorse(@RequestParam String text) {
        return MorseUtils.MorseConverter(text);
    }

}

