package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente Juanito = new Cliente();
        Cliente salome = new Cliente("1010", "Salome", 10, false, 0, 3, "No trabaja", true, "salo123", "123");

        Repartidor gertrudio = new Repartidor();
        Repartidor jhon = new Repartidor("2020", "Jhon", 40, "moto", 3000, 3, "DCT22G", 10, "jhon2", "321");

        Flor eugenio = new Flor();
        Flor poeta = new Flor(1, "clavel", 10, "Floristeria Marta", "azul", false, 100, true, 10000, false);

        Proveedor floristeriaMartha = new Proveedor();
        Proveedor floristeriaJhon = new Proveedor("3030", "Floristeria Jhon", "Jhon", "Mula", "Medellin", 100, 100000, 4, "jhon213", "8282");

        System.out.println(Juanito);
        System.out.println(salome);

        System.out.println(gertrudio);
        System.out.println(jhon);

        System.out.println(floristeriaMartha);
        System.out.println(floristeriaJhon);

        Scanner lea= new Scanner(System.in);

        // Crear un Cliente usando el constructor vacío y llenando datos desde el usuario
        Juanito = new Cliente();
        System.out.print("Ingrese la cédula del cliente: ");
        Juanito.setCedula(lea.nextLine());

        System.out.print("Ingrese el nombre del cliente: ");
        Juanito.setNombre(lea.nextLine());

        System.out.print("Ingrese la edad del cliente: ");
        Juanito.setEdad(lea.nextInt());

        System.out.print("¿El cliente tiene bono? (true/false): ");
        Juanito.setTieneBono(lea.nextBoolean());

        System.out.print("Ingrese el salario del cliente: ");
        Juanito.setSalario(lea.nextInt());

        System.out.print("Ingrese el estrato socioeconómico del cliente: ");
        Juanito.setEstratoSocioeconomico(lea.nextInt());

        lea.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el lugar de trabajo del cliente: ");
        Juanito.setLugarTrabajo(lea.nextLine());

        System.out.print("¿Es recurrente el cliente? (true/false): ");
        Juanito.setEsRecurrente(lea.nextBoolean());

        lea.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el usuario del cliente: ");
        Juanito.setUsuario(lea.nextLine());

        System.out.print("Ingrese la contraseña del cliente: ");
        Juanito.setContraseña(lea.nextLine());

        // Imprimir los datos del cliente ingresado
        System.out.println("\nCliente ingresado: " + Juanito);


        // Crear un Repartidor
        gertrudio = new Repartidor();
        System.out.print("\nIngrese la cédula del repartidor: ");
        gertrudio.setCedula(lea.nextLine());

        System.out.print("Ingrese el nombre del repartidor: ");
        gertrudio.setNombre(lea.nextLine());

        System.out.print("Ingrese la edad del repartidor: ");
        gertrudio.setEdad(lea.nextInt());

        lea.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el tipo de vehículo del repartidor: ");
        gertrudio.setVehiculo(lea.nextLine());

        System.out.print("Ingrese el salario del repartidor: ");
        gertrudio.setSalario(lea.nextInt());

        System.out.print("Ingrese el estrato socioeconómico del repartidor: ");
        gertrudio.setEstratoSocioeconomico(lea.nextInt());

        System.out.print("Ingrese la placa del vehículo: ");
        gertrudio.setPlacaVehiculo(lea.next());

        System.out.print("Ingrese la calificación del repartidor: ");
        gertrudio.setCalificacion(lea.nextInt());

        lea.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el usuario del repartidor: ");
        gertrudio.setUsuario(lea.nextLine());

        System.out.print("Ingrese la contraseña del repartidor: ");
        gertrudio.setContraseña(lea.nextLine());

        // Imprimir los datos del repartidor ingresado
        System.out.println("\nRepartidor ingresado: " + gertrudio);

        // Crear una Flor
        eugenio = new Flor();
        System.out.print("\nIngrese el ID de la flor: ");
        eugenio.setId(lea.nextInt());

        lea.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese la especie de la flor: ");
        eugenio.setEspecie(lea.nextLine());

        System.out.print("Ingrese el número de pétalos: ");
        eugenio.setNumeroPetalos(lea.nextInt());

        System.out.print("Ingrese el nombre de la floristería: ");
        eugenio.setFloristeria(lea.next());

        System.out.print("Ingrese el color de la flor: ");
        eugenio.setColor(lea.next());

        System.out.print("¿La flor tiene espinas? (true/false): ");
        eugenio.setTieneEspinas(lea.nextBoolean());

        System.out.print("Ingrese la cantidad de ventas: ");
        eugenio.setCantidadVentas(lea.nextInt());

        System.out.print("¿Es local la flor? (true/false): ");
        eugenio.setEsLocal(lea.nextBoolean());

        System.out.print("Ingrese el precio de la flor: ");
        eugenio.setPrecio(lea.nextInt());

        System.out.print("¿La flor está en extinción? (true/false): ");
        eugenio.setEnExtincion(lea.nextBoolean());

        // Imprimir los datos de la flor ingresada
        System.out.println("\nFlor ingresada: " + eugenio);

        // Crear un Proveedor
         floristeriaMartha = new Proveedor();
        System.out.print("\nIngrese el NIT del proveedor: ");
        floristeriaMartha.setNIT(lea.nextLine());

        System.out.print("Ingrese el nombre del proveedor: ");
        floristeriaMartha.setNombre(lea.nextLine());

        System.out.print("Ingrese el nombre del representante: ");
        floristeriaMartha.setRepresentante(lea.nextLine());

        System.out.print("Ingrese el medio de transporte: ");
        floristeriaMartha.setMedioTransporte(lea.nextLine());

        System.out.print("Ingrese la locación del proveedor: ");
        floristeriaMartha.setLocacion(lea.nextLine());

        System.out.print("Ingrese la cantidad de flores: ");
        floristeriaMartha.setCantidad(lea.nextInt());

        System.out.print("Ingrese el valor de la flor: ");
        floristeriaMartha.setValorFlor(lea.nextInt());

        System.out.print("Ingrese la calificación del proveedor: ");
        floristeriaMartha.setCalificacion(lea.nextInt());

        lea.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el usuario del proveedor: ");
        floristeriaMartha.setUsuario(lea.nextLine());

        System.out.print("Ingrese la contraseña del proveedor: ");
        floristeriaMartha.setContraseña(lea.nextLine());

        // Imprimir los datos del proveedor ingresado
        System.out.println("\nProveedor ingresado: " + floristeriaMartha);


    }
}






