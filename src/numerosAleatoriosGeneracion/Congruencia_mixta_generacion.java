package numerosAleatoriosGeneracion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Congruencia_mixta_generacion {


    public static int generacion_a(int valor_m){

        int numero_a = 0;
        Random ran = new Random();

        while(true){

            numero_a = ran.nextInt(valor_m);

            if(numero_a%2 != 0 && numero_a%3 != 0 && numero_a%5 != 0 && (numero_a-1)%4 == 0 ){

                break;

            }


        }

        return numero_a;

    }

    public static int generacion_c(int valor_m){

        
        int numero_c = 0;
        Random ran = new Random();

        while(true){

            numero_c = ran.nextInt(valor_m);

            if(numero_c%8 == 5){

                break;

            }


        }

        return numero_c;

        
    }

    public static int generacion_x(int valor_m){

        int numero_x = 0;
        Random ran = new Random();

        numero_x = ran.nextInt(valor_m);
        return numero_x;
    }

    public static List<String> Mixta_generacion_datos_usuario(int valor_d, int valor_inicial_x){

        ArrayList<String> Numeros_aleatorios = new ArrayList<>();
        int m = (int)(Math.pow(2, valor_d));
        int x = valor_inicial_x;
        int a = generacion_a(m);
        int c = generacion_c(m);
        int numero_aleatorio;

        String numero_y_datos_generacion;

        while (Numeros_aleatorios.size() < m) {

            numero_aleatorio = ( (a*x) + c )% m;

            //System.out.println("m=" + m + " x=" + x + " a=" + a + " c=" + c + " X"+ contador + "=" + numero_aleatorio);
            x = numero_aleatorio;

            numero_y_datos_generacion = m + " " + x + " " + a + " " + c + " " + numero_aleatorio;
            
            Numeros_aleatorios.add(numero_y_datos_generacion);
            
        }

        return Numeros_aleatorios;

    }

    public static List<String> Mixta_generacion_datos_aleatorios(int valor_d){

        ArrayList<String> Numeros_aleatorios = new ArrayList<>();
        int m = (int)(Math.pow(2, valor_d));
        int x = generacion_x(m);
        int a = generacion_a(m);
        int c = generacion_c(m);
        int numero_aleatorio;

        String numero_y_datos_generacion;

        while (Numeros_aleatorios.size() < m) {

            numero_aleatorio = ( (a*x) + c )% m;

            //System.out.println("m=" + m + " x=" + x + " a=" + a + " c=" + c + " X"+ contador + "=" + numero_aleatorio);
            x = numero_aleatorio;

            numero_y_datos_generacion = m + " " + x + " " + a + " " + c + " " + numero_aleatorio;
            
            Numeros_aleatorios.add(numero_y_datos_generacion);
            
        }

        return Numeros_aleatorios;

    }

    /*public static void main(String[] args) {
        
        List<String> m = Congruencia_mixta_generacion.Mixta_generacion_datos_usuario(4, 15);
        List<String> m = Congruencia_mixta_generacion.Mixta_generacion_datos_aleatorios(4);

        for (String string : m) {
            System.out.println(string);
        }


    }*/
    
}
