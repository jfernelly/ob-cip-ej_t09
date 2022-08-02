/*
Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la
edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
y con una variable salario que solo tenga la clase Trabajador.
*/

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setCredito(2000);
        cliente.setEdad(33);
        cliente.setNombre("Andres");
        cliente.setTelefono("1234567");

        trabajador.setSalario(2200);
        trabajador.setNombre("Maria");
        trabajador.setEdad(55);
        trabajador.setTelefono("838483748374");

        System.out.println(cliente.toString() + "\n" + trabajador.toString());


    }
}

class Persona{
    int edad;
    String telefono;

    String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

class Cliente extends Persona{
    int credito;


    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}