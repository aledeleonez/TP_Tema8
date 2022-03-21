package tema8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        menu();
        
        int opcion = teclado.nextInt();

        switch(opcion){
            case 1: 
                System.out.println("¿Nombre del jugador 1: ?");
                String nombre1 = teclado.next();
                JugadorGuerra j1 = new JugadorGuerra(nombre1);
                System.out.println("¿Nombre del jugador 2: ?");
                String nombre2 = teclado.next();
                JugadorGuerra j2 = new JugadorGuerra(nombre2);
                j1.setNumFichas(10);
                j2.setNumFichas(10);
                
                do{
                    int dado1 = j1.dado.tirarDado();
                    int dado2 = j2.dado.tirarDado();
                    System.out.println(String.format("%s ha sacado un %d", j1.getNombre(), dado1));
                    System.out.println(String.format("%s ha sacado un %d", j2.getNombre(), dado2));
                    if(dado1 > dado2){
                        System.out.println(String.format("%s gana", j1.getNombre()));
                        j1.numFichas++;
                        j2.numFichas--;
                    }
                    if(dado1 < dado2){
                        System.out.println(String.format("%s gana", j2.getNombre()));
                        j1.numFichas--;
                        j2.numFichas++;
                    }
                    if(dado1 == dado2){
                        System.out.println("Empate");
                    }
                    System.out.println(String.format("Marcador: %s %d || %s %s", j1.getNombre(), j1.getNumFichas(),j2.getNombre(), j2.getNumFichas()));
                    
                }while(j1.getNumFichas() != 0 && j2.getNumFichas() != 0);
                if(j1.getNumFichas() == 20){
                    System.out.println(String.format("%s ha ganado la partida", j1.getNombre()));
                }else{
                    System.out.println(String.format("%s ha ganado la partida", j2.getNombre()));
                }
            case 2: 

        }
        
    }

    private static void menu(){
        System.out.println("Elija que ejercicio quiere ejecutar: ");
        System.out.println("1.- La guerra de los dados");
        System.out.println("2.- Los clientes (Version 2)");
    }
}
