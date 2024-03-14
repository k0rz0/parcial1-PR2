package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.UsuarioBuilder;

public class Usuario {
    private int edad;
    private VehiculoTransporte vehiculoTransporte;

    public Usuario(int edad, VehiculoTransporte vehiculoTransporte) {
        this.edad = edad;
        this.vehiculoTransporte = vehiculoTransporte;
    }

    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }

    public int getEdad() {
        return edad;
    }

    public VehiculoTransporte getVehiculoTransporte() {
        return vehiculoTransporte;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "edad=" + edad +
                ", vehiculoTransporte=" + vehiculoTransporte +
                '}';
    }
}
