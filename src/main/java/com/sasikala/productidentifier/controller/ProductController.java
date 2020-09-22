package com.sasikala.productidentifier.controller;

import com.sasikala.productidentifier.core.ProductService;
import com.sasikala.productidentifier.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping(value = "/")
    public List<Product> getProducts() {
        System.out.println(" This is my application");
        return productService.getProducts();
    }

    @GetMapping(value = "/product")
    public Product getProductById(@RequestParam("id") Long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping(value = "/product")
    public Product deleteByProductById(@RequestParam("id") Long id) {
        return productService.deleteProductById(id);
    }

    @PostMapping (value = "/product")
    public String saveProduct(@RequestBody Product product) {
         productService.saveProduct(product);
         return "successfully posted product";

    }

}
