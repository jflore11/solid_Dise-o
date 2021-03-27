
package solid;

import java.util.ArrayList;
import java.util.List;

public class Solid {

    public static void main(String[] args) {
        AccionesImplementacion accionesimpl = new AccionesImplementacion();
        AccionesMotos accionesmotos = accionesimpl ;
        
        enduro enduro = new enduro();
        urbana urbana = new urbana();
        deportiva deportiva = new deportiva();
        
        enduro.setAceite("nivel bajo");
        enduro.setColor("roja");
        enduro.setGasolina("nivel alto");
        enduro.setLlantas("bien estado");
        enduro.setMarca("honda");
        enduro.setModelo("2002");
        enduro.setPrecio(4000000);
        
        
        urbana.setAceite("nivel bien");
        urbana.setColor("negra");
        urbana.setGasolina("nivel alto");
        urbana.setLlantas("mal estado");
        urbana.setMarca("tvs");
        urbana.setModelo("2017");
        urbana.setPrecio(6000000);
        
        deportiva.setAceite("nivel bajo");
        deportiva.setColor("verde");
        deportiva.setGasolina("nivel medio");
        deportiva.setLlantas("bien estado");
        deportiva.setMarca("yamaha");
        deportiva.setModelo("2020");
        deportiva.setPrecio(10000000);
        
        List<motos> listaMotos = new ArrayList<>(); 
        listaMotos.add(enduro);
        listaMotos.add(urbana);
        listaMotos.add(deportiva);
        
        accionesmotos.Tecnomecanica(listaMotos);
        accionesmotos.Viajar(listaMotos);
        accionesmotos.conocerVelocidad(listaMotos);
    }
    
}
