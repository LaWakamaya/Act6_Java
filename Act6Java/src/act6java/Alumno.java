/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6java;

/**
 *
 * @author Alan Franco
 */
public class Alumno {

    String nombre;
    Double[] calificacion = new Double[5];
    
    public Alumno(String nombre, Double[] calificacion){
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    
    
    public Double promedio() {
            Double promedio = (calificacion[0] + calificacion[1] + calificacion[2] + calificacion[3] + calificacion[4]) / 5;
            return promedio;
    }

    public String calificacionL() {
        Double promedio = this.promedio();
        String calificacionL = "";
        if (promedio <= 50) {
            calificacionL = "F";
        }
        if (promedio >= 51 && promedio <= 60) {
            calificacionL = "E";
        }
        if (promedio >= 61 && promedio <= 70) {
            calificacionL = "D";
        }
        if (promedio >= 71 && promedio <= 80) {
            calificacionL = "C";
        }
        if (promedio >= 81 && promedio <= 90) {
            calificacionL = "B";
        }
        if (promedio >= 91 && promedio <= 100) {
            calificacionL = "A";
        }
        return calificacionL;
    }

    public void imprimirCalificacion() {
        System.out.println("Nombre del estudiante: " + this.nombre);
        for (int i = 0; i < 5; i++) {
            System.out.println("Calificacion " + (i+1) + ": " + calificacion[i]);
        }
        System.out.println("Promedio: " + this.promedio());
        System.out.println("Calificación: " + calificacionL());
    }
}
