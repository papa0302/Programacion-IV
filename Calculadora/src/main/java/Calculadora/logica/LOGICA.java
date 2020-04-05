/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.logica;
import java.lang.Math.*;

public class LOGICA {
    double a,b,resultado;
    double  angulo,cos,sen,rad,tan,acos,asen,atan,log;
   
    public LOGICA(){}

    public LOGICA(double a, double b, double resultado, double angulo, double cos, double sen, double rad, double tan, double acos, double asen, double atan) {
        this.a = a;
        this.b = b;
        this.resultado = resultado;
        this.angulo = angulo;
        this.cos = cos;
        this.sen = sen;
        this.rad = rad;
        this.tan = tan;
        this.acos = acos;
        this.asen = asen;
        this.atan = atan;
    }

   

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getCos() {
        return cos;
    }

    public void setCos(double cos) {
        this.cos = cos;
    }

    public double getSen() {
        return sen;
    }

    public void setSen(double sen) {
        this.sen = sen;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getTan() {
        return tan;
    }

    public void setTan(double tan) {
        this.tan = tan;
    }

    public double getAcos() {
        return acos;
    }

    public void setAcos(double acos) {
        this.acos = acos;
    }

    public double getAsen() {
        return asen;
    }

    public void setAsen(double asen) {
        this.asen = asen;
    }

    public double getAtan() {
        return atan;
    }

    public void setAtan(double atan) {
        this.atan = atan;
    }

    public double getLog() {
        return log;
    }

    public void setLog(double log) {
        this.log = log;
    }
   
   
  

   
    public  double suma(){
       this.resultado = this.a+this.b;
            return this.resultado;
              }
   
     public  double resta(){
       this.resultado = this.a-this.b;
            return this.resultado;
              }
     
    public  double multiplicacion(){
       this.resultado = this.a*this.b;
            return this.resultado;
              }
    public  double divicion(){
       this.resultado = this.a/this.b;
            return this.resultado;
             }
   public double radian(){
       this.a = rad;
        this.resultado = Math.toRadians(this.rad);
       return this.resultado;
   }
    public double  sen(){
        if(this.b>=0){
            this.b=0;
            this.sen = Math.sin(this.a);
            this.resultado = this.sen;
        }

      return this.resultado;
    }

     public double  cos(){
        if(this.b>=0){
            this.b=0;
            this.cos = Math.cos(this.a);
            this.resultado = this.cos;
        }

      return this.resultado;
    }
    public double  tan(){
        if(this.b>=0){
            this.b=0;
            this.tan = Math.tan(this.a);
            this.resultado = this.tan;
        }

      return this.resultado;
    }
    
    
    
     public double  asen(){
        if(this.b>=0){
            this.b=0;
            this.asen = Math.asin(this.a);
            this.resultado=this.asen;
        }

      return resultado;
    } 
      public double  atan(){
        if(this.b>=0){
            this.b=0;
            this.atan = Math.atan(this.a);
            this.resultado=this.atan;
        }

      return resultado;
    } 
     public double  acos(){
        if(this.b>=0){
            this.b=0;
            this.acos = Math.cos(this.a);
            this.resultado=this.acos;
        }

      return resultado;
    } 
     
     public double logarismo(){
         this.log = (Math.log10(this.a) / Math.log10(this.b));
            this.resultado=this.log;
                 return this.resultado;
               
     }
     
}

