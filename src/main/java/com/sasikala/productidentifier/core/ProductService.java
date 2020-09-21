package com.sasikala.productidentifier.core;

import com.sasikala.productidentifier.model.Product;
import com.sasikala.productidentifier.persistence.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.getProducts();
    }

    public Product getProductById(Long id){
        return  productRepository.getProduct(id);
    }

    public Product deleteProductById(Long id) {
        return productRepository.deleteProduct(id);
    }
}
