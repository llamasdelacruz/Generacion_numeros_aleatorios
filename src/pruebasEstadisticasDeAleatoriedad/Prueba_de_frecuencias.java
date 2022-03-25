package pruebasEstadisticasDeAleatoriedad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import archivos.*;

public class Prueba_de_frecuencias {

    private static ArchivosMetodosGenerales conexionApendiceC = new ArchivosMetodosGenerales();


    public static ArrayList<Double> convertir_arrayList_A_decimales(List<String> listaAnterior){

        ArrayList<Double> Lista_nueva = new ArrayList<Double>();

        for (String numero_aleatorio : listaAnterior) {
            

            Lista_nueva.add(Double.parseDouble(numero_aleatorio)/100);
            
        }


        return Lista_nueva;

    }

    public static float numero_particiones_sacar(Float cantidad_de_numeros){

        float particiones = 10;

        while (particiones >2) {

            if (cantidad_de_numeros%particiones == 0) {

                break;
                
            }
            particiones --;
            
        }

        return particiones;


    }

    public static double[] hacer_cuenta_numero_intervalos(ArrayList<Double> Numeros_aleatorios, float particiones){
        //se hace la frecuencia observada en el intervalo

        double[] FO = new double[(int)particiones];

        double rango_base = 0;
       

        for (double numero : Numeros_aleatorios) {
            
            for (int i = 0; i < particiones; i++) {
            
                //System.out.println(numero + ", rango_base=" + rango_base + ", rango_superior=" + (i+1)/particiones);
                if(numero >= rango_base && numero <= (i+1)/particiones){

                    FO[i] += 1;
                    rango_base = ((i+1)/particiones) + 0.0001;
                    break;
                }
                
                rango_base = ((i+1)/particiones) + 0.0001;
            }
            rango_base = 0;
        }

        

        return FO;
    }


    public static ArrayList<Object> metodo_prueba_de_frecuencias(float valor_error_porcentaje, List<String> Numeros){

        ArrayList<Double> NumerosAleatorios = convertir_arrayList_A_decimales(Numeros);


        float particiones = numero_particiones_sacar( (float) Numeros.size());

        float FE = (float) (Numeros.size()/ particiones);

        double[] FO = Prueba_de_frecuencias.hacer_cuenta_numero_intervalos(NumerosAleatorios,  particiones);
       

        float alfa = valor_error_porcentaje/100;

        ArrayList<Object> Resultados_obtenidos = new ArrayList<Object>();

        conexionApendiceC.establecer_nombre_archivo("ApendiceC");

        List<String> xelevadamenos1 = conexionApendiceC.buscar_registros_o_registro(0, String.valueOf((int)particiones-1));
        
        String[] lista_datos = xelevadamenos1.get(0).split("  ");

        

   
        
        double x0 = 0.0;
        double valorTabla = 0;
        boolean h0 = false;

        
        for (int i = 0; i < particiones; i++) {

            x0 += Math.pow(FO[i]-FE, 2)/FE;
        
        }

        
        
        if (alfa == 0.5f) {
            
            valorTabla = Double.parseDouble(lista_datos[1]);

        }else if (alfa == 0.05f) {
            
            valorTabla = Double.parseDouble(lista_datos[2]);

        }else if (alfa == 0.25f) {
            
            valorTabla = Double.parseDouble(lista_datos[3]);

        }else if (alfa == 0.01f) {
            
            valorTabla = Double.parseDouble(lista_datos[4]);
        }
        

        if(x0 < valorTabla){

            h0 = true;
        }

        
        Resultados_obtenidos.add(x0);
        Resultados_obtenidos.add(valorTabla);
        Resultados_obtenidos.add(h0);

        return Resultados_obtenidos;

    }


    
    /*public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("89", "49", "99", "33", "1");
    

       
        ArrayList<Object> m = Prueba_de_frecuencias.metodo_prueba_de_frecuencias(1f, numerosAleatorios);
        for (Object object : m) {
            System.out.println(object);
        }
       

        //System.out.println(Prueba_de_frecuencias.numero_particiones_sacar(30));


    }*/
    
}
