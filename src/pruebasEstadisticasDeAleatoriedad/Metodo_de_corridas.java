
package pruebasEstadisticasDeAleatoriedad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Metodo_de_corridas {


    public static ArrayList<Integer> convertir_arrayList_A_enteros(List<String> listaAnterior){

        ArrayList<Integer> Lista_nueva = new ArrayList<Integer>();

        for (String numero_aleatorio : listaAnterior) {

            Lista_nueva.add(Integer.parseInt(numero_aleatorio));
            
        }


        return Lista_nueva;

    }


    public static int contar_corridas(ArrayList<Integer> lista_numeros_aleatorios){

        int numero_corridas = 0;
        int numero_actual;
        int numero_anterior = lista_numeros_aleatorios.get(1);
        String estado_actual= "";
        String estado_anterior = "c";

        for (int i = 2; i < lista_numeros_aleatorios.size(); i++) {

            numero_actual = lista_numeros_aleatorios.get(i);

            if(numero_anterior < numero_actual){

                estado_actual = "Ascendente";

            }else if(numero_anterior > numero_actual){

                estado_actual = "Descendente";

            }

            if(!estado_anterior.equals(estado_actual)){
                
                estado_anterior = estado_actual;
                numero_corridas ++;

            }

            numero_anterior = numero_actual;
            
        }





        return numero_corridas;

    }

    public static  ArrayList<Object> proceso_metodo_corridas(float valor_error_porcentaje, List<String> listaNumeros){

        float cantidad_de_numeros_a_evaluar = listaNumeros.size();
        ArrayList<Integer> Lista_numeros_convertida = convertir_arrayList_A_enteros(listaNumeros);
        float numero_de_corridas = contar_corridas(Lista_numeros_convertida);
        
       

        ArrayList<Object> Resultados_obtenidos = new ArrayList<>();

        float valor_alfa = (valor_error_porcentaje/100) /2;

        
        double E = ((2*cantidad_de_numeros_a_evaluar) - 1)/3.0;

        
        double var0 = ((16*cantidad_de_numeros_a_evaluar) - 29)/90.0;
     


        double formula = Math.abs(((numero_de_corridas - E)/Math.sqrt(var0)));
        
        double valor_alfa_menos1 = 1-valor_alfa;

        boolean h0 = false;


        if(valor_alfa <= formula && formula <= valor_alfa_menos1){

            h0 = true;

        }

        Resultados_obtenidos.add(valor_alfa);
        Resultados_obtenidos.add(formula);
        Resultados_obtenidos.add(valor_alfa_menos1);
        Resultados_obtenidos.add(h0);

        return Resultados_obtenidos;

        
    }


    /*public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("89", "49", "99", "33", "1");
        
        //ArrayList<Object> m = Metodo_de_corridas.proceso_metodo_corridas(10f, numerosAleatorios);
        for (Object object : m) {
            System.out.println(object);
        }
       

        //System.out.println(Prueba_de_frecuencias.numero_particiones_sacar(30));


    }*/


    
}