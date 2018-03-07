/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
class Sembrador {

    void sembrarCorazones(Celda misCeldas[][], int cantidad) {

        Random aleatorio = new Random(System.currentTimeMillis());
        int intAleatorio;
        int total = 0;

        for (Celda[] laFila : misCeldas) {
            for (Celda laCelda : laFila) {

                intAleatorio = aleatorio.nextInt(10);
                if (intAleatorio > 5 && total < cantidad) {
                    Corazon unCorazon = new Corazon();
                    laCelda.setMiCorazon(unCorazon);
                    total++;
                }
            }
        }

    }

    int colocarNumeros(Celda[][] misCeldas, int fila, int columna) {
        int x;
        int y;
        int totalCorazones = 0;

        for (x = -1; x < 2; x++) 
        {
            for (y = -1; y < 2; y++) 
            {
                if 
                {

                    if (misCeldas[fila + x][columna + x].getMiCorazon() != null) 
                    {
                        totalCorazones++;
                    }

                }
            }
        }

        return totalCorazones;
    }
        




    
