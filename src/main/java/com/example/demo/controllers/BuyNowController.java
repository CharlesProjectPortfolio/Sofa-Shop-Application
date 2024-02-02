package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;

@Controller
public class BuyNowController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/buynow")
    public String check(@RequestParam("productID") int theId) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product = productService.findById(theId);
        if (product.getInv() > 0) {
            product.setInv(product.getInv()-1);
            productService.save(product);
            return "buysuccess";
        }
        else {
            return "buyfailure";
        }

    }

}