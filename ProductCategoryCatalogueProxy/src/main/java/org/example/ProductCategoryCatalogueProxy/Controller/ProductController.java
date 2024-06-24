package org.example.ProductCategoryCatalogueProxy.Controller;

import org.example.ProductCategoryCatalogueProxy.Dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {

    @GetMapping("")
    public String getProducts(){
        return "return list of all products";
    }

    @GetMapping("{id}")
    public String getProduct(@PathVariable("id") String id1){
        return "returning product with id " +id1;
    }

    @PostMapping("")
    public String createProduct(@RequestBody ProductDto productDTO){
        return "Creating product";
    }

    @PatchMapping("")
    public String updateProduct(@RequestBody ProductDto productDTO){
        return "updating  product"  + productDTO;
    }

}
