package org.example.productservice.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.productservice.mapper.ProductMapper;
import org.example.productservice.po.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
public class ProductController
{
    private final ProductMapper productMapper;

    @GetMapping("/findByProductId/{productId}")
    public Product findByProductId(@PathVariable Long productId) throws InterruptedException {
        //  Thread.sleep(2000);
        Product product = productMapper.findByProductId(productId);
        log.info("-------------OK   /findByProductId/{productId}--------------------");

        return product;
    }
    @GetMapping("/queryAllProduct")
    public List<Product> findByProductId() {
        List<Product> productList = productMapper.queryAllProduct();
        log.info("-------------OK   queryAllProduct--------------------");
        return productList;
    }
}
