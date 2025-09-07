/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas_programacion;

/**
 *
 * @author User
 */
public class Promedio_Temp {
    
    public static void main(String[] args) {
        
        // Declaro un arreglo con las dos ciudades que tengo en mis datos
        String[] ciudades = {"Quito", "Guayaquil"};
        
        // Creo un arreglo con los días de la semana para organizar mejor los datos
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        // Defino que voy a trabajar con 2 semanas de datos
        int numSemanas = 2;
        
        // Creo mi matriz 3D para almacenar las temperaturas: [ciudad][semana][día]
        
        int[][][] temperaturas = {
            // Temperaturas para Quito 
            {
                {18, 20, 22, 19, 21, 17, 16}, 
                {19, 21, 24, 20, 22, 18, 17}  
            },
            // Temperaturas para Guayaquil
            {
                {28, 30, 32, 29, 31, 27, 26}, 
                {29, 31, 34, 30, 32, 28, 27}  
            }
        };
        
       
        int ciudadSeleccionada = 0; // Cambio este valor para seleccionar otra ciudad
        
        // Muestro el título de mi aplicación
        System.out.println("️ PROMEDIO DE TEMPERATURAS - ECUADOR");
        System.out.println("=====================================");
        System.out.println();
        
        // Muestro información solo de la ciudad seleccionada
        System.out.println(" CIUDAD: " + ciudades[ciudadSeleccionada]);
        
        // Recorro cada semana de la ciudad seleccionada
        for (int s = 0; s < numSemanas; s++) {
            
            System.out.println("Semana " + (s + 1) + ":");
            
            // Muestro las temperaturas de cada día de esta semana
            for (int d = 0; d < dias.length; d++) {
                // Muestro el día y su temperatura correspondiente
                System.out.printf("   %-10s: %2dC%n", dias[d], temperaturas[ciudadSeleccionada][s][d]);
            }
            
            // Inicializo la variable para sumar las temperaturas de esta semana
            double suma = 0;
            
            // Recorro todos los días de esta semana para sumar sus temperaturas
            for (int d = 0; d < dias.length; d++) {
                // Voy sumando cada temperatura del día actual
                suma += temperaturas[ciudadSeleccionada][s][d];
            }
            
            // Calculo el promedio dividiendo la suma total entre el número de días
            double promedio = suma / dias.length;
            
            // Muestro el promedio calculado para esta semana
            System.out.printf("   Promedio Semana %d: %.1fC%n", s + 1, promedio);
            System.out.println();
        }
        
        // Calculo el promedio general de toda la ciudad seleccionada
        double sumaTotal = 0;
        int totalDias = 0;
        
        // Recorro todas las semanas de la ciudad seleccionada
        for (int s = 0; s < numSemanas; s++) {
            // Para cada semana, recorro todos los días
            for (int d = 0; d < dias.length; d++) {
                // Sumo cada temperatura al total general
                sumaTotal += temperaturas[ciudadSeleccionada][s][d];
                // Cuento cada día para el cálculo del promedio
                totalDias++;
            }
        }
        
        
       
        
        
       
    }
}