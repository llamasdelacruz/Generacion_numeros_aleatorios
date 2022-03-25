
package numerosAleatoriosGeneracion;

public class NumerosAleatoriosGeneracion {

    public static void main(String[] args) {
        int contador = 0;
        int m = 16;
        int a = 13;
        int c = 13;
        int x = 15;
        int numero_aleatorio_resutado = 0;
        
        
        
        /*while(contador <= 1000){
            
            contador += 1;
            numero_aleatorio_resutado = ((x*a) + c) % m;
            
            System.out.println("X" + contador + " = " + numero_aleatorio_resutado);
            
            x = numero_aleatorio_resutado;
            contador += 1;
            
            if((contador -1)%4 == 0 && contador%2!= 0 && contador%3 != 0 && contador%5 != 0){
                
                System.out.println(contador);
            
            }


            
            
            
        }*/

        String cadena = "00999900";

        System.out.println(cadena.substring(1, cadena.length()-1) );
        cadena = cadena.substring(1, cadena.length()-1);
        System.out.println(cadena.substring(1, cadena.length()-1));
       
    }
    
}
