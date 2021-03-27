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
public  class deportiva extends motos implements IAbs{
    private String abs;
    
//    public void cargar(){
//        IAbs iabs = null;
//        this.abs = iabs.abs();
//    }
    public String velocidadMaxima(){
    return "250 km ";
    }
    public String velocidadMinima(){
    return "35 km";
    }

    public String getAbs() {
        return abs;
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
    public String abs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
