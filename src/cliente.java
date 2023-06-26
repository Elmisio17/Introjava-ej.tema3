public class cliente extends Persona {
    int credito;

    public static void main(String[] args) {
        cliente cliente= new cliente ();
        cliente.edad = 23;
        cliente.nombre = "David Figueredo";
        cliente.phone = 623420899;
        cliente.credito = 200 ;

        System.out.println("edad =" +  cliente.edad);
        System.out.println("nombre = " + cliente.nombre);
        System.out.println("phone = " + cliente.phone);
        System.out.println("credito = " + cliente.credito);

    }
}
