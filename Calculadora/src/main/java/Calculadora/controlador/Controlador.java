
package Calculadora.controlador;
import Calculadora.logica.LOGICA;
import Calculadora.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controlador implements ActionListener{
 LOGICA programa;
 Vista interfaz;
public Controlador (){};

 public Controlador(LOGICA programa, Vista interfaz) {
        this.programa = programa;
        this.interfaz = interfaz;
        this.interfaz.jsuma.addActionListener(this);
        this.interfaz.jresta.addActionListener(this);
        this.interfaz.jmultiplicacion.addActionListener(this);
        this.interfaz.jdivicion.addActionListener(this);
        this.interfaz.jcos1.addActionListener(this);
        this.interfaz.jsen.addActionListener(this);
        this.interfaz.jtan.addActionListener(this);
        this.interfaz.jasen.addActionListener(this);
        this.interfaz.jacos.addActionListener(this);
        this.interfaz.jatan.addActionListener(this);
         this.interfaz.jlog.addActionListener(this);
 }

 public void inciar(){
     interfaz.setTitle(" modelos calculadora ");
     interfaz.setLocationRelativeTo(null);
 }
   
  @Override
    public void actionPerformed(ActionEvent ae) {
         programa.setA(Integer.parseInt(interfaz.jcaja1.getText()));
         programa.setB(Integer.parseInt(interfaz.jcaja2.getText()));
         JButton boton = (JButton) ae.getSource();
         String op = boton.getText();
   
      switch(op){
         
          case "+": programa.suma(); break;
          case "-": programa.resta(); break;
          case "*": programa.multiplicacion(); break;
          case "/": programa.divicion(); break;
          case "sen": programa.sen(); break;
          case "cos": programa.cos(); break;
          case "tan": programa.tan(); break;
          case "asen": programa.asen(); break;
          case "acos": programa.acos(); break;
          case "atan": programa.atan(); break;
          case "log": programa.logarismo(); break;
         
             }
        interfaz.jigual.setText(String.valueOf(programa.getResultado()));
   
        }
    }

   