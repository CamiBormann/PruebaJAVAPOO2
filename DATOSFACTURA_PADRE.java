/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epe2_camilabormann;

/**
 *
 * @author camil
 */
public class DATOSFACTURA_PADRE {
    //propiedades de la clase
    public String Nombres_Cliente;
    public String Apellidos_Cliente;
    public int Edad_Cliente;
    public String Rut_Cliente;
    public String NombreEmpresa;
    public String RutEmpresa;
    public String GIROEmpresa;
    public double TOTALVENTAS;
    public double MONTOV;
    public double montoIVA;
    public double utilidades;
    
    //constructor de la clase con parametros de entrada.
    public DATOSFACTURA_PADRE(String nombreCliente, String apellidosCliente, int edadCliente, String rutCliente, String nombreEmpresa, String rutEmpresa, String giroEmpresa, double totalVentas, double montoVentas) {
        this.Nombres_Cliente = nombreCliente;
        this.Apellidos_Cliente = apellidosCliente;
        this.Edad_Cliente = edadCliente;
        this.Rut_Cliente = rutCliente;
        this.NombreEmpresa = nombreEmpresa;
        this.RutEmpresa = rutEmpresa;
        this.GIROEmpresa = giroEmpresa;
        this.TOTALVENTAS = TOTALVENTAS;
        this.MONTOV = MONTOV;
    }

    private void calcularIVA() {
        // Cálculo del IVA sobre el monto de las ventas
        montoIVA = MONTOV * 0.19; // tasa de IVA del 19% en Chile
    }

    private void calcularUtilidades() {
        // Cálculo de las utilidades de la empresa
        utilidades = TOTALVENTAS - montoIVA;
    }

    // Getters para acceder a los datos calculados
    public double getMontoIVA() {
        calcularIVA();
        return montoIVA;
    }
    //devuelve la propiedad utilidades despues de hacer el calculo.
    public double getUtilidades() {
        calcularUtilidades();
        return utilidades;
    }

    public String getNombreCliente() {
        return Nombres_Cliente;
    }

    public String getApellidosCliente() {
        return Apellidos_Cliente;
    }

    public int getEdadCliente() {
        return Edad_Cliente;
    }

    public String getRutCliente() {
        return Rut_Cliente;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public String getRutEmpresa() {
        return RutEmpresa;
    }

    public String getGiroEmpresa() {
        return GIROEmpresa;
    }

    public double getTotalVentas() {
        return TOTALVENTAS;
    }

    public double getMontoVentas() {
        return MONTOV;
    }
}
