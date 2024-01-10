public class Cadenas {
    public static void ejer1(){
        String referencia = " ";
        String nombre = Leer.leerTexto("Escribe tu nombre:");
        String sexo = Leer.leerTexto("Escribe tu sexo (H/M):");
        String telefono = Leer.leerTexto("Escribe tu número de teléfono:");
        String ciudad = Leer.leerTexto("Escribe la ciudad a la que vas de viaje:");
        if (sexo.equals("H")){
            referencia = "el viajero ";
        }else if(sexo.equals("M")){
            referencia = "la viajera ";
        }
        System.out.println("<Hola! Soy "+referencia+nombre+".Has llamado al teléfono "+telefono+" y ahora no estoy en casa porque estoy en "+ciudad+" de vacaciones!!!>");
    }
    public static void ejer2(){
        String frase = Leer.leerTexto("Escribe una frase: ");
        String vocal = Leer.leerTexto("Escribe la vocal que quieres reemplazar: ");
        String reemplazo = Leer.leerTexto("Escribe la vocal por la que quieres reemplazar las anteriores: ");
        System.out.println(frase.replace(vocal,reemplazo));
    }
    public static void ejer3(){
        char letra;
        String frase = Leer.leerTexto("Escribe una frase: ");
        StringBuilder aux = new StringBuilder();
        for (int i=frase.length()-1; i >= 0 ;i--){
            letra = frase.charAt(i);
            aux.append(letra);
        }
        String reversa = aux.toString();
        System.out.println(reversa);
        if (reversa.equals(frase)){
            System.out.println("Se trata de un palíndromo");
        }
    }
    public static void ejer4(){
        
    }
}
