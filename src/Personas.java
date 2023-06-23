public class Personas {


    private String nombre;
    private int edad;
    private int phone;

    public Personas() {
    }

    public Personas (String nombre, int edad, int phone){
        this.nombre = nombre;
        this.edad = edad;
        this.phone = phone;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", phone=" + phone +
                '}';
    }

    public static void main(String[] args) {
        //creo la persona
        Personas p1 = new Personas();
        Personas p2 = new Personas ("Josefina", 25, 623420891);

        p1.setNombre("Antia");
        p1.setEdad (31);
        p1.setPhone(623520891);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = "+ p2);

    }
}



