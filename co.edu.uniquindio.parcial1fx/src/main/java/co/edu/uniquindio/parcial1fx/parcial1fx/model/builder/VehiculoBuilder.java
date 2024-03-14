package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.Vehiculo;

public class VehiculoBuilder {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;

    public VehiculoBuilder placa(String placa) {
        this.placa = placa;
        return this;
    }
    public VehiculoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }
    public VehiculoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }
    public VehiculoBuilder color(String color) {
        this.color = color;
        return this;
    }
    public Vehiculo build() {
        return new Vehiculo(placa, modelo, marca, color);
    }

}
