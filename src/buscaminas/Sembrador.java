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
        
        Random aleatorio=new Random(System.currentTimeMillis());
        int intAleatorio=
                
        
        
        for(Celda[] laFila:misCeldas)
        {
            for(Celda laCelda:laFila)
            {
              
                
                Corazon unCorazon=new Corazon();
                laCelda.setMiCorazon(unCorazon);
            }
        }
    }

    
    
}
