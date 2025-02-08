package com.mycompany.cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria.
 * Permite realizar operaciones como retiro e ingresa de saldo.
 * 
 * @author Vicente
 */
public class CCuenta {

    /**
     * Nombre de la persona titular de la cuenta.
     */
    private String nombre;
    
    /** 
     * Número de la cuenta.
     */
    private String cuenta;
    
    /** 
     * Saldo disponible en la cuenta.
     */
    private double saldo;
    
    /** 
     * Tipo de interés de la cuenta.
     */
    private double tipoInteres;

    /** 
     * Constructor vacío de la clase para que se incialice vacía.
     */
    public CCuenta() {
    
    }
    
    /**
     * Constructor de la clase con la que se inicializa la cuenta según los valores indicados.
     * @param nom Nombre de la persona titular de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Saldo disponible en la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el estado de la cuenta.
     * @return Saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad de saldo en la cuenta.
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa lanza una excepción.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de saldo de la cuenta.
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o no hay saldo lanza una excepción.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    // Métodos getter y setter
    
    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return Nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Asigna el nombre del titular de la cuenta.
     * @param nombre Nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el número de la cuenta.
     * @return Número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Asigna el número de la cuenta.
     * @param cuenta Número de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Obtiene el saldo de la cuenta.
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Asigna el saldo de la cuenta.
     * @param saldo Saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Obtiene el tipo de interés de la cuenta.
     * @return Tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }
    
    /**
     * Asigna el tipo de interés de la cuenta.
     * @param tipoInteres Tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
