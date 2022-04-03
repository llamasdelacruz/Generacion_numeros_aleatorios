
package numerosAleatoriosGeneracion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;


public class Cuadrados_generacion {
    
    public static String colocacion_ceros_izquierda(int numero, int largo_2e){
        //coloca ceros a la izquierda para completar el largo de 2e

        String numero_cadena = String.valueOf(numero);
        String ceros_izquierda = "";
        
        if(numero_cadena.length() < largo_2e){

            while(numero_cadena.length() < largo_2e){

                ceros_izquierda += "0";

                numero_cadena = ceros_izquierda + String.valueOf(numero);
                

            }


        }

        return numero_cadena;
    
    }
    

    public static String extraccion_numero_cadena(String cadena, int largo_e){
       //obtiene el numero que sera la siguiente semilla

        while(cadena.length() != largo_e){

            cadena = cadena.substring(1, cadena.length()-1);
            
        }
       

        return cadena;
        


    }

    public static List<String> cuadrados_generacion_datos_usuario(String semilla_inicial, int cantidad_de_aleatorios){
        //el usuario da los datos para generar los numeros aleatorios
        
        ArrayList<String> Numeros_aleatorios = new ArrayList<>();
        int largo_e = semilla_inicial.length();
        int largo_2e = largo_e*2;
        int semilla = Integer.parseInt(semilla_inicial);
        int semilla_al_cuadrdo;

        double numero_pseudo_aleatorio = 0;
        double  numero_pseudo_aleatorio_anterior;

        String cadena_con_ceros, Numero_aleatorio_cadena;
        String numero_y_datos_generacion;
        
        if(largo_e %2 == 0){
            
            while(Numeros_aleatorios.size()  < cantidad_de_aleatorios ){
                
                numero_pseudo_aleatorio_anterior = numero_pseudo_aleatorio;

                semilla_al_cuadrdo = (int)(Math.pow(semilla, 2));

                cadena_con_ceros = colocacion_ceros_izquierda(semilla_al_cuadrdo,largo_2e);
                
                Numero_aleatorio_cadena = extraccion_numero_cadena(cadena_con_ceros, largo_e);
                
                
                if(Numero_aleatorio_cadena.substring(0, 1).equals("0")){

                    semilla_inicial = "0";

                    while(semilla_inicial.length()%2 != 0){

                    
                        try{
                            semilla_inicial = JOptionPane.showInputDialog("Dame una nueva semilla con un numero de digitos pares:");
                            semilla = Integer.parseInt(semilla_inicial);
                        }catch(Exception e){
                            
                            JOptionPane.showMessageDialog(null, "Debe colocar una semilla valida" +e, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        
    
                    
                    }
                    
                    largo_e = semilla_inicial.length();
                    
                    largo_2e = largo_e*2;
                    
                    
                    
                }else{

                    numero_pseudo_aleatorio = Integer.parseInt(Numero_aleatorio_cadena)/Math.pow(10, largo_e);

                    if(numero_pseudo_aleatorio == numero_pseudo_aleatorio_anterior){


                        semilla_inicial = "0";

                        while(semilla_inicial.length()%2 != 0){

                        
                            try{
                                semilla_inicial = JOptionPane.showInputDialog("Dame una nueva semilla con un numero de digitos pares:");
                                semilla = Integer.parseInt(semilla_inicial);
                            }catch(Exception e){
                                
                                JOptionPane.showMessageDialog(null, "Debe colocar una semilla valida" +e, "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            
        
                        
                        }
                        
                        largo_e = semilla_inicial.length();
                        
                        largo_2e = largo_e*2;

                    
                    }else{

                        numero_y_datos_generacion = semilla +  " " + largo_e + " " + largo_2e + " " + semilla_al_cuadrdo + " " + numero_pseudo_aleatorio ;

                        Numeros_aleatorios.add(numero_y_datos_generacion);
                        
                        semilla = Integer.parseInt(Numero_aleatorio_cadena);

                    }

                    
                
                }
            
            
            }
        
        }
        
        
        
        return Numeros_aleatorios;
        
    }
    
    public static List<String> cuadrados_generacion_datos_aleatorios(int cantidad_de_aleatorios){
        // genera los numeros con datos aleatorios
        
        ArrayList<String> Numeros_aleatorios = new ArrayList<>();
        String semilla_inicial = Semilla_aleatoria();
        int largo_e = semilla_inicial.length();
        int largo_2e = largo_e*2;
        int semilla = Integer.parseInt(semilla_inicial);
        int semilla_al_cuadrdo;
        double numero_pseudo_aleatorio = 0;
        double  numero_pseudo_aleatorio_anterior;
        String cadena_con_ceros, Numero_aleatorio_cadena;
        String numero_y_datos_generacion;
        
        
        if(largo_e %2 == 0){
            
            while(Numeros_aleatorios.size()  < cantidad_de_aleatorios){

                numero_pseudo_aleatorio_anterior = numero_pseudo_aleatorio;

                semilla_al_cuadrdo = (int)(Math.pow(semilla, 2));

                cadena_con_ceros = colocacion_ceros_izquierda(semilla_al_cuadrdo,largo_2e);
                
                Numero_aleatorio_cadena = extraccion_numero_cadena(cadena_con_ceros, largo_e);
                
                
                if(Numero_aleatorio_cadena.substring(0, 1).equals("0")){
                    
                    semilla_inicial = Semilla_aleatoria();
                    
                    semilla  = Integer.parseInt(semilla_inicial);
                    
                    largo_e = semilla_inicial.length();
                    
                    largo_2e = largo_e*2;
                    
                    
                    
                }else{

                    numero_pseudo_aleatorio = Integer.parseInt(Numero_aleatorio_cadena)/Math.pow(10, largo_e);

                    if(numero_pseudo_aleatorio == numero_pseudo_aleatorio_anterior){

                        semilla_inicial = Semilla_aleatoria();
                    
                        semilla  = Integer.parseInt(semilla_inicial);
                        
                        largo_e = semilla_inicial.length();
                        
                        largo_2e = largo_e*2;


                    }else{

                        numero_y_datos_generacion = semilla +  " " + largo_e + " " + largo_2e + " " + semilla_al_cuadrdo + " " + numero_pseudo_aleatorio;

                        Numeros_aleatorios.add(numero_y_datos_generacion);
                        
                        semilla = Integer.parseInt(Numero_aleatorio_cadena);
                    }
                    
                
                }
            
            
            }
        
        }
        
        
        
        return Numeros_aleatorios;
        
    }
    
    public static String Semilla_aleatoria(){
        //genera una semilla aleatorio con next int

        Random ran = new Random();
        //le camie el next int a 100
        String numero = String.valueOf(Math.abs(ran.nextInt(100)));

        while(numero.length()%2 != 0){
            
            numero = String.valueOf(Math.abs(ran.nextInt(100)));
        }
 
        return numero;
        
        
    
    }


    /*public static void main(String[] args) {
        
        
        ///List<String> datos = Cuadrados_generacion.cuadrados_generacion_datos_usuario("7777", 10);
        List<String> datos = Cuadrados_generacion.cuadrados_generacion_datos_aleatorios(10);
        
        for (String cha : datos) {
            System.out.println(cha);            
        }
        
        //System.out.println(Cuadrados_generacion.Semilla_aleatoria());
    }*/






}
