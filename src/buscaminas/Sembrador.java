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
        int intAleatorio,total=0;
                
        
        
        for(Celda[] laFila:misCeldas)
        {
            for(Celda laCelda:laFila)
            {
              
                intAleatorio=aleatorio.nextInt(10);
                if(intAleatorio>5 && total<cantidad){
                Corazon unCorazon=new Corazon();
                laCelda.setMiCorazon(unCorazon);
                total++;
                }
            }
        }
    }

    
    
}
