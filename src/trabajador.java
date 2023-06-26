public class trabajador extends Persona {
    double salario;

    public static void main(String[] args) {
        trabajador trabajador = new trabajador();
        trabajador.edad = 23;
        trabajador.nombre = "David Figueredo";
        trabajador.phone = 623420899;
        trabajador.salario = 2200.12;

        System.out.println("edad = " + trabajador.edad);
        System.out.println("nombre = " + trabajador.nombre);
        System.out.println("phone = "+ trabajador.phone);
        System.out.println("salario = " + trabajador.salario);

    }
}
