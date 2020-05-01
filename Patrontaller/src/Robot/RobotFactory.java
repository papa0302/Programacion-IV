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
public class RobotFactory implements RobotFactoryMethod {
    
    
    public RobotFactory() {
    
    }

    @Override
    public Robot Pintar(String tipoderobot,String equipo,String color) {
          if (tipoderobot == "viejo robot"&&equipo=="brocha"&& color==color) {
            return new NuevoRobot(tipoderobot,equipo,color);
          }
          if (tipoderobot == "viejo robot"&&equipo=="rodillo"&&color==color) {
            return new NuevoRobot(tipoderobot,equipo,color);
          }
          if(tipoderobot == "nuevo robot"&&equipo =="aerosol"&&color==color){
              return new NuevoRobot(tipoderobot,equipo,color);
         
          }
        return null;


    }
}
    
    
    

