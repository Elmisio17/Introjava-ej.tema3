public class switchestación {
    public static void main(String[] args) {
        var estacion = "OTOÑO";

        switch (estacion){
            case "VERANO":
                System.out.println("ES VERANO");
                break;
            case "INVIERNO":
                System.out.println("ES INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("ES PRIMAVERA");
                break;
            case "OTOÑO":
                System.out.println("ES OTOÑO");
                break;
            default:
                System.out.println("NO ES UNA ESTACIÓN");

        }
    }
}
