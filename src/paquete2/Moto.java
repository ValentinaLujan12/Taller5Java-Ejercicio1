package paquete2;

import paquete1.Auto;

public class Moto extends Auto {
    private String placa;
    private String modelo;
    public int velocidad = 30;

    public Moto(String placa,String modelo){
        this.placa = placa;
        this.modelo=modelo;
        this.pitar();
    }

    public void acelerar(){
        System.out.println("Avanzo muy rapido");
    }
    
}