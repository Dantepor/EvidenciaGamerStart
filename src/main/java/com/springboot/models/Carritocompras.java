package com.springboot.models;

import java.util.List;

public class Carritocompras {
    private List<Productos> productos;
    private double subtotal;

    // Getters y Setters
    
    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}