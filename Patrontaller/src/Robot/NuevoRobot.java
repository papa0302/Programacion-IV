/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot;

/**
 *
 * @author Intel
 */
public class NuevoRobot extends Robot{

    public NuevoRobot(String tipoderobot,String equipo,String color) {
        super(tipoderobot,equipo,color);
    }

    @Override
    public String getDescripcion() {
       return "maquina: " +tipoderobot+"\n"+"listo para pintar con: "+"\n"+"herramienta: "+equipo+"\n"+"color: "+color;
    }

   

    

    

    
    

     
}
