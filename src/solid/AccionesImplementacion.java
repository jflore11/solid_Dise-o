/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.util.List;

/**
 *
 * @author User
 */
public class  AccionesImplementacion implements AccionesMotos {

    @Override
    public void Viajar(List<motos> motosArry){
        System.out.println("vamos a salir de vieja en familia, las motos son: "+motosArry.size());
            System.out.println("    ");
        for (motos object : motosArry){
    
        System.out.println("marca de la moto: "+object.getMarca()+"Modelo de la moto: "+object.getModelo()+"nivel de gasolina: "+object.getGasolina()+"nivel de aceite: "+object.getAceite());
      
        }
          System.out.println("    ");
    }
    @Override
    public void Tecnomecanica(List<motos> motosT){
        System.out.println("vamos a llevar  la moto a la revicion tecnomecanica" + motosT.size());
        System.out.println("");
        for (motos obj : motosT) {
            
            System.out.println("modelo de la moto: "+obj.getModelo()+"marca de la moto"+obj.getMarca()+"nivel de aceite"+obj.getAceite()+"nivel de la llanta: "+obj.getLlantas());
           
        }
         System.out.println("");
    }
    @Override
    public void conocerVelocidad(List<motos> motosV){
        System.out.println("cilindraje de cada moto");
            System.out.println("");
        for (motos objV : motosV) {
        
            System.out.println("velocidad maxima: "+objV.velocidadMaxima()+"velocidad minima: "+objV.velocidadMinima());
          
        }
          System.out.println("");
   
    }
}
