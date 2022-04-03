package montecarloProblemas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import archivos.*;

public class Revistas {

    /*public static void main(String[] args) {
        ArrayList<String> resultados = procesoRevistas(3);

        for (int i = 0; i < resultados.size()-1; i++) {

            String[] columnas = resultados.get(i).split(" ");

            for (String string : columnas) {
                System.out.println(string);
            }
            System.out.println("-----------------------------------------------------");
        }
        System.out.println(resultados.get(resultados.size()-1));
    }*/
    
    public static  ArrayList<Double> numeros_aleatorios_archivo() {

        ArrayList<Double> numeros = new ArrayList<>();

        ArchivosMetodosGenerales  conexion = new ArchivosMetodosGenerales ();
        conexion.establecer_nombre_archivo("NumerosAleatorios");
        List<String> numeros_version_string = conexion.leer_almacenar_registros();

        for (String string : numeros_version_string) {
            
            numeros.add(Double.parseDouble(string));
        }

        return numeros;
    }

    public static ArrayList<String> procesoRevistas(int cantidad_de_meses) {

        //mezcal los numeros aleatorios
        ArrayList<Double> Numeros_aleatorios = numeros_aleatorios_archivo();

        Collections.shuffle(Numeros_aleatorios);

        ArrayList<String> Resultados = new ArrayList<>();

        double revistas_iniciales = 0;
        double numero_revistas_vendidas_primeros_dias = 0;
        double revistas_sobrantes = 0;
        double revistas_devueltas = 0;
        double revistas_compradas_resto_de_mes = 0;
        double revistas_resto_de_mes = 0;
        double revistas_vendidas_resto_de_mes = 0;
        double revistas_sobrantes_devueltas = 0;
        double ganancia_mes = 0, ganancias_total_meses = 0;

        int contador = 0;

        String senetencia_mandar = "";

        while (contador < cantidad_de_meses) {

            revistas_iniciales = cantidad_revistas_primeros_10_dias(Numeros_aleatorios.get(0)) + cantidad_de_revistas_resto_de_mes(Numeros_aleatorios.get(0));
            
            Collections.shuffle(Numeros_aleatorios);
            
            numero_revistas_vendidas_primeros_dias = cantidad_revistas_primeros_10_dias(Numeros_aleatorios.get(0));

            if(revistas_iniciales < numero_revistas_vendidas_primeros_dias){

                numero_revistas_vendidas_primeros_dias = revistas_iniciales;
            }
            
            revistas_sobrantes = revistas_iniciales - numero_revistas_vendidas_primeros_dias;

            if(revistas_sobrantes > 8){

                revistas_devueltas = revistas_sobrantes - 8;

            }else if(revistas_sobrantes <8){

                int minicontador = 0;
                while(true && minicontador <1000){

                    minicontador ++;
                    Collections.shuffle(Numeros_aleatorios);

                    revistas_compradas_resto_de_mes = cantidad_de_revistas_resto_de_mes(Numeros_aleatorios.get(0));

                    if((revistas_compradas_resto_de_mes+ revistas_sobrantes) <= 8){

                        break;

                    }
                }
                if(minicontador == 1000){

                    revistas_compradas_resto_de_mes = 0;

                }

            }
            revistas_resto_de_mes =  revistas_sobrantes - revistas_devueltas + revistas_compradas_resto_de_mes;
            
            Collections.shuffle(Numeros_aleatorios);

            revistas_vendidas_resto_de_mes = cantidad_de_revistas_resto_de_mes(Numeros_aleatorios.get(0));

            if(revistas_resto_de_mes < revistas_vendidas_resto_de_mes){

                revistas_vendidas_resto_de_mes = revistas_resto_de_mes;

            }

            revistas_sobrantes_devueltas = revistas_resto_de_mes - revistas_vendidas_resto_de_mes;

            ganancia_mes = (revistas_iniciales*1.5*-1) + (numero_revistas_vendidas_primeros_dias*2) 
                            + (revistas_devueltas*0.9) + (revistas_compradas_resto_de_mes*1.2*-1)
                            + (revistas_vendidas_resto_de_mes *2) + (revistas_sobrantes_devueltas*0.6);

            ganancias_total_meses += ganancia_mes;  

            contador ++;

            senetencia_mandar = revistas_iniciales + " " + numero_revistas_vendidas_primeros_dias + " " + revistas_sobrantes + " " + revistas_devueltas + " "
                                + revistas_compradas_resto_de_mes + " " + revistas_resto_de_mes + " " + revistas_vendidas_resto_de_mes + " " + revistas_sobrantes_devueltas + " " + ganancia_mes; 
            Resultados.add(senetencia_mandar);

            
            /*System.out.println("revistas iniciales:"+ revistas_iniciales);
            System.out.println("revistas vendidas primeros dias:" + numero_revistas_vendidas_primeros_dias);
            System.out.println("revistas sobrantes: " + revistas_sobrantes);
            System.out.println("revistas revistas devueltas:" + revistas_devueltas);
            System.out.println("revistas compradas resto de mes:" + revistas_compradas_resto_de_mes);
            System.out.println("revistas resto de mes:" + revistas_resto_de_mes);
            System.out.println("revistas vendidas resto de mes:" + revistas_vendidas_resto_de_mes);
            System.out.println("revistas sobrates resto de mes:" + revistas_sobrantes_devueltas);
            System.out.println("ganancia mes:" + ganancia_mes);
            System.out.println("---------------------------------------------------------------------------------------");*/

        }
        

        Resultados.add(String.valueOf(ganancias_total_meses));

        return Resultados;
   
   
    }

    public static int cantidad_revistas_primeros_10_dias(double numero_aleatotio) {
        //regresa las revistas compradas los primeros 10 dias del mes
        int cantidad_revistas = 0;

        if(numero_aleatotio >= 0 && numero_aleatotio <= 0.05){

            cantidad_revistas = 5; 

        }else if(numero_aleatotio >= 0.0501 && numero_aleatotio <= 0.1){

            cantidad_revistas = 6;

        }else if(numero_aleatotio >= 0.101 && numero_aleatotio <= 0.2){

            cantidad_revistas = 7;

        }else if(numero_aleatotio >= 0.201 && numero_aleatotio <= 0.35){

            cantidad_revistas = 8;

        }else if(numero_aleatotio >= 0.3501 && numero_aleatotio <= 0.6){

            cantidad_revistas = 9;

        }else if(numero_aleatotio >= 0.601 && numero_aleatotio <= 0.85){

            cantidad_revistas = 10;

        }else if(numero_aleatotio >= 0.8501 && numero_aleatotio <= 1){

            cantidad_revistas = 11;

        }

        return cantidad_revistas;

        
    }

    public static int cantidad_de_revistas_resto_de_mes(double numero_aleatotio) {
        //cantidad de revistas que sera vendida el resto del mes

        int cantidad_revistas = 0;

        if(numero_aleatotio >= 0 && numero_aleatotio <= 0.15){

            cantidad_revistas = 4; 

        }else if(numero_aleatotio >= 0.1501 && numero_aleatotio <= 0.35){

            cantidad_revistas = 5;

        }else if(numero_aleatotio >= 0.3501 && numero_aleatotio <= 0.65){

            cantidad_revistas = 6;

        }else if(numero_aleatotio >= 0.6501 && numero_aleatotio <= 0.85){

            cantidad_revistas = 7;

        }else if(numero_aleatotio >= 0.8501 && numero_aleatotio <= 1){

            cantidad_revistas = 8;

        }
        return cantidad_revistas;
        
    }

    

    
}
