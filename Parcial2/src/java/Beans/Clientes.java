package Beans;

/*
 * @ahutor: Claudio Eber Islas Ortiz
 * @version: 8.0.2 NetBeans
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "formC")
@RequestScoped
public class Clientes {

    private String targeta;
    private String nombre;
    private String apellido;
    private String direccion;
    private Integer edad;
    private String colonia;
    private Integer cp;
    private String ciudad;
    private String estado;
    private String telefono;
    private String email;
    private String rfc;
    private String puntos;
    private String cantidad;
    private String femision;

    public String getTargeta() {
        return targeta;
    }

    public void setTargeta(String targeta) {
        this.targeta = targeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFemision() {
        return femision;
    }

    public void setFemision(String femision) {
        this.femision = femision;
    }

    public Clientes() {
    }

    public String registrar() {
        return "confirmationClientes";
    }

    public String index() {
        return "index";
    }
}
