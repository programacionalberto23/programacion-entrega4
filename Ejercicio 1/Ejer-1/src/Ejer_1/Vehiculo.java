package Ejer_1;

/*@author ALBERTO*/
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

    public Vehiculo(String matricula, String marca, String modelo, boolean vehiculoDisponible, Empresa empresa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.disponible = vehiculoDisponible;
        this.empresa = empresa;
    }

    //CONSTRUCTOR DE COPIA

    public Vehiculo(Vehiculo vehiculo){
    //COPIAS EL NOMBRE DEL VEHICULO

        this.matricula = vehiculo.matricula;
        this.marca = vehiculo.marca;
        this.modelo = vehiculo.modelo;
        this.disponible = vehiculo.disponible;
        this.empresa = vehiculo.empresa;
    //COPIAR TODOS LOS ATRUBUTOS
    }
    // GETTERS
      public String getMatricula(){
        return this.matricula;
      }
      public String getMarca(){
        return this.marca;
      }
      public boolean getDisponible(){
        return this.disponible;
      }
    // SETTERS
      public void setMatricula(String matricula){
        this.matricula = matricula;
      }
      public void setMarca(String marca) {
        this.marca = marca;
      }
      public void setModelo(String modelo) {
        this.modelo = modelo;
      }
      public void setDisponible(boolean disponible) {
        this.disponible = disponible;
      }
      
}
