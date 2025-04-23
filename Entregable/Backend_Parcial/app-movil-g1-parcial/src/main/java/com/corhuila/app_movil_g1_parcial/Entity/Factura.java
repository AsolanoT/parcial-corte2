package com.corhuila.app_movil_g1_parcial.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura extends ABaseEntity {

    @Column(name = "code", nullable = false, length = 20)
    private String code;

    @Column(name = "cliente", nullable = false, length = 100)
    private String cliente;

    @Column(name = "numero_factura", nullable = false, length = 50)
    private String numeroFactura;

    @Column(name = "ruc", nullable = false, length = 50)
    private String ruc;

    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    // Método de pago (del componente PaymentMethods)
    @Column(name = "metodo_pago", nullable = false, length = 50)
    private String metodoPago;

    // Relación directa con productos
    @ManyToMany
    @JoinTable(name = "factura_producto", joinColumns = @JoinColumn(name = "factura_id"), inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private List<Producto> productos = new ArrayList<>();

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    // Total general
    @Column(name = "total", nullable = false)
    private Double total;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
