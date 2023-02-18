public class SwitchCase {
    public static void main(String[] args){
        var estacion = "Auto";

        switch (estacion){
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }

}
