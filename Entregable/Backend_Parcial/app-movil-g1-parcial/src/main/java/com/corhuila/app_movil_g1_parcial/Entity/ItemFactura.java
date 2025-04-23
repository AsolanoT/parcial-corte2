package com.corhuila.app_movil_g1_parcial.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_factura")
public class ItemFactura extends ABaseEntity {

    @Column(name = "code", nullable = false, length = 20)
    private String code;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "producto_id", nullable = false, unique = true)
    private Producto productoId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "factura_id", nullable = false, unique = true)
    private Factura facturaId;

    @Column(name = "precio_unitario", nullable = false)
    private double precioUnitario;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    public Factura getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Factura facturaId) {
        this.facturaId = facturaId;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

}
