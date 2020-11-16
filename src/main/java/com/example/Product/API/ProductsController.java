package com.example.Product.API;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.Product.Model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    public static ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(
    new Product("Pañales","26","https://www.nappy.es/12115-thickbox_default/panales-dodot-t4-124-uds-toallitas-128-uds.jpg","1"),
    new Product("TV QLED 65- Samsung 65Q95T, 4K 2020, Direct Full Array HDR 2000, Quantum 4K con IA UHD, Asistentes de voz","2999","https://assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_74109823/fee_786_587_png/TV-QLED-65%22---Samsung-65Q95T--4K-2020--Direct-Full-Array-HDR-2000--Quantum-4K-con-IA-UHD--Asistentes-de-voz","1"),
    new Product("Fifa 21 - PS4","69.95","https://media.game.es/COVERV2/3D_L/181/181108.png","3"),
    new Product("JAMÓN ETIQUETA NEGRA BENITO","130","https://www.jamonpurobellota.com/1184-home_default/jamon-etiqueta-negra-benito.jpg","1"),
    new Product("Coca Cola Japonesa Botella Aluminio | Edición Limitada Kyoto","3.49","https://www.japonshop.com/med/img/productos/prd-coca-cola-kyoto-japonesa-japonshop_1.webp","2")

    ));


     //METHOD GET
     @GetMapping("/products")
    private ArrayList<Product> GetProductss(){
        return products;
    }

    //METHOD GET/{ID}
    @GetMapping("/products/{id}")
    private Product GetProductsId(@PathVariable("id") int id){
        for(Product element : products){
            if(element.getId()==id){
                return element;
            }
        }
        return null;
    }
}
