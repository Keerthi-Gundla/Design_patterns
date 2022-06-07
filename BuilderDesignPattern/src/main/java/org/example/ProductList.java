package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    List<Product> prodList=new ArrayList<>();

    public void addProd(Product prod){
        prodList.add(prod);
    }

    public void showProducts(){
        for(Product prod: prodList)
        {
            System.out.println(" Product Name : "+prod.getName());
            System.out.println("Product Price : "+prod.getPrice());
        }
    }

}


