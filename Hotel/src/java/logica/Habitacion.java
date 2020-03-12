/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author estudiantes
 */
public class Habitacion extends Reserva {
   private String tipo;
   private int numero_hab;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero_hab() {
        return numero_hab;
    }

    public void setNumero_hab(int numero_hab) {
        this.numero_hab = numero_hab;
    }
    
    private void Generarreserv(int numero_hab, String tipo){
      int valorEntero = (int) Math.floor(Math.random()*(3-6+1)+6);
      System.out.println(".");
    }
     
}
