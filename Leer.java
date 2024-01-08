import java.io.BufferedReader;
import java.io.IOException;
public class Leer {
    private final static BufferedReader entradaConsola =
            new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    /*
    *Llig un text del teclat.
    * @param mensaje Text que es passa a l'usuari
    * @return el text introduit. Blanc en cas d'error
     */
    public static String leerTexto(String mensaje){
        String respuesta = null;
        do{
            try{
                System.out.print(mensaje);
                respuesta = entradaConsola.readLine();
            }
            catch (IOException ex){
                return "";
            }
        } while(respuesta == null);
        return respuesta;
    }

    /*
    * Introducció de nombres enters
    * @param mensaje Missatge que es dona a l'usuari
    * @return un enter amb el valor
     */
    public static int leerEntero(String mensaje){
        int n= 0;
        boolean aconseguit = false;
        while(!aconseguit){
            try{
                n= Integer.parseInt(leerTexto(mensaje));
                aconseguit=true;
            }
            catch(NumberFormatException ex){}
        }
    }
}


