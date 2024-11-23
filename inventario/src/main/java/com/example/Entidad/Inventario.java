package com.example.Entidad;

import javax.persistence.*;


@Entity
@Table (name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombreDelProducto")
    private String nombreDelProducto;

    @Column(name = "precioDelProducto")
    private int precioDelProducto;

    @Column(name = "cantidadEnStock")
    private int cantidadEnStock;

    //getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getnombreDelProducto(){
        return nombreDelProducto;
    }

    public void setnombreDelProducto(String nombreDelProducto){
        this.nombreDelProducto = nombreDelProducto;
    }

    public int  getprecioDelProducto(){
        return precioDelProducto;
    }

    public void setprecioDelProducto(int precioDelProducto){
        this.precioDelProducto = precioDelProducto;
    }

    public int cantidadEnStock(){
        return cantidadEnStock;
    }

    public void setcantidadEnStock(int cantidadEnStock){
        this.cantidadEnStock =cantidadEnStock;
    }
}


