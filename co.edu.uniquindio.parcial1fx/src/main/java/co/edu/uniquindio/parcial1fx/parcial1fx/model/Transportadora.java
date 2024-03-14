package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import java.util.ArrayList;
import java.util.List;

public class Transportadora {

    private String nombre;
    private List<Propietario> listaPropietarios = new ArrayList<>();
    private  List<Vehiculo> listavehiculos = new ArrayList<>();
    private  List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    private  List<VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();
    private  List<Usuario> listaUsuarios = new ArrayList<>();

    public Transportadora() {
    }

    public String getNombre() {
        return nombre;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public List<Vehiculo> getListavehiculos() {
        return listavehiculos;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public List<VehiculoTransporte> getListaVehiculosTransporte() {
        return listaVehiculosTransporte;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    @Override
    public String toString() {
        return "Transportadora{" +
                "nombre='" + nombre + '\'' +
                ", listaPropietarios=" + listaPropietarios +
                ", listavehiculos=" + listavehiculos +
                ", listaVehiculosCarga=" + listaVehiculosCarga +
                ", listaVehiculosTransporte=" + listaVehiculosTransporte +
                ", listaUsuarios=" + listaUsuarios +
                '}';
    }

    public String obtenerUsuariosMayoresDeEdad() {
        String usuarios = "";

        for (Usuario usuario: getListaUsuarios()) {
            if (usuario.getEdad()>17){
                usuarios += usuario.toString() + "\n";
            }
        }

        return usuarios;
    }

    public String obtenerPropietarios() {
        String propietarios = "";

        for (Propietario propietario: getListaPropietarios()) {
            propietarios += propietario.toString() + "\n";
        }

        return propietarios;

    }

    public String obtenerVehiculosCarga() {
        String vehiculosCarga = "";

        for (VehiculoCarga vehiculoCarga: getListaVehiculosCarga()) {
            vehiculosCarga += vehiculoCarga.toString() + "\n";
        }

        return vehiculosCarga;
    }
}
