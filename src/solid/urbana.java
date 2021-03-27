/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author User
 */
public class urbana extends motos implements IDisco{
   
    private String disco;
//    public void cargar(){
//        IDisco idisco = null;
//        this.disco = idisco.disco();
//    }
    public String velocidadMaxima(){
    return "125 km ";
    }
    public String velocidadMinima(){
    return "30 km";
    }

    public String getDisco() {
        return disco;
    }

    @Override
    public void suspencion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cantidadLlantas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String disco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
