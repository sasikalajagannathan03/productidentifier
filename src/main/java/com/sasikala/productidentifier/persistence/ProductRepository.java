package com.sasikala.productidentifier.persistence;

import com.sasikala.productidentifier.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {

    public ArrayList<Product> products = (ArrayList<Product>) Arrays.asList(new Product(1L,"IPhone", "200000", "Apple" ) ,
            new Product(2L,"Honor", "20000", "Hauwai" ) ,
            new Product(3L,"Samsung", "400000", "SamsungCompany" ) ,
            new Product(4L,"OnePlus", "600000", "plus" ) );

    public List<Product>  getProducts(){
        return products;
    }

    public Product getProduct(Long id){
        Product productOut=new Product();
        for(Product product: products){
            if(product.getId()==id)
                productOut=product;
        }
        return productOut;
    }

    public Product deleteProduct(Long id) {
        Product productOut=new Product();
        for(Product product: products){
            if(product.getId()==id) {
                productOut = product;
                products.remove(id);
            }
        }
        return productOut;

    }
    public void saveProduct(Product product)
    {
        System.out.println(product);
        products.add(product);
    }
}
