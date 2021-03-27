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
public  class enduro extends motos implements ICampana{
    
    private String campana;
     
//    public void cargar(){
//        ICampana icampana = null;
//        this.campana= icampana.Campana();
//    }
    public String velocidadMaxima(){
    return "80 km ";
    }
    public String velocidadMinima(){
    return "20 km";
    }

    public String getCampana() {
        return campana;
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
    public String Campana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
