/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mis_notas.txt;

/**
 *
 * @author ADMIN
 */import java.io.*;

public class Mis_notasTxt {

public static void main(String[] args) {

        try {

            // FileWriter nos sirve para crear o abrir un archivo

            FileWriter fw = new FileWriter("mis_notas.txt");

            // PrintWriter nos ayuda a escribir dentro del archivo

            PrintWriter pw = new PrintWriter(fw);
 
            // Escribimos tres líneas de texto en el archivo

            pw.println(" En este periodo de clases aprendi muchas cosas ");

            pw.println(" Como crear un repositorio en GIT HUB. ");

            pw.println(" Realizé codigos de aplicación que no sabía . ");
 
            // finalizamos la ecritura

            pw.close();

            fw.close();
 
            // Mensaje en consola para confirmar

            System.out.println("El archivo fue creado y las notas se guardaron.\n");
 
        } catch (IOException e) {

            // Si ocurre un error al escribir, se muestra aquí

            System.out.println("Error al escribir el archivo: " + e.getMessage());

        }
 
        

        try {

            // Abrimos el archivo para leer su contenido

            BufferedReader br = new BufferedReader(new FileReader("mis_notas.txt"));

            String linea; // Aquí se guardará cada línea leída
 
            System.out.println("Contenido del archivo:\n");
 
            // Leemos cada línea del archivo hasta que no haya más

            while ((linea = br.readLine()) != null) {

                // Mostramos la línea en consola con el prefijo "Nota:"

                System.out.println("Nota: " + linea);

            }
 
            // Cerramos el archivo de lectura

            br.close();
 
        } catch (IOException e) {

            // Si ocurre un error al leer, se muestra aquí

            System.out.println("Error al leer el archivo: " + e.getMessage());

        }

    }

}
