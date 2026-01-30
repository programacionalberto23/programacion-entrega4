package Ejer_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EAG
 */
public class Vehiculo {
    private String matricula,marca,modelo;
    private boolean disponible;
    private Empresa empresa;
    
    //CONSTRUCTORES

//CONSTRUCTOR POR DEFECTO

public Vehiculo(){
    this.matricula = "";
    this.marca = "";
    this.modelo = "";
    this.disponible = true;
    this.empresa = null;
}

//CONSTRUCTOR POR PARÁMETROS

public Vehiculo(String matricula, String marca, String modelo) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.disponible = vehiculoDisponible;
    this.empresa = Empresa;
}

//CONSTRUCTOR DE COPIA
public Vehiculo(Vehiculo vehiculo){
    //COPIAS EL NOMBRE DEL VEHICULO
    this.nombre = vehiculo.nombre;
    //COPIAR TODOS LOS ATRUBUTOS

}
}
