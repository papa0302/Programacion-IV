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
public abstract class  Robot {
    
   public String  tipoderobot;
    public String  equipo;
     public String  color;
   
    public Robot(String tipoderobot,String equipo,String color) {
        this.tipoderobot = tipoderobot;
        this.equipo = equipo;
          this.color = color;
        
    }
    
 public abstract String getDescripcion();
    
    
    
      
    

    
}

    
    
    
    
    
    

