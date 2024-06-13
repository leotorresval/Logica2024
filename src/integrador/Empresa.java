/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

/**
 *
 * @author User
 */
public class Empresa {

    private String ruc;
    private String nombreEmpresa;
    private String nombreEncargado;
    private String apellidoEncargado;
    private String direccion;
    private String telefono;
    private String horaApertura;
    private String horaCierre;
    private String tipoEmpresa;

    public Empresa(String ruc, String nombreEmpresa, String nombreEncargado, String apellidoEncargado, String direccion, String telefono, String horaApertura, String horaCierre, String tipoEmpresa) {
        this.ruc = ruc;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreEncargado = nombreEncargado;
        this.apellidoEncargado = apellidoEncargado;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" + "ruc=" + ruc + ", nombreEmpresa=" + nombreEmpresa + ", nombreEncargado=" + nombreEncargado + ", apellidoEncargado=" + apellidoEncargado + ", direccion=" + direccion + ", telefono=" + telefono + ", horaApertura=" + horaApertura + ", horaCierre=" + horaCierre + ", tipoEmpresa=" + tipoEmpresa + '}';
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getApellidoEncargado() {
        return apellidoEncargado;
    }

    public void setApellidoEncargado(String apellidoEncargado) {
        this.apellidoEncargado = apellidoEncargado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }
    
    
}
