package com.mycompany.hotel;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que representa un sistema de un hotel
 *
 * @author Tarik Zghari Laaroussi
 * @version 1.0
 */
public class Hotel {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int opcion = 10;

        do {
            Utilidades.lista();

            switch (opcion) {
                case 1:
                    Utilidades.registrarcliente();

                    break;
                case 2:

                    Utilidades.bajadecliente();

                    break;
                case 3:

                    Utilidades.registarempleado();

                    break;
                case 4:
                    Utilidades.bajadeempleado();

                    break;
                case 5:

                    Utilidades.nuevahabitacion();
                    break;
                case 6:

                    Utilidades.borrarhabitacion();

                    break;
                case 7:

                    Utilidades.mostrarcliente();

                    break;
                case 8:

                    Utilidades.mostrarempleado();

                    break;
                case 9:

                    Utilidades.mostrarhabitacion();

                    break;
                case 10:
                    System.out.println("Cerrando el programa...");

                    break;
                default:
                    System.out.println("La opción seleccionada no existe...");
            }
        } while (opcion != 10);
    }

}
