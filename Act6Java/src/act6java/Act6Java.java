/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Alan Franco
 */
public class Act6Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el nombre del alumno");
        String nom = br.readLine();
        
        System.out.println("Ingrese las 5 calificaciones del alumno '" + nom + "'");
        Double[] cal = new Double[5];
        
        for (int i = 0; i < 5; i++) {
            cal[i] = Double.parseDouble(br.readLine());
        }
        
        Alumno alumno = new Alumno(nom, cal);
        alumno.imprimirCalificacion();

    }

    
}