
package Robot;


public class ViejoRobot extends Robot {

    public ViejoRobot(String tipoderobot,String equipo,String color) {
        super(tipoderobot,equipo,color);
    }

    @Override
    public String getDescripcion() {
       return "maquina: " +tipoderobot+"\n"+"listo para pintar con: "+"\n"+"herramienta: "+equipo+"\n"+"color: "+color;
    }

   
    
}
