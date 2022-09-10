package com.WineStore.WineStore.exeption;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(long id){
        super("Product with id \"" + id + "\" - not found!");
    }
}
