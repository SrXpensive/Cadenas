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
        String frase  = Leer.leerTexto("Escribe una frase: ");
        char letra;
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;
        for (int inc=0; inc<frase.length();inc++){
            letra = frase.charAt(inc);
            switch(letra){
                case ('a'):
                    a = true;
                    break;
                case ('e'):
                    e = true;
                    break;
                case ('i'):
                    i = true;
                    break;
                case ('o'):
                    o = true;
                    break;
                case ('u'):
                    u = true;
                    break;
            }
            if(a && e && i && o && u){
                System.out.println("Están todas las vocales en tu frase");
            }
        }
    }
    public static void ejer5(){
        String frase = Leer.leerTexto("Escribe una frase: ");
        char letra;
        int contador=0;
        for (int i = 0; i < frase.length();i++){
            letra = frase.charAt(i);
            switch(letra){
                case '0':
                    contador++;
                    break;
                case '1':
                    contador++;
                    break;
                case '2':
                    contador++;
                    break;
                case '3':
                    contador++;
                    break;
                case '4':
                    contador++;
                    break;
                case '5':
                    contador++;
                    break;
                case '6':
                    contador++;
                    break;
                case '7':
                    contador++;
                    break;
                case '8':
                    contador++;
                    break;
                case '9':
                    contador++;
                    break;
            }
        }
        if (contador == frase.length()){
            System.out.println("Todos los caracteres de la frase son números");
        }else{
            System.out.println("Hay letras en tu frase");
        }
    }
}
