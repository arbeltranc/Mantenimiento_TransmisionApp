/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento_transmisionapp;

/**
 *
 * @author ALEX BELTRAN
 */
class Mantenimiento_Transmision {
    
//Atributos
    private String falla;
    private int costo_reparacion;
    
    //Constructor
  
public Mantenimiento_Transmision(String falla, int costo_reparacion){
 this.falla=falla;
 
 this.costo_reparacion=costo_reparacion;

}

//Metodos
public void setFalla(String falla){
    this.falla=falla;
}
public String getFalla(){
    return falla;
}
public void setCosto_reparacion(int costo_reparacion){
    this.costo_reparacion=costo_reparacion;
}
public int getCosto_reparacion(){
    return costo_reparacion;
}

@Override
public String toString(){
    return "El vehículo presenta "+falla+" y costará repararlo "+costo_reparacion+" dólares.";
}
//clase ejecutable
}

class Mantenimiento_TransmisionApp{
    public static void main(String[] args){
         //creamos los objetos
         
         Mantenimiento_Transmision Mantenimiento1=new Mantenimiento_Transmision("desequilibrio del palier", 150);
         Mantenimiento_Transmision Mantenimiento2=new Mantenimiento_Transmision("problemas en el diferencial", 100);

         //mostramos su estado
         System.out.println(Mantenimiento1);
         System.out.println(Mantenimiento2);
         
    }
}
