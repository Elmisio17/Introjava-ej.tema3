public class Coche {
    int numeroP = 4;

    public void agregarP (){
        this.numeroP++;
    }

    public static void main (String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarP();

        miCoche.mostrarP();
    }
    public void mostrarP (){
        System.out.println("La cantidad de puertas es:"+numeroP);
    }

}
