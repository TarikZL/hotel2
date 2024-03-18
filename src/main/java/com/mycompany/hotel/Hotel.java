package com.mycompany.hotel;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

        Cliente cliente = null;
        Empleado empleado = null;
        Habitacion habitación = null;
        int idCliente;
        int idEmpleado;
        String nombre;
        String apellidos;
        String DNI;
        int numeroTelefono;
        int idHabitacion;
        String tipo;
        int numeroCamas;
        double costePorDia;

        int opcion = 10;

        do {
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Dar de baja a un cliente.");
            System.out.println("3. Registrar empleado.");
            System.out.println("4. Dar de baja a un empleado.");
            System.out.println("5. Agregar nueva habitación.");
            System.out.println("6. Eliminar una habitación.");
            System.out.println("7. Mostrar todos los clientes.");
            System.out.println("8. Mostrar todos los empleados.");
            System.out.println("9. Mostrar todas las habitaciones.");
            System.out.println("10. Salir del programa.");
            System.out.println("Introduce el número de la opcion deseada: ");

            opcion = sca.nextInt();

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
