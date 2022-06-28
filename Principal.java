package logica;

import com.sun.tools.javac.Main;
import logica.GestionNotas;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        GestionNotas gnotas= new GestionNotas();
        int op;//opcion elegida por el usuario
        Scanner scanner = new Scanner(System.in);
        double nota;
        do{
            //presentamos menu
            System.out.println("1.- Añadir nota");

            System.out.println("2.- Ver media");
            System.out.println("3.- ver aprobada" );
            System.out.println("4.- Ver Nota Maxima");
            System.out.println("5.- Salir");
            op = Integer.parseInt(scanner.nextLine());
            switch(op) {

                case 1:
                    System.out.println("Introducir la nota: ");
                    nota =Double.parseDouble(scanner.nextLine());
                    gnotas.GuardarNota(nota);
                    break;
                case 2:
                    System.out.println( "media actual: " +gnotas.media());
                    break;
                case 3:
                    System.out.println("Aprobados: "+ gnotas.aprobados());
                case 4:
                    System.out.println("Nota Maxima: "+ gnotas.NumMaximo());
            }

        }while(op!= 5);

    }
}
