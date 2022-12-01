package org.example.contralores;

public class Transporte extends Viaje {

    private int tipoTransporte, medioTransporte;
    private double valorPasaje;

    public Transporte() {
    }

    public Transporte(int tipoViaje, String origen, String destino, String fechaViajeIda, String fechaViajeRegreso, int tipoTransporte, int medioTransporte, double valorPasaje) {
        super(tipoViaje, origen, destino, fechaViajeIda, fechaViajeRegreso);
        this.tipoTransporte = tipoTransporte;
        this.medioTransporte = medioTransporte;
        this.valorPasaje = valorPasaje;
    }

    public int getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(int tipoTransporte) {
        if(getTipoViaje()== 1 && tipoTransporte == 1){
            valorPasaje = 200000;
            this.tipoTransporte = tipoTransporte;
        } else if (getTipoViaje()== 1 && tipoTransporte == 2 ) {
            valorPasaje = 100000;
            this.tipoTransporte = tipoTransporte;
        } else if (getTipoViaje()== 2 && tipoTransporte == 1){
            valorPasaje = 3500000;
            this.tipoTransporte = tipoTransporte;
        } else if (getTipoViaje()== 2 && tipoTransporte == 2) {
            valorPasaje = 2800000;
            this.tipoTransporte = tipoTransporte;
        } else{
            System.out.println("opcion incorrecta!!!");
        }
    }

    public int getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(int medioTransporte) {
        if(medioTransporte != 1 && medioTransporte != 2 && medioTransporte != 3){
            System.out.println("Opcion invalida!!!");
        }else {
            this.medioTransporte = medioTransporte;
        }
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
}
