package Beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "formA")
@RequestScoped
public class AlmacenBean {

    private String Id_operador;
    private String No_almacen;
    private String Operacion;
    private Integer Referencia;
    private String Producto;
    private Integer Cantidad;
    private String Fecha;
    private String Hora;

    public String getIDoperador() {
        return Id_operador;
    }

    public void setIDoperador(String IDoperador) {
        this.Id_operador = IDoperador;
    }

    public String getNoAlmacen() {
        return No_almacen;
    }

    public void setNoAlmacen(String NoAlmacen) {
        this.No_almacen = NoAlmacen;
    }

    public String getOperacion() {
        return Operacion;
    }

    public void setOperacion(String Operacion) {
        this.Operacion = Operacion;
    }

    public Integer getReferencia() {
        return Referencia;
    }

    public void setReferencia(Integer Referencia) {
        this.Referencia = Referencia;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    

    public AlmacenBean() {
    }

    public String registrar() {
        return "confirmationAlmacen";
    }

    public String index() {
        return "index";
    }

}

